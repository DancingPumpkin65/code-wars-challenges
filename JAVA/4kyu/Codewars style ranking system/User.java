public class User {
    private static final int[] RANKS = {-8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8};
    private int rankIndex;
    public int rank;
    public int progress;

    public User() {
        this.rankIndex = 0; // Corresponds to -8 in RANKS :/
        this.rank = RANKS[rankIndex];
        this.progress = 0;
    }

    public void incProgress(int activityRank) {
        if (!isValidRank(activityRank)) {
            throw new IllegalArgumentException("Invalid rank value");
        }
        if (rank == 8) return; // No progress beyond rank 8 -_-
        
        int activityIndex = getRankIndex(activityRank);
        int d = activityIndex - rankIndex;
        int gainedProgress = 0;
        
        if (d == 0) {
            gainedProgress = 3;
        } else if (d == -1) {
            gainedProgress = 1;
        } else if (d > 0) {
            gainedProgress = 10 * d * d;
        }
        
        updateProgress(gainedProgress);
    }

    private void updateProgress(int gainedProgress) {
        progress += gainedProgress;
        while (progress >= 100 && rankIndex < RANKS.length - 1) {
            progress -= 100;
            rankIndex++;
            rank = RANKS[rankIndex];
            if (rank == 8) {
                progress = 0;
                break;
            }
        }
    }

    private boolean isValidRank(int r) {
        for (int validRank : RANKS) {
            if (validRank == r) return true;
        }
        return false;
    }

    private int getRankIndex(int r) {
        for (int i = 0; i < RANKS.length; i++) {
            if (RANKS[i] == r) return i;
        }
        throw new IllegalArgumentException("Invalid rank");
    }
}