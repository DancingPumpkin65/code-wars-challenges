package cw;

import java.util.Arrays;
import java.util.Comparator;

public class Interval {

    public static int sumIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        // Sort intervals by their start points :)
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int totalLength = 0;
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];

            // Check if intervals overlap :o
            if (currentInterval[1] >= nextInterval[0]) {
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } else {
                totalLength += currentInterval[1] - currentInterval[0];
                currentInterval = nextInterval;
            }
        }

        // Add the length of the last interval :/
        totalLength += currentInterval[1] - currentInterval[0];

        return totalLength;
    }
}