# echo "Enter First Number"
# read Num1
# echo "Enter Second Number"
# read Num2
# if [ $Num1 -lt $Num2 ] 
# then
#     echo "First Is Smole"
# else
#     echo "Second Is Smole"
# fi


echo "Enter Number "
read Num1
if [ $((Num1%2)) -eq 0 ] 
then
    echo "Number is Even"
else    
    echo "Number is Odd"
fi