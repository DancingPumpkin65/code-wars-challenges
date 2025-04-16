import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static int pinValue(char pinChar) {
        if (pinChar == 'X') return 10;
        return Character.getNumericValue(pinChar);
    }

    public static int bowling_score(String framesStr) {
        String[] gameFrameStrings = framesStr.split(" ");
        List<Integer> rolls = new ArrayList<>();

        // Parse frame strings into a flat list of rolls :D
        for (int i = 0; i < 10; i++) {
            String frameChars = gameFrameStrings[i];
            if (i < 9) { // Frames 1-9 :/
                if (frameChars.equals("X")) {
                    rolls.add(10);
                } else if (frameChars.charAt(1) == '/') {
                    int firstRoll = pinValue(frameChars.charAt(0));
                    rolls.add(firstRoll);
                    rolls.add(10 - firstRoll);
                } else {
                    rolls.add(pinValue(frameChars.charAt(0)));
                    rolls.add(pinValue(frameChars.charAt(1)));
                }
            } else { // 10th Frame --
                for (char c : frameChars.toCharArray()) {
                    if (c == 'X') {
                        rolls.add(10);
                    } else if (c == '/') {
                        // '/' in 10th frame means 10 minus the previous roll of this frame *-*
                        rolls.add(10 - rolls.get(rolls.size() - 1));
                    } else {
                        rolls.add(pinValue(c));
                    }
                }
            }
        }

        int totalScore = 0;
        int rollCursor = 0; 
        
        for (int frame = 0; frame < 10; frame++) {
            if (frame < 9) { // Frames 1-9: bonuses apply :3
                if (rolls.get(rollCursor) == 10) { // Strike :O
                    totalScore += 10 + rolls.get(rollCursor + 1) + rolls.get(rollCursor + 2);
                    rollCursor++; 
                } else if (rolls.get(rollCursor) + rolls.get(rollCursor + 1) == 10) { // Spare :O
                    totalScore += 10 + rolls.get(rollCursor + 2);
                    rollCursor += 2;
                } else { // Open frame :O
                    totalScore += rolls.get(rollCursor) + rolls.get(rollCursor + 1);
                    rollCursor += 2;
                }
            } else { // 10th Frame: sum its rolls, no further bonuses :3
                while (rollCursor < rolls.size()) {
                    totalScore += rolls.get(rollCursor);
                    rollCursor++;
                }
            }
        }
        return totalScore;
    }
}