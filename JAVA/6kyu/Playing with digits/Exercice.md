# DigPow Algorithm

Some numbers have funny properties. For example:

- `89 --> 8¹ + 9² = 89 * 1`
- `695 --> 6² + 9³ + 5⁴ = 1390 = 695 * 2`
- `46288 --> 4³ + 6⁴ + 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51`

Given two positive integers \( n \) and \( p \), we want to find a positive integer \( k \), if it exists, such that the sum of the digits of \( n \) raised to consecutive powers starting from \( p \) is equal to \( k \times n \).

In other words, writing the consecutive digits of \( n \) as \( a, b, c, d, \dots \), is there an integer \( k \) such that:

\[
a^p + b^{p+1} + c^{p+2} + d^{p+3} + \dots = n \times k
\]

If it is the case, we will return \( k \), if not return \(-1\).

### Examples:

- `n = 89; p = 1 ---> 1` since \( 8^1 + 9^2 = 89 = 89 \times 1 \)
- `n = 92; p = 1 ---> -1` since there is no \( k \) such that \( 9^1 + 2^2 \) equals \( 92 \times k \)
- `n = 695; p = 2 ---> 2` since \( 6^2 + 9^3 + 5^4 = 1390 = 695 \times 2 \)
- `n = 46288; p = 3 ---> 51` since \( 4^3 + 6^4 + 2^5 + 8^6 + 8^7 = 2360688 = 46288 \times 51 \)

### Notes:
- \( n \) and \( p \) will always be strictly positive integers.

### Function Structure:

```java
public class DigPow {
    public static long digPow(int n, int p) {
        // your code
        return -1;
    }
}
