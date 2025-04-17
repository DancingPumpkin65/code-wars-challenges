# How many are smaller than me II?

This is a hard version of <a href='https://www.codewars.com/kata/56a1c074f87bc2201200002e'>How many are smaller than me?</a>. If you have troubles solving this one, have a look at the easier kata first.

Write

```javascript
function smaller(arr)
```

that given an array `arr`, you have to return the amount of numbers that are smaller than `arr[i]` to the right.

For example:

```javascript
smaller([5, 4, 3, 2, 1]) === [4, 3, 2, 1, 0]
smaller([1, 2, 0]) === [1, 1, 0]
```

---

## Function Structure:

```java
public class Smaller {
	
	public static int[] smaller(int[] unsorted) {
		return new int[] {};
	}
}
