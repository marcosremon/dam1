#!/bin/bash
num1=$1
if [ $# -ne 1 ]; then
   echo "Error: Debes pasar un numero como argumento."
   exit 1
elif [ $num1 -gt 100 ]; then
   echo "El numero es mayor a 100"
else
   echo "El numero es menor o igual a 100"
fi
