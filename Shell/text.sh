echo "Enter Number "
read a

	echo "Number is $a"
while [ $a -lt 10 ] 
# do
#     echo $a
#     if [ $a -eq 5 ] 
#     then
#         break 
#     fi
#     a=`expr $a + 1`
# done
i=1
while [ $i -lt 10]
do
	if [ $a -gt 0 ]
	then
		 echo "Positive"
	elif [ $a -lt 0 ]
	then
		 echo "Negative"
	else
		 echo "Zero"
	fi
i=`expr $i+1`
if [ $a -eq 00 ]
then
	break
fi
done
