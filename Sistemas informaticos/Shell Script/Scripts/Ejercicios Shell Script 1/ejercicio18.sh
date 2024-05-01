#!/bin/bash
archivo1=$1

for $archivo1 in "$@"; do
    if [ -e $archivo1 ]; then
        echo "el archivo existe"
    else
        echo "el archivo no existe"
    fi
done
