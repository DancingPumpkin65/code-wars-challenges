# Get the Middle Character

You are given a non-empty string. Your task is to return the middle character(s) of the string based on the following rules:

1. If the string's length is **odd**, return the single middle character.
2. If the string's length is **even**, return the middle two characters.

---

### Examples:

```text
"test"    --> "es"
"testing" --> "t"
"middle"  --> "dd"
"A"       --> "A"
```

## Requirements

- The input will always be a non-empty string.
- The output must adhere to the rules stated above.

---

## Function Structure:

```java
class Kata {
  public static String getMiddle(String word) {
    // Code goes here!
  }
}
