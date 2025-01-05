# Detect Pangram

## Description

A **pangram** is a sentence that contains every single letter of the alphabet at least once. For example:

- The sentence `"The quick brown fox jumps over the lazy dog"` is a pangram because it uses the letters `A-Z` at least once (case is irrelevant).

### Task

Write a function that detects whether a given string is a pangram. The function should:

- Return `True` if the string is a pangram.
- Return `False` if it is not.
- Ignore numbers and punctuation.

---

## Examples

```plaintext
Input: "The quick brown fox jumps over the lazy dog"
Output: True

Input: "Hello World"
Output: False
```

### Function Structure:

```php
function detect_pangram($string) { 
  #your code here
  }
