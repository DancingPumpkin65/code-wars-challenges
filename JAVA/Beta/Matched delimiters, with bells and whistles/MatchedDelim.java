import java.util.*;

public class MatchedDelim {
    public static boolean valid(String input, String left, String right, char quote, char escape) {
        Stack<Character> stack = new Stack<>();
        boolean inQuote = false;
        int inputLength = input.length();

        for (int i = 0; i < inputLength; i++) {
            char current = input.charAt(i);

            // Handle escape character -_*
            if (current == escape) {
                if (i + 1 < inputLength) {
                    i++; 
                    continue;
                } else {
                    return false; 
                }
            }

            // Handle quotes :/
            if (current == quote) {
                inQuote = !inQuote;
                continue;
            }

            if (inQuote) {
                continue; 
            }

            // Handle opening delimiters :0
            int leftIndex = left.indexOf(current);
            if (leftIndex != -1) {
                stack.push(current);
                continue;
            }

            // Handle closing delimiters -o-
            int rightIndex = right.indexOf(current);
            if (rightIndex != -1) {
                if (stack.isEmpty() || stack.peek() != left.charAt(rightIndex)) {
                    return false;
                }
                stack.pop();
                continue;
            }
        }

        // At the end, ensure no dangling quotes or unmatched delimiters *-*
        return !inQuote && stack.isEmpty();
    }
}