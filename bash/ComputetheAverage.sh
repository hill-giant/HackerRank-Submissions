#!/bin/bash

read n
sum=0

for ((i=0; i<n; i++))
do
    read val
    ((sum+=$val))
done

average=$(echo "scale=4; ($sum)/$n" | bc -l)

if [[ $sum -gt 0 ]]
then
    average=$average+0.0005
elif [[ $sum -lt 0 ]]
then
    average=$average-0.0005
fi

average=$(echo "scale=3; ($average)/1"  | bc -l)
echo $average

