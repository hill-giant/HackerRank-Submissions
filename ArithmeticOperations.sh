read input
declare rounding

if [ $(($input)) -gt 0 ]
then
    input=$input+0.0005
else
    input=$input-0.0005
fi
output=$(echo "scale=4; $input" | bc -l)
output=$(echo "scale=3; $output/1" | bc -l)
echo $output
