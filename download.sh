#!/bin/bash
nano ./temp.list


while read -r line; do
	myurl = "$line"
	if [[$myurl =~ "https://twitter.com/"]]	;then
		echo "Line from twitter $line"
	else 
		echo "Line not from tw"
	fi
done < ./temp.list

