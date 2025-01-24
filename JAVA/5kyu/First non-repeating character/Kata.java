import java.util.HashMap;
import java.util.Map;

public class Kata {
  public static String firstNonRepeatingLetter(String s) {
    // Handle edge case where the input string is empty x_x
    if (s == null || s.isEmpty()) {
      return "";
    }

    // Use a HashMap to count the occurrences of each character :0
    Map<Character, Integer> charCountMap = new HashMap<>();

    String lowerCaseStr = s.toLowerCase();

    // Count the occurrences of each character in the lowercase version of the string :/
    for (int i = 0; i < lowerCaseStr.length(); i++) {
      char c = lowerCaseStr.charAt(i);
      charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
    }

    // Find the first character in the original string whose lowercase version occurs only once -_-
    for (int i = 0; i < s.length(); i++) {
      char originalChar = s.charAt(i);
      char lowerCaseChar = lowerCaseStr.charAt(i);
      if (charCountMap.get(lowerCaseChar) == 1) {
        return String.valueOf(originalChar);
      }
    }

    return "";
  }
}