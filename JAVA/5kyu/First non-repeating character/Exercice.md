# First Non-Repeating Character

Write a function named `first_non_repeating_letter` that takes a string input and returns the first character that is not repeated anywhere in the string.

### Rules:

1. **Case Insensitivity**: Uppercase and lowercase letters are considered the same character for determining repetition.
   - However, the function should return the correct case of the first non-repeating character as it appears in the original string.

2. **Return Empty String**: If the string contains all repeating characters, the function should return an empty string (`""`).

3. **Unicode Support**: Ensure your function works with any Unicode character.

---

## Examples:

```text
Input: 'stress'
Output: 't'

Input: 'sTreSS'
Output: 'T'

Input: 'aabbcc'
Output: ''
```

### Requirements

- Input is a string of any length (including an empty string).
- The function should handle a mix of uppercase, lowercase, and Unicode characters.

---

## Function Structure:

```java
public class Kata {
  public static String firstNonRepeatingLetter(String s){
    // Your code here
    return "";
  }
}
