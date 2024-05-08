#!/bin/bash
num1=$1
num2=$2
if [ $# -ne 2 ]; then
   echo "Error: Debes pasar dos numeros como argumentos."
   exit
else
    suma=$((num1+num2))
    echo "la suma es: $suma"
fi
