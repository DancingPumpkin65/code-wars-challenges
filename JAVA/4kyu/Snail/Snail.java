public class Snail {
    public static int[] snail(int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return new int[0];
        }

        int n = array.length;
        int[] result = new int[n * n];
        int index = 0;
        int layers = (n + 1) / 2;

        for (int layer = 0; layer < layers; layer++) {
            int top = layer;
            int bottom = n - 1 - layer;
            int left = layer;
            int right = n - 1 - layer;

            // Copy top row from left to right o_O
            System.arraycopy(array[top], left, result, index, right - left + 1);
            index += right - left + 1;

            // Copy right column from top+1 to bottom E_e
            for (int i = top + 1; i <= bottom; i++) {
                result[index++] = array[i][right];
            }

            if (top < bottom) {
                // Copy bottom row from right-1 to left O_o
                for (int i = right - 1; i >= left; i--) {
                    result[index++] = array[bottom][i];
                }

                // Copy left column from bottom-1 to top+1 if needed e_E
                if (left < right) {
                    for (int i = bottom - 1; i > top; i--) {
                        result[index++] = array[i][left];
                    }
                }
            }
        }

        return result;
    }
}