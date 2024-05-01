#!/bin/bash
archivo=$1

if [ -e $archivo ]; then
    if [ -r $archivo ]; then
        echo "el contenido del archivo es"
	cat $archivo
    else
        echo "el archivo no teine permisos de lectura"
    fi
else
    echo "el archivo no existe" 
fi
