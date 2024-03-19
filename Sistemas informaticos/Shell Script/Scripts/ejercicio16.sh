#!/bin/bash
num1=$1
num2=$2
num3=$3
if [ $num1 -gt $num2 -a $num1 -gt $num2 ]; then
    echo "el numero mas grande es el numero 1: '$num1'"
elif [ $num2 -gt $num1 -a $num2 -gt $num3 ]; then
    echo "el numero mas grande es el numero 2: '$num2'"
else
    echo "el numero mas grande es el numero 3: '$num3'"
fi
