echo "Enter a number: "
read num

i=$num

result=$num

while [ $result != 1 ] && [ $result != 4 ]
do
  sum=0
  rem=0
while [ $result -gt 0 ]
do
  rem=$(($result % 10))
  result=$(($result / 10))
  p=$(($rem * $rem))
  sum=$(($sum + $p))
done
result=$sum
done

if [ $result -eq 1 ];

then echo "Happy Number! :)"

elif [ $result -eq 4 ];

then echo "Not a Happy Number! :("

fi