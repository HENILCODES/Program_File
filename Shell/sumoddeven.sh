# read -p "Enter " path

# for((i=1;i<=$path;i++))
# do
#     if [ $((i%2)) -eq 0 ]
#     then
#         echo "Even"
#     else
#         echo "odd"
#     fi
# done | sort | uniq -c

# echo "Enter a number"
# read num

# sum=0

# while [ $num -gt 0 ]
# do
#     mod=$((num % 10))    #It will split each digits
#     echo mod $mod
#     sum=$((sum + mod))   #Add each digit to sum
#     echo sum $sum
#     num=$((num / 10))    #divide num by 10.
#     echo num $num
# done

# echo $sum



echo "enter"
read num
rev=0
even=0
odd=0
while [ $num -gt 0 ]
do
tmp=$(( $num % 10 ))
if(( $tmp % 2 == 0 ))
then
even=$(( $even + $tmp ))
else
odd=$(( $odd + $tmp ))
fi
rev=$(( $rev * 10 + $tmp ))
num=$(( $num / 10 ))
done
echo the sum of even number $even
echo the sum of odd number $odd