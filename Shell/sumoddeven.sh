read -p "Enter " path

for((i=1;i<=$path;i++))
do
    if [ $((i%2)) -eq 0 ]
    then
        even=`expr $even + $i`
    else
        odd=`expr $odd + $i`
    fi
done
echo $even
echo $odd