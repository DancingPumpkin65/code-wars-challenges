# Snail Sort

Given an `n x n` array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.

---

## Examples:

```text
array = [[1,2,3],
         [4,5,6],
         [7,8,9]]
snail(array) #=> [1,2,3,6,9,8,7,4,5]
```

For better understanding, please follow the numbers of the next array consecutively:

```text
array = [[1,2,3],
         [8,9,4],
         [7,6,5]]
snail(array) #=> [1,2,3,4,5,6,7,8,9]
```

This image will illustrate things more clearly:

<img src="https://cdn.discordapp.com/attachments/917298820012998666/1337592714040049765/image.png?ex=67a801ca&is=67a6b04a&hm=c9175f78bde318728e5ec6e458624677f50d1e82c1d058faa50f14b43724914e&" width="100%">

**NOTE:** The idea is not sort the elements from the lowest value to the highest; the idea is to traverse the 2-d array in a clockwise snailshell pattern.

**NOTE 2:** The 0x0 (empty matrix) is represented as en empty array inside an array `[[]]`.

---

## Function Structure:

```java
public class Snail {

    public static int[] snail(int[][] array) {
      // Your code here
   } 
}
