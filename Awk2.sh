awk '{sum=($2+$3+$4)/3; print $1  " : " ((sum>50) ? "Pass" : "Fail") }'
