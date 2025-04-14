import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Decompose {

  // Initiates decomposition of n*n *_*
  public String decompose(long n) {
    // Start recursive search for sequence for n*n, with elements < n
    List<Long> resultSequence = findSequenceRecursive(n * n, n);

    if (resultSequence == null || resultSequence.isEmpty()) {
      return null;
    }

    // Format result to space-separated string :D
    return resultSequence.stream().map(String::valueOf).collect(Collectors.joining(" "));
  }

  // Finds a strictly increasing sequence for targetSum with elements < maxVal :p
  private List<Long> findSequenceRecursive(long targetSum, long maxVal) {
    if (targetSum == 0) {
      return new ArrayList<>();
    }
    // invalid path if targetSum is negative or no valid numbers can be chosen :d
    if (targetSum < 0 || maxVal <= 0) {
      return null;
    }

    long startNum = Math.min(maxVal - 1, (long) Math.sqrt(targetSum));
    for (long currentNum = startNum; currentNum >= 1; currentNum--) {
      long currentSquare = currentNum * currentNum;
      
      // Recurse for remaining sum with elements < currentNum :3
      List<Long> subSequence = findSequenceRecursive(targetSum - currentSquare, currentNum);

      if (subSequence != null) {
        // add currentNum (maintains increasing order) and return *u*
        subSequence.add(currentNum);
        return subSequence;
      }
    }
    // No sol. :(
    return null;
  }
}