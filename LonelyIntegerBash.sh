rm out_file
read
array=($(cat))
for i in ${array[*]}
do
    echo $i >> out_file
done
sort out_file | uniq -u
