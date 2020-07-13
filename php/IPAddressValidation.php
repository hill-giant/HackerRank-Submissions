<?php
$ipv4_regex = "/^([0-1]?[0-9]?[0-9]|2[0-5]{2})(\.[0-1]?[0-9]?[0-9]|\.2[0-5]{2}){3}$/";
$ipv6_regex = "/^[0-9a-f]{1,4}(:[0-9a-f]{1,4}){7}$/";

$_fp = fopen("php://stdin", "r");
/* Enter your code here. Read input from STDIN. Print output to STDOUT */
$test_string = fgets($_fp);
while (!feof($_fp) and ($test_string = fgets($_fp)) !== false)
{
    if (preg_match($ipv4_regex, $test_string, $out))
    {
        echo "IPv4";
    }
    else if (preg_match($ipv6_regex, $test_string, $out))
    {
        echo "IPv6";
    }
    else
    {
        echo "Neither";
    }
    echo "\n";
}
?>

