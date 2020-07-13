awk '{avg=($2+$3+$4)/3; print $0, ":", (avg<50)?"FAIL":(avg<60)?"C":(avg<80)?"B":"A"}'
