public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        // Clamp and convert values directly without using a helper method :)
        return toHex(r) + toHex(g) + toHex(b);
    }

    private static String toHex(int value) {
        // Clamp value between 0 and 255, then convert to a 2-character hex string ;)
        if (value < 0) value = 0;
        if (value > 255) value = 255;
        return String.format("%02X", value);
    }
}