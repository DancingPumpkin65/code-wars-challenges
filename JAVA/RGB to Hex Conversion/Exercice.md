Here’s the README for your exercise:

---

# RGB to Hexadecimal Conversion

The task is to complete the `rgb` function, which converts RGB decimal values to their hexadecimal representation. RGB decimal values are expected to be in the range of **0 to 255**. Values outside this range should be rounded to the nearest valid value (e.g., 300 becomes 255, and -10 becomes 0).

### Requirements:

- The output should always be a 6-character long hexadecimal string.
- The shorthand 3-character hex format (e.g., `#FFF`) is not allowed.
- Ensure all hexadecimal letters are uppercase.

### Examples:

```plaintext
Input: 255, 255, 255  
Output: "FFFFFF"

Input: 255, 255, 300  
Output: "FFFFFF"

Input: 0, 0, 0  
Output: "000000"

Input: 148, 0, 211  
Output: "9400D3"
```

### Notes:

1. Each of the RGB values should be individually converted to hexadecimal.
2. Ensure that the hexadecimal representation for each value is always 2 characters long. For example:
   - Decimal `0` should be `00`.
   - Decimal `255` should be `FF`.
   - Decimal `148` should be `94`.

### Function Structure:

```java
public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        // your code here
        return null;
    }
}
```

### Constraints:

- Inputs will always be integers.

---

This README is designed to provide clear instructions for completing the `rgb` function.