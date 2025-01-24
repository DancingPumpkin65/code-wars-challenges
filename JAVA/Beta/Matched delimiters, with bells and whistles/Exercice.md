# Matched Delimiters with Bells and Whistles

Your task is to verify if a given string has appropriately matched delimiters, considering the specified rules for delimiters, quoting, and escaping.

### Parameters:

1. **`input`**: A string containing the input to be parsed.
2. **`left`**: A string listing the left delimiters.
3. **`right`**: A string listing the matching right delimiters. It has the same length and order as `left`.
4. **`quote`**: A character that specifies a quoting character.
5. **`escape`**: A character that specifies that the next character is escaped.

- `left` and `right` contain distinct characters with no overlaps.
- `quote` and `escape` are not present in `left` or `right`.

### Delimiter Matching Rules:

A string's delimiters are considered matched if:
- Each opening delimiter has a corresponding closing delimiter.
- The content inside each matching pair is either empty or itself appropriately matched.

---

#### Valid Examples:
Assuming `left = "(["` and `right = ")]"`:
```text
foo
(foo)
f(oo)
[(fs([s]s)aa)a]
```

#### Invalid Examples:
With the same assumptions:
```text
foo)
(foo
(foo]
a(foo[bar)baz]z
```

### Quoting Rules

The quoting character is used to both open and close a quote. Quotes cannot be nested. Within a quote:
- Delimiters do not affect the matching process.
- Quoted strings must have both opening and closing quotes.

#### Valid Examples:
```text
"("
("[")
("sf")
```

#### Invalid Examples:
With the same assumptions:
```text
(")"
"a
dsa"
ssa"asdga
```

### Escaping Rules:

The escape character allows the next character to be ignored. Two consecutive escape characters represent a literal escape.

#### Valid Examples:
Assuming `quote = "` and `escape = \`:
```text
()\)
"a\"a"
(a\"b)\"d
```

#### Invalid Examples
- Dangling escape:
  ```
  MatchedDelim.valid("abc*", "([", ")]", '#', '*') // false
  ```
- Double-escape:
  ```
  MatchedDelim.valid("abc**", "([", ")]", '#', '*') // true
  ```

### Performance:

The input string can be up to 125,000 characters long. Ensure your implementation is efficient and handles edge cases correctly.

---

## Function Structure:

```java
public class MatchedDelim{
  public static boolean valid(String input, String left, String right, char quote, char escape){
    // Happy coding!
  }
}
