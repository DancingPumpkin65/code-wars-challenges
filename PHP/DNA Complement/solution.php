<?php
function DNA_strand($dna) {
    // Convert the DNA string into an array of characters
    $dna0 = str_split($dna);
    
    // Iterate over each character in the DNA array
    for ($i = 0; $i < count($dna0); $i++) {
        // Replace each character with its complement
        $dna0[$i] = ($dna0[$i] == "A") ? "T" : (($dna0[$i] == "T") ? "A" : (($dna0[$i] == "C") ? "G" : (($dna0[$i] == "G") ? "C" : $dna0[$i])));
    }
    
    return implode('', $dna0);
}
?>
