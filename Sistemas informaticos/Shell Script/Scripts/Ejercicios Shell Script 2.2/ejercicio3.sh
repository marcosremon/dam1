#!/bin/bash
fichero=$1
if [ -e $fichero ]; then
    if [ $# -ne 1 ]; then
        echo "no se paso nada por parametro"
        break
    else
        tar -czvf Copia.tar.gz $fichero
    fi
else
    touch $fichero
    tar -czvf Copia.tar.gz $fichero
fi
