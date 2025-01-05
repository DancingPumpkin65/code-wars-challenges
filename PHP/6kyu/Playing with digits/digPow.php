<?php
function digPow($n, $p) {
    $digits = str_split((string) $n);
    $sum = 0;
    
    foreach ($digits as $digit) {
        $sum += pow($digit, $p);
        $p++;
    }
    
    if ($sum % $n == 0) {
        return $sum / $n;
    } else {
        return -1;
    }
}
?>