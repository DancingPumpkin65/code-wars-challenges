# Vigenère Cipher Helper:

The Vigenère cipher is a classic cipher originally developed by Italian cryptographer Giovan Battista Bellaso and published in 1553. It is named after a later French cryptographer Blaise de Vigenère, who had developed a stronger autokey cipher (a cipher that incorporates the message of the text into the key).

The cipher is easy to understand and implement, but survived three centuries of attempts to break it, earning it the nickname "le chiffre indéchiffrable" or "the indecipherable cipher."

[From Wikipedia](https://en.wikipedia.org/wiki/Vigenère_cipher):

> _"The Vigenère cipher is a method of encrypting alphabetical text by using a series of different Caesar ciphers based on the letters of a keyword. It is a simple form of polyalphabetic substitution._
> 
> _..._
> 
> _In a Caesar cipher, each letter of the alphabet is shifted along some number of places; for example, in a Caesar cipher of shift 3, A would become D, B would become E, Y would become B, and so on. The Vigenère cipher consists of several Caesar ciphers in sequence with different shift values."_

Assume the key is repeated for the length of the text, character by character. Note that some implementations repeat the key over characters only if they are part of the alphabet -- **this is not the case here**.

The shift is derived by applying a Caesar shift to a character with the corresponding index of the key in the alphabet.

Visual representation:
```text
"my secret code i want to secure"  // message
"passwordpasswordpasswordpasswor"  // key
```

Write a class that, when given a key and an alphabet, can be used to encode and decode from the cipher.

## Example:

```java
var alphabet = 'abcdefghijklmnopqrstuvwxyz';
var key = 'password';

// creates a cipher helper with each letter substituted
// by the corresponding character in the key
var c = new VigenèreCipher(key, alphabet);

c.encode('codewars'); // returns 'rovwsoiv'
c.decode('laxxhsj');  // returns 'waffles'
```

Any character not in the alphabet must be left as is. For example (following from above):

```java
c.encode('CODEWARS'); // returns 'CODEWARS'
```

---

## Function Structure:

```java
public class VigenereCipher {

  public VigenereCipher(String key, String abc) {
    //...
  }
  
  public String encode(String str) {
    //...
    return "";
  }
  
  public String decode(String str) {
    //...
    return "";
  }
}
