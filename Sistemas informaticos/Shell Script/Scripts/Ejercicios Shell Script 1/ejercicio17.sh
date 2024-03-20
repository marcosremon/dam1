echo "escriba el primer numero " 
read num1
echo "escriba el segundo numero " 
read num2

if [ $num1 -eq $num2 ]; then
    echo "los dos numeros son iguales"
elif [ $num1 -gt $num2 ]; then
    echo "el numero 1 '$num1' es mayor al numero 2 '$num2'"
else
    echo "el numero 2 '$num2' es mayor al numero 1 '$num1'"
fi
