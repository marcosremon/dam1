#!/bin/bash
fichero=$1
nombreYExtension() {
    nombre=${fichero##*/}
    extension=${fichero##*.}
    echo "la extension del archivo es: $extension"
    echo "el nombre del fichero es: $nombre"
}
if [ $# -ne 1 ]; then
    echo "el fichero no existe"
    touch $fichero
    nombreYExtension
else
    nombreYExtension
fi

