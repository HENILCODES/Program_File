while true 
do
    echo "Enter Number "
    read a
    
    if [ $a -gt 0 ]
	then
		 echo "\t Positive"
	elif [ $a -lt 0 ]
	then
		 echo "Negative"
    elif [ $a -eq 0 ]
    then
		 echo "Zero"
	else
        echo "Good by"
        break;
	fi
done
