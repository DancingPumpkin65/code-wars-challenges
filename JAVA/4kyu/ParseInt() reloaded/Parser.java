public class Parser {

    public static int parseInt(String numStr) {
        // Convert to lowercase and replace ' and ' and hyphens with spaces :/
        String processed = numStr.toLowerCase()
                                .replaceAll("\\s+and\\s+|-", " ")
                                .trim();
        if (processed.isEmpty()) {
            return 0;
        }
        String[] words = processed.split("\\s+");
        
        int result = 0;
        int current = 0;
        
        for (String word : words) {
            switch (word) {
                case "hundred":
                    current *= 100;
                    break;
                case "thousand":
                    result += current * 1000;
                    current = 0;
                    break;
                case "million":
                    result += current * 1_000_000;
                    current = 0;
                    break;
                default:
                    current += getWordValue(word);
            }
        }
        return result + current;
    }

    private static int getWordValue(String word) {
        switch (word) {
            case "zero":    return 0;
            case "one":     return 1;
            case "two":     return 2;
            case "three":   return 3;
            case "four":    return 4;
            case "five":    return 5;
            case "six":     return 6;
            case "seven":   return 7;
            case "eight":   return 8;
            case "nine":    return 9;
            case "ten":     return 10;
            case "eleven":  return 11;
            case "twelve":  return 12;
            case "thirteen": return 13;
            case "fourteen": return 14;
            case "fifteen": return 15;
            case "sixteen": return 16;
            case "seventeen": return 17;
            case "eighteen": return 18;
            case "nineteen": return 19;
            case "twenty":  return 20;
            case "thirty":  return 30;
            case "forty":   return 40;
            case "fifty":   return 50;
            case "sixty":   return 60;
            case "seventy": return 70;
            case "eighty":  return 80;
            case "ninety":  return 90;
            default:
                throw new IllegalArgumentException("Invalid number word: " + word);
        }
    }
}