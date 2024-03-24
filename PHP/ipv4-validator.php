<?php
function isValidIP(string $str): bool
{
    // Check if the string matches the IPv4 format ^^
    if (!preg_match('/^(\d{1,3})\.(\d{1,3})\.(\d{1,3})\.(\d{1,3})$/', $str, $matches)) {
        return false;
    }
    
    // Check if each octet is valid :/
    foreach (array_slice($matches, 1) as $octet) {
        if (!filter_var($octet, FILTER_VALIDATE_INT, ['options' => ['min_range' => 0, 'max_range' => 255]])) {
            return false;
        }
        
        // Check for leading zeros :0
        if ($octet !== '0' && $octet[0] === '0') {
            return false;
        }
    }
    
    return true;
}
?>
