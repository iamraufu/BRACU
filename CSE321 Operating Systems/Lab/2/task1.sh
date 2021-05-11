#!/bin/bash
echo "Enter your income: "
read income
t1=240000
t2=300000
t3=180000
taxcount=0
tmax=$(($t1+$t2+$t3))
tmid=$(($t1+$t2))
taxmax=66000
taxmid=30000
if [ $income -lt $t1 ];
 then echo "Tax Free"
fi
if [ $income -gt $tmax ];
 then maxRestCount=$(($income-$tmax))
 taxcount=$(($maxRestCount*3/10+$taxmax))
 echo "$taxcount"
elif [ $income -gt $tmid ];
 then midRestCount=$(($income-$tmid))
 taxcount=$(($midRestCount*2/10+$taxmid))
 echo "$taxcount"
elif [ $income -gt $t1 ];
 then RestCount=$(($income-$t1))
 taxcount=$(($RestCount*1/10))
 echo "$taxcount"
fi
