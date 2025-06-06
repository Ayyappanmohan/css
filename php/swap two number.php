<?php
$a = 10;
$b = 20;

$c = $a;
$a = $b;
$b = $c;

echo "after the swap <br>";
echo "a = " .$a "b = ".$b;