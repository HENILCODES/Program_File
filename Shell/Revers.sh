read -p "Enter Name : " a
len=${#a}
echo "Number $len"

for((i=$len;i>=0;i--))
do
    reverse = "substr($len,$i,0)"
done
echo $reverse