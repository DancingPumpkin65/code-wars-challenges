# Format Input Data to Two Decimal Floats

### Problem Description:
You are given an input string that represents a number. Your task is to format the number into a float with exactly **two decimal places**. Additionally, you must **round the number using the round half up (ceil) method**.

If the provided value is `null`, it should be treated as `0.0`.

The challenge is to optimize a poorly coded solution. If your solution matches the expected results and is faster by at least **150 nanoseconds** than the given code for each test, you will succeed.

### Requirements:
- Format the number to two decimal places.
- Use **round half up (ceil)** when rounding.
- If the input is `null`, treat it as `0.0`.

### Examples:

Input
```plaintext
0
```
Output
```plaintext
0.00
```

Input
```plaintext
null
```
Output
```plaintext
0.00
```

Input
```plaintext
0.005
```
Output
```plaintext
0.01
```

### Notes:
- The input will always be a string representing a number or `null`.
- The output must be a string representing the number rounded to two decimal places.

### Function Structure:

```java
public class NumberFormatting{
  public static String formatValue(String data) {
        // your code here
        return data;
    }
}
```
