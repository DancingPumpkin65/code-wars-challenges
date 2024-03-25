<?php
function DNA_strand($dna) {
    $dna0 = str_split($dna);
    for ($i = 0; $i < count($dna0); $i++) {
        $dna0[$i] = ($dna0[$i] == "A") ? "T" : (($dna0[$i] == "T") ? "A" : (($dna0[$i] == "C") ? "G" : (($dna0[$i] == "G") ? "C" : $dna0[$i])));
    }
    return implode('', $dna0);
}
?>
