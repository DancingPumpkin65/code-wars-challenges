<?php
function isValidIP(string $str): bool
{
    // Check if the string matches the IPv4 format :)
    if (!preg_match('/^(0|[1-9]\d?|1\d\d|2[0-4]\d|25[0-5])\.(0|[1-9]\d?|1\d\d|2[0-4]\d|25[0-5])\.(0|[1-9]\d?|1\d\d|2[0-4]\d|25[0-5])\.(0|[1-9]\d?|1\d\d|2[0-4]\d|25[0-5])$/', $str)) {
        return false;
    }
    
    return true;
}
?>