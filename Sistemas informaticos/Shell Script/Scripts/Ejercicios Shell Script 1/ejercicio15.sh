#!/bin/bash
num1=$1
num2=$2

if [ $num1 -eq $num2 ]; then
    echo "el numero 1 '$num1' y el numero '$num2' son iguales"
elif [ $num1 -gt $num2 ]; then
    echo "el numero 1 '$num1' es mayor que el numero 2 '$num2'"
else
    echo "el numero 2 '$num2' es mayor que el numero 1 '$num1'"
fi

