#!/bin/bash
archivo1=$1

if [ -e "$archivo1" ]; then
    nombre=$archivo1
    nombreSinExt=${nombre%.*}
    echo "El nombre del archivo $archivo1 es: $nombreSinExt"
else
    echo "El archivo $archivo no existe"
fi

