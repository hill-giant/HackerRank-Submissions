<?php

// Complete the countingValleys function below.
function countingValleys($n, $s) {
    $valleys = 0;
    $level = 0;
    $arr = str_split($s);

    for ($i = 0; $i < count($arr); $i++) {
        if ($arr[$i] == 'U') {
            $level++;
        } else {
            if ($level == 0) {
                $valleys++;
            }
            $level--;
        }
    }

    return $valleys;
}

$fptr = fopen(getenv("OUTPUT_PATH"), "w");

$stdin = fopen("php://stdin", "r");

fscanf($stdin, "%d\n", $n);

$s = '';
fscanf($stdin, "%[^\n]", $s);

$result = countingValleys($n, $s);

fwrite($fptr, $result . "\n");

fclose($stdin);
fclose($fptr);

