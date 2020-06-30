#!/bin/bash
Compilejavafiles(){
	javac -d ./classes/ -cp ./classes/ $1
	echo "compile file sucessfully"
}
for javafile in `find . -type f -name "*.java"`
do
	echo $javafile
	Compilejavafiles $javafile
done
