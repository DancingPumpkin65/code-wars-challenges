<?php
function high($x) {
    // Split the input string into words
    $words = explode(" ", $x);
    
    // Calculate scores for each word
    $scores = [];
    foreach ($words as $word) {
        $score = 0;
        for ($i = 0; $i < strlen($word); $i++) {
            // Calculate the score for each letter in the word
            $score += ord($word[$i]) - ord('a') + 1;
        }
        // Store the score for the current word
        $scores[$word] = $score;
    }
    
    // Find the highest scoring word
    $highestScore = max($scores);
    $highestScoringWord = array_search($highestScore, $scores);
    
    return $highestScoringWord;
}
?>
