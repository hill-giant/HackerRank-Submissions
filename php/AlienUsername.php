<?php
$regex_pattern = "/^(_|\.)[0-9]+[a-zA-Z]*(_)?$/";
$_fp = fopen("php://stdin", "r");
/* Enter your code here. Read input from STDIN. Print output to STDOUT */
$test_string = fgets($_fp);
while (($test_string = fgets($_fp)) !== false)
{
    if (preg_match($regex_pattern, $test_string, $out))
    {
        echo "VALID";
    }
    else
    {
        echo "INVALID";
    }
    echo "\n";
}
fclose($_fp)
?>

