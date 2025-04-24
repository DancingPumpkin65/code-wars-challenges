# Prime Streaming (PG-13)

Create an endless stream of prime numbers - a bit like `IntStream.of(2,3,5,7,11,13,17)`, but infinite. The stream must be able to produce a million primes in a few seconds.

If this is too easy, try <a href='https://www.codewars.com/kata/prime-streaming-nc-17/'>Prime Streaming (NC-17)</a>.

---

## Function Structure:

```java
import java.util.stream.IntStream;

public class Primes {
  public static IntStream stream() {
    return IntStream.of(2, 3, 5, 7, 11, 13, 17);
  }
}
