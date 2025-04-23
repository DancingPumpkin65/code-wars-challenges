public class Spiralizor {

    public static int[][] spiralize(int size) {
        int[][] spiral = new int[size][size];

        if (size == 0) {
            return new int[0][0];
        }
        
        // Fill the top row :O
        for (int j = 0; j < size; j++) {
            spiral[0][j] = 1;
        }

        int r = 0;
        int c = size - 1;

        int currentSegmentLength = size - 1;

        while (currentSegmentLength > 0) {
            // eins: move down ↓
            for (int i = 0; i < currentSegmentLength; i++) {
                r++;
                if (r < size) { 
                    spiral[r][c] = 1;
                } else {
                    return spiral; 
                }
            }

            // zwei: move left ←
            int leftMoves = currentSegmentLength;
            if (currentSegmentLength == 1 && (size % 4 == 2)) {
                leftMoves = 0;
            }
            for (int i = 0; i < leftMoves; i++) {
                c--;
                if (c >= 0) {
                    spiral[r][c] = 1;
                } else {
                    return spiral; 
                }
            }

            currentSegmentLength -= 2;
            if (currentSegmentLength <= 0) {
                break;
            }

            // drei: move up ↑
            for (int i = 0; i < currentSegmentLength; i++) {
                r--;
                if (r >= 0) {
                    spiral[r][c] = 1;
                } else {
                    return spiral;
                }
            }

            // vier: move right →
            int rightMoves = currentSegmentLength;
            if (currentSegmentLength == 1 && (size % 4 == 0)) {
                rightMoves = 0;
            }
            for (int i = 0; i < rightMoves; i++) {
                c++;
                if (c < size) {
                    spiral[r][c] = 1;
                } else {
                    return spiral;
                }
            }
            
            currentSegmentLength -= 2;
        }

        return spiral;
    }
}