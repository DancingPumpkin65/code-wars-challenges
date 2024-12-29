function detect_pangram($string) {
    $lowerString = strtolower($string);
    foreach (range('a', 'z') as $letter) {
        if (!str_contains($lowerString, $letter)) {
            return false;
        }
    }
    return true;
}