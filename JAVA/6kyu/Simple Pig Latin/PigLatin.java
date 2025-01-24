import java.util.stream.Collectors;
import java.util.Arrays;

public class PigLatin {
    public static String pigIt(String str) {
        return Arrays.stream(str.split(" "))
                .map(word -> {
                    if (word.matches("[a-zA-Z]+")) {
                        return word.substring(1) + word.charAt(0) + "ay";
                    } else {
                        return word;
                    }
                })
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("Hello world !"));
    }
}