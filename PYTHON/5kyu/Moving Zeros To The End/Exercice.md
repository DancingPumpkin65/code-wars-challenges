# Move Zeros to The End

The task is to write a function that takes an array and moves all the zeroes to the end while preserving the order of the other elements.

## Requirements:

1. The function should move all `0` elements in the array to the end.
2. The order of all other elements should remain unchanged.
3. Non-numeric `0` (e.g., `false`) should not be moved.

---

## Example:

```plaintext
moveZeros([false,1,0,1,2,0,1,3,"a"]) // returns[false,1,1,2,1,3,"a",0,0]
```

### Notes:

- Only the number `0` (zero) is considered for moving.
- Non-numeric values like `false` or `"0"` should remain in their original positions.

---

## Function Structure:

```python
def move_zeros(arr)
  # your code here
  return lst
