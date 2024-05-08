#!/bin/bash
num1=$1
if [ $# -ne 1 ]; then
   echo "Error: Debes pasar un numero como argumento."
   exit 1
else
   echo "introdujiste el parametro: "$num1
fi
