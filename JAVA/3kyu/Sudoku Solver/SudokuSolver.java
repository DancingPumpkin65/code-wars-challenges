public class SudokuSolver {

    public static int[][] sudoku(int[][] puzzle) {
        solve(puzzle);
        return puzzle;
    }

    private static boolean solve(int[][] b) {
        // find next empty cell :w
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (b[r][c] == 0) {
                    // try digits 1–9 :B
                    for (int v = 1; v <= 9; v++) {
                        if (ok(b, r, c, v)) {
                            b[r][c] = v;
                            if (solve(b)) return true; // move on if success :3
                            b[r][c] = 0;               // backtrack :z
                        }
                    }
                    return false;  // no valid digit found :/
                }
            }
        }
        return true;
    }

    private static boolean ok(int[][] b, int r, int c, int v) {
        // row & column check :S
        for (int i = 0; i < 9; i++) {
            if (b[r][i] == v || b[i][c] == v) return false;
        }
        // 3×3 block check :)
        int sr = (r / 3) * 3, sc = (c / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (b[sr + i][sc + j] == v) return false;
            }
        }
        return true;
    }
}