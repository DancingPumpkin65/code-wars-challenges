import java.util.stream.IntStream;
import java.util.function.IntSupplier;

public class Primes {
  public static IntStream stream() {
    return IntStream.generate(new IntSupplier() {
      private int currentPotentialPrime = 1; // start before the first prime (2) :/

      @Override
      public int getAsInt() {
        currentPotentialPrime = findNextPrime(currentPotentialPrime);
        return currentPotentialPrime;
      }

      private int findNextPrime(int after) {
        int num = after + 1;
        if (num <= 2) return 2; // first prime is 2 :D
        if (num % 2 == 0) num++; // ensure we start checking from an odd number if num > 2 :3
        
        while (true) {
          if (isPrime(num)) {
            return num;
          }
          num += 2; // check only odd numbers :R
        }
      }

      private boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true; // 2 and 3 are prime :p
        if (number % 2 == 0 || number % 3 == 0) return false; // divisible by 2 or 3 -_-

        // check from 5 onwards, with steps of 6 (i.e., 6k ± 1) :E
        // all primes greater than 3 are of the form 6k ± 1 :8
        for (int i = 5; i * i <= number; i = i + 6) {
          if (number % i == 0 || number % (i + 2) == 0) {
            return false;
          }
        }
        return true;
      }
    });
  }
}