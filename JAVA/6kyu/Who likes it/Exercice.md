# Who Likes It?

## Instructions:

You probably know the "like" system from Facebook and other platforms. People can "like" blog posts, pictures, or other items. In this exercise, you will create a function that generates the display text corresponding to the list of people who like an item.

## Task:

Implement a function that takes an array of names (strings) representing the people who like an item. The function should return a string in the format specified below:

---

### Examples:

```
[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
```

## Notes:

- The input array can have any length, including zero.
- Make sure your implementation covers all the specified cases.

---

## Function Structure:

```java
class Solution {
    public static String whoLikesIt(String... names) {
        //Do your magic here
        return "";
    }
}
