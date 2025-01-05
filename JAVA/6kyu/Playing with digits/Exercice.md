# DigPow Algorithm

Some numbers have funny properties. For example:

- `89 --> 8¹ + 9² = 89 * 1`
- `695 --> 6² + 9³ + 5⁴ = 1390 = 695 * 2`
- `46288 --> 4³ + 6⁴ + 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51`

Given two positive integers \( n \) and \( p \), we want to find a positive integer \( k \), if it exists, such that the sum of the digits of \( n \) raised to consecutive powers starting from \( p \) is equal to \( k \times n \).

In other words, writing the consecutive digits of \( n \) as \( a, b, c, d, \dots \), is there an integer \( k \) such that:

<a href="javascript:void(0)">a<sup>p</sup> + b<sup>p+1</sup> + c<sup>p+2</sup> + d<sup>p+3</sup> + ...</a> = n * k

If it is the case, we will return \( k \), if not return \(-1\).

---

## Examples:

- `n = 89; p = 1 ---> 1` since 8<sup>1</sup> + 9<sup>2</sup> = 89 = 89 * 1
- `n = 92; p = 1 ---> -1` since there is no k such that 9<sup>1</sup> + 2<sup>2</sup> equals 92 * k
- `n = 695; p = 2 ---> 2` since 6<sup>2</sup> + 9<sup>3</sup> + 5<sup>4</sup> = 1390 = 695 * 2
- `n = 46288; p = 3 ---> 51` since 4<sup>3</sup> + 6<sup>4</sup> + 2<sup>5</sup> + 8<sup>6</sup> + 8<sup>7</sup> = 2360688 = 46288 * 51

### Notes:
- \( n \) and \( p \) will always be strictly positive integers.

---

## Function Structure:

```java
public class DigPow {

	public static long digPow(int n, int p) {
		// your code
    return -1;
	}
	
}
