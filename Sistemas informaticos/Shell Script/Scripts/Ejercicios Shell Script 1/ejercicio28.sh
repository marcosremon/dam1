#!/bin/bash

num1=$1
num2=$2

opciones() {
    echo "1. Sumar"
    echo "2. Restar"
    echo "3. Dividir"
    echo "4. Multiplicar"
    echo "0. Salir"
}

suma() {
    suma=$(($num1 + $num2))
    echo "el resultado de la suma es $suma"
    echo "--------------------------------"
}

resta() {
    resta=$(($num1 - $num2))
    echo "el resultado de la resta es $resta"
    echo "--------------------------------"
}

division() {
    division=$(($num1 / $num2))
    echo "el resultado de la division es $division"
    echo "--------------------------------"
}

multi() {
    multiplicacion=$(($num1 * $num2))
    echo "el resultado de la multiplicacion es $multiplicacion"
    echo "--------------------------------"
}

while true; do
    opciones
    read -p "Seleccione una opción: " opcion
    case $opcion in
        1)
            suma
            ;;
        2)
            resta
            ;;
        3)
            division
            ;;
        4)
            multi
            ;;
        0)
            echo "Saliendo del programa..."
            exit 0
            ;;
        *)
            echo "Opción inválida, por favor seleccione una opción válida."
            ;;
    esac
done
