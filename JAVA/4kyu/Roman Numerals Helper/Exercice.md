# Roman Numerals Helper

This project provides two functions for converting between Roman numerals and integer values. The functions follow the standard rules of modern Roman numeral notation.

### Rules:
- Roman numerals are written by expressing each digit separately from left to right.
- A numeral representing a smaller value placed before a larger value indicates subtraction (e.g., `IV` = 4, `IX` = 9).
- A numeral representing a smaller value placed after a larger value indicates addition (e.g., `VI` = 6, `XII` = 12).
- The input range is restricted to `1 ≤ n < 4000`.
- The numeral `IIII` is **not** used; instead, `IV` represents 4.

---

## Examples:

#### Converting from integer to Roman numeral (`toRoman`):
```plaintext
2000 -> "MM"
1666 -> "MDCLXVI"
  86 -> "LXXXVI"
   1 -> "I"
```

#### Converting from Roman numeral to integer (`fromRoman`):
```plaintext
"MM"      -> 2000
"MDCLXVI" -> 1666
"LXXXVI"  ->   86
"I"       ->    1
```

### Roman Numeral Values

```plaintext
+--------+-------+
| Symbol | Value |
+--------+-------+
|    M   |  1000 |
|   CM   |   900 |
|    D   |   500 |
|   CD   |   400 |
|    C   |   100 |
|   XC   |    90 |
|    L   |    50 |
|   XL   |    40 |
|    X   |    10 |
|   IX   |     9 |
|    V   |     5 |
|   IV   |     4 |
|    I   |     1 |
+--------+-------+
```

---

## Function Structure:

```java
public class RomanNumerals {

    public static String toRoman(int n) {
        return "I";
    }
    
    public static int fromRoman(String romanNumeral) {
        return 1;
    }
}
