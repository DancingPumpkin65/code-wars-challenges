import java.util.*;

public class Smaller {

    public static int[] smaller(int[] arr) {
        int n = arr.length;
        if (n == 0) return new int[0];

        // compress values :o
        Set<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);
        List<Integer> vals = new ArrayList<>(set);
        Collections.sort(vals);
        Map<Integer,Integer> rank = new HashMap<>();
        for (int i = 0; i < vals.size(); i++) {
            rank.put(vals.get(i), i + 1);
        }

        int m = vals.size();
        int[] bit = new int[m + 1];
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int r = rank.get(arr[i]);
            res[i] = query(bit, r - 1);
            update(bit, r, 1, m);
        }

        return res;
    }

    private static void update(int[] bit, int i, int v, int m) {
        while (i <= m) {
            bit[i] += v;
            i += i & -i;
        }
    }

    private static int query(int[] bit, int i) {
        int s = 0;
        while (i > 0) {
            s += bit[i];
            i -= i & -i;
        }
        return s;
    }
}