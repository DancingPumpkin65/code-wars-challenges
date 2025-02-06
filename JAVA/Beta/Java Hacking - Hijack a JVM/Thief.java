import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;

import net.bytebuddy.agent.ByteBuddyAgent;

public class Thief {

    /**
     * Hijacks a target JVM given by its pid, retrieves the security code from the
     * Burglary$Target class, and returns it as a String.
     *
     * This implementation uses a temporary file to communicate the result from the target.
     */
    public String guessSecurityCode(final String pid) throws Exception {
        // Create a temporary file that the agent will write the security code into.
        File tmpFile = File.createTempFile("securityCode", ".txt");
        tmpFile.deleteOnExit();

        // Create the temporary agent jar file.
        File agentJar = createAgentJar();

        // Attach the agent to the target JVM, passing the temp file's path as agent arguments.
        ByteBuddyAgent.attach(agentJar, pid, tmpFile.getAbsolutePath());

        // Wait for the agent to write the security code (up to 5 seconds).
        long timeout = System.currentTimeMillis() + 5000;
        while (System.currentTimeMillis() < timeout && tmpFile.length() == 0) {
            Thread.sleep(100);
        }

        // Read the code from the file.
        String code = new String(Files.readAllBytes(tmpFile.toPath()), StandardCharsets.UTF_8).trim();
        if (code.isEmpty()) {
            throw new IllegalStateException("Agent failed to set the security code");
        }
        return code;
    }

    /**
     * Creates a temporary jar file that contains the Agent class.
     */
    private File createAgentJar() throws IOException {
        File jarFile = File.createTempFile("agent", ".jar");
        jarFile.deleteOnExit();

        Manifest manifest = new Manifest();
        Attributes attr = manifest.getMainAttributes();
        attr.put(Attributes.Name.MANIFEST_VERSION, "1.0");
        // Set the Agent-Class attribute to point to our Agent class.
        attr.put(new Attributes.Name("Agent-Class"), Agent.class.getName());
        attr.put(new Attributes.Name("Can-Redefine-Classes"), "true");

        try (JarOutputStream jos = new JarOutputStream(new FileOutputStream(jarFile), manifest)) {
            String classResource = Agent.class.getName().replace('.', '/') + ".class";
            JarEntry entry = new JarEntry(classResource);
            jos.putNextEntry(entry);

            try (InputStream is = Agent.class.getClassLoader().getResourceAsStream(classResource)) {
                if (is == null) {
                    throw new IOException("Could not find " + classResource);
                }
                byte[] buffer = new byte[1024];
                int len;
                while ((len = is.read(buffer)) != -1) {
                    jos.write(buffer, 0, len);
                }
            }
            jos.closeEntry();
        }
        return jarFile;
    }

    /**
     * This agent class is loaded into the target JVM. Its agentmain method is called
     * upon attachment. It reads the private static field 'securityCode' from the
     * Burglary$Target class and writes it to the file whose path is passed in agentArgs.
     */
    public static class Agent {
        public static void agentmain(String agentArgs, Instrumentation inst) throws Exception {
            // Locate the target class
            Class<?> target = Class.forName("Burglary$Target");
            Field field = target.getDeclaredField("securityCode");
            field.setAccessible(true);
            String code = (String) field.get(null);

            // Write the code to the file whose path is provided in agentArgs.
            try (FileWriter writer = new FileWriter(agentArgs)) {
                writer.write(code);
            }
        }
    }
}
