Here is a structured README for your exercise:

---

# Printer Error Rate

In a factory, a printer prints labels for boxes. The printer uses colors represented by letters from **a to m**. A **good control string** contains only these letters, while a **bad control string** contains letters outside this range, indicating potential issues like lack of colors or technical malfunctions.

Your task is to write a function that calculates the error rate of the printer. The error rate is defined as the number of characters in the string that are outside the valid range **a to m**, divided by the total length of the control string. The result should be returned as a string in the form of a rational fraction (numerator/denominator).

### Task:

Write a function `printer_error` that takes a string `s` and returns the error rate in the form of a string representing the fraction of errors over the total length of the string.

- The numerator of the fraction should represent the number of "errors" (characters outside of the valid range `a to m`).
- The denominator should represent the length of the string.

### Examples:

1. **Input**: `"aaabbbbhaijjjm"`  
   **Output**: `"0/14"`  
   Explanation: All characters are valid (a to m), so the error rate is 0.

2. **Input**: `"aaaxbbbbyyhwawiwjjjwwm"`  
   **Output**: `"8/22"`  
   Explanation: There are 8 invalid characters (`x`, `y`, `h`, `w`, `w`, `w`, `w`, `w`), so the error rate is 8 errors out of 22 characters.

### Notes:

- The input string `s` has a length greater than or equal to 1.
- The string contains only lowercase English letters.
- The valid characters are limited to `a to m`, so characters outside this range are considered errors.

```plaintext
The input string `s` has a length greater than or equal to 1.
The string contains only lowercase English letters.
The valid characters are limited to `a to m`, so characters outside this range are considered errors.
```

### Function Structure:

```java
public class Printer {
    
    public static String printerError(String s) {
        // your code here
    }
}
```
