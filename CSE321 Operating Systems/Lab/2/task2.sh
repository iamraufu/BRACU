echo "Enter file name:\c"
read fname
if [ - $fname ]
then	
	if [ -w $fname ]	
		then		
			echo "Type name to append. To quit pres ctrl+d."
		cat >> $fname	
	else		
		echo "You do not have permission to write."	
	fi
fi