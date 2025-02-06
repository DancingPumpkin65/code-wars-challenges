# Java Hacking: Hijack a JVM

Your task is to hijack a different JVM with a given PID and extract a security code as a String.

The class which holds the security code looks like this:

```java
public class Burglary$Target {

    private static String securityCode;
}
```

In the validation text cases you need to pass 3 times in a row.

Inspired by [jcsahnwaldt](https://www.codewars.com/users/jcsahnwaldt)'s [Hack-22](https://www.codewars.com/kata/5510caecaacf801f820002ac) and many other fun Katas on Codewars. If you like hacking challenges as much as i do check out this [Collection](https://www.codewars.com/collections/hacking).

**Hint:** Take a look at the [ByteBuddy](https://bytebuddy.net/#/) library which is available in the Kata environment.

---

## Function Structure:

```java
import java.util.*;
public class Thief {
  public String guessSecurityCode(final String pid) throws Exception {
    // Have fun :)
    return "0000";
  }
}
