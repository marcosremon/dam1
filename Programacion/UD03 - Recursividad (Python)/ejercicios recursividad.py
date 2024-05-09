def main():
    while True:
        eleccion = int(input("Elige qué ejercicio quieres ejecutar (número del ejercicio): "))
        if eleccion == 1:
            ej1()
            break
        if eleccion == 2:
            ej2()
            break
        if eleccion == 3:
            ej3()
            break
        if eleccion == 4:
            ej4()
            break
        if eleccion == 5:
            ej5()
            break
        if eleccion == 6:
            ej6()
            break
        opt = input("\nDesea seguir ejecutando los ejercicios? [y/n]").lower()
        if opt != 'y':
            break

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#EJ1: Suma de Números: Escribe una función recursiva que sume todos los números enteros
#positivos desde 1 hasta un número N dado.

def ej1():

    def suma (num):
        if num <= 0:
            return False
        else:
            return num + suma(num - 1)

    num = int(input("dime un numero "))
    resultado = suma(num)

    print(resultado)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#EJ2: Potencia de un Número: Implementa una función recursiva que calcule la potencia de un
#número base elevado a una potencia exponente.

def ej2():

    def potencia(b, e):
        if e == 0:
            return 1
        else:
            return b * potencia(b, e - 1)

    base = 2
    exponente = 10
    resultado = potencia(base, exponente)
    print(f"{base} elevado a la {exponente} es igual a: {resultado}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#EJ3: Conteo de Dígitos: Crea una función que cuente cuántos dígitos tiene un número entero
#dado.

def ej3():

    def contar (num, potencia=1, contador=0):
        if  num >= potencia:
            return contar(num, potencia*10, contador+1)
        else:
            return contador

    num = int(input("dime un numero y te digo cuantas cifras tiene "))
    resultado = contar(num)

    print(f"el numero dado tiene {resultado} digitos")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#EJ4: Factorial con un giro: En lugar de calcular el factorial directamente, intenta escribir una
#función que calcule la suma de los factoriales de los números enteros desde 1 hasta N.

def ej4():

    def factorial (num):
        if num < 1:
            return 0
        else:
            return num + factorial(num - 1)

    num = int(input("dime un numero "))
    resultado = factorial(num)

    print(resultado)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#EJ5: Números Primos: Desarrolla una función que determine si un número dado es primo o no
#utilizando recursión.

def ej5():

    def es_premo (num, divisor=2):
        if num <=1:
            return False
        elif num == 2:
            return True
        elif num % divisor == 0:
            return False
        elif divisor * divisor > num:
            return True
        return es_premo(num, divisor + 1)

    resultado = es_premo(num)
    print(resultado)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#EJ6: Fibonacci Alternativo: En lugar de calcular la secuencia de Fibonacci, intenta escribir una
#función que calcule la suma de los primeros N términos de la secuencia de Fibonacci.

def ej6():

    def fibo (m):
        if m <= 0:
            return 0
        elif m == 1:
            return 1
        else:
            return fibo((m-1) + fibo(m-2))

    def suma_fibo (n):
        if n <= 0:
            return 0
        elif n == 1:
            return 1
        else:
            return fibo(n) + suma_fibo(n-1)

    print(suma_fibo(5))
