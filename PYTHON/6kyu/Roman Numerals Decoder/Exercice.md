# Roman Numeral to Integer Conversion

Create a function that takes a Roman numeral as its argument and returns its value as a numeric decimal integer. You don't need to validate the form of the Roman numeral.

## Roman Numerals Encoding
Modern Roman numerals are written by expressing each decimal digit of the number to be encoded separately, starting with the leftmost digit and skipping any 0s. For example:

- `1990` → `"MCMXC"` (1000 = M, 900 = CM, 90 = XC)
- `2008` → `"MMVIII"` (2000 = MM, 8 = VIII)
- `1666` → `"MDCLXVI"` (Uses each letter in descending order)

---

## Examples:

```plaintext
"MM"      -> 2000
"MDCLXVI" -> 1666
"M"       -> 1000
"CD"      ->  400
"XC"      ->   90
"XL"      ->   40
"I"       ->    1
```

### Help:

```plaintext
Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000
```

---

## Function Structure:

```python
def solution(roman: str) -> int:
    # complete the solution by transforming the roman numeral into an integer
    return 1
