#!/bin/bash
if [ $(id -u) -ne 0 ]; then
    echo "este script fue ejecutado por un usuario corriente error"
    exit 1
fi

echo "este programa fue ejecutado por root"
