#!/bin/bash
directorio="misDatos"
fichero=$1
if [ -d "$directorio" ]; then
    echo "el directorio misDatos existe"
else
    mkdir misDatos
fi
touch $fichero
mv $fichero misDatos
