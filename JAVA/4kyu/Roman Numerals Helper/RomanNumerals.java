public class RomanNumerals {

    private static final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    
    // Converts an integer to a Roman numeral ._.
    // Uses a StringBuilder for efficient string concatenation "-"
    // Iterates through the VALUES and SYMBOLS arrays, appending the corresponding Roman numeral symbols while subtracting the value from n U_U
    public static String toRoman(int n) {
        if (n < 1 || n >= 4000) {
            throw new IllegalArgumentException("Input must be between 1 and 3999.");
        }
  
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < VALUES.length; i++) {
            while (n >= VALUES[i]) {
                roman.append(SYMBOLS[i]);
                n -= VALUES[i];
            }
        }
        return roman.toString();
    }
    
    // Converts a Roman numeral to an integer ?_?
    // Processes the input string in chunks of 1 or 2 characters to handle both single and double-character symbols :)
    // Uses the indexOfSymbol method to find the index of the symbol in the SYMBOLS array and adds the corresponding value to the result :D
    public static int fromRoman(String romanNumeral) {
        if (romanNumeral == null || romanNumeral.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty.");
        }
  
        int result = 0;
        int i = 0;
        while (i < romanNumeral.length()) {
            String currentSymbol = romanNumeral.substring(i, Math.min(i + 2, romanNumeral.length()));
            int symbolIndex = indexOfSymbol(currentSymbol);
            if (symbolIndex != -1) {
                result += VALUES[symbolIndex];
                i += 2;
            } else {
                currentSymbol = romanNumeral.substring(i, i + 1);
                symbolIndex = indexOfSymbol(currentSymbol);
                if (symbolIndex != -1) {
                    result += VALUES[symbolIndex];
                    i += 1;
                } else {
                    throw new IllegalArgumentException("Invalid Roman numeral: " + romanNumeral);
                }
            }
        }
        return result;
    }
  
    // Helper method to find the index of a symbol in the SYMBOLS array. Returns -1 if the symbol is not found *_*
    private static int indexOfSymbol(String symbol) {
        for (int i = 0; i < SYMBOLS.length; i++) {
            if (SYMBOLS[i].equals(symbol)) {
                return i;
            }
        }
        return -1;
    }
}