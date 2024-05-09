#!/bin/bash
read -p "introduce un numero y te digo su tabla de multiplicar: " num1

for ((i=1; i<=10; i++)) do
    mult=$((num1*i))
    echo $num1 " * " $i " es " $mult
done
