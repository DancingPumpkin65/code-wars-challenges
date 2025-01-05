public class Printer {
    
    public static String printerError(String s) {
        long errorCount = s.chars()
                           .filter(c -> c < 'a' || c > 'm')
                           .count();
        return errorCount + "/" + s.length();
    }

    public static void main(String[] args) {
        System.out.println(printerError("aaabbbbhaijjjm")); // "0/14"
        System.out.println(printerError("aaaxbbbbyyhwawiwjjjwwm")); // "8/22"
    }
}