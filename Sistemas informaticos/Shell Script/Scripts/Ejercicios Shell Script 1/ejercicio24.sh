#!/bin/bash
archivo1=$1

for $archivo1 in "$@"; do
    if [ -e $archivo1 ]; then
      	if [ -f "$archivo1"]; then
	     echo "el archivo existe y es un fichero"
	else
	     echo "el archivo existe y es un directorio"
    else
        echo "el archivo no existe"
    fi
done
