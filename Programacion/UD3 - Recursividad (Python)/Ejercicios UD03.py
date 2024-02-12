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
        if eleccion == 7:
            ej7()
            break
        if eleccion == 8:
            ej8()
            break
        if eleccion == 9:
            ej9()
            break
        if eleccion == 10:
            ej10()
            break
        if eleccion == 11:
            ej11()
            break
        if eleccion == 12:
            ej12()
            break
        if eleccion == 13:
            ej13()
            break
        if eleccion == 14:
            ej14()
            break
        if eleccion == 15:
            ej15()
            break
        if eleccion == 16:
            ej16()
            break
        if eleccion == 17:
            ej17()
            break
        if eleccion == 18:
            ej18()
            break
        if eleccion == 19:
            ej19()
            break
        if eleccion == 20:
            ej20()
            break
        if eleccion == 21:
            ej21()
            break
        if eleccion == 22:
            ej22()
            break
        if eleccion == 23:
            ej23()
            break
        if eleccion == 24:
            ej24()
            break
        else:
            print("Ejercicio no válido")

        opt = input("\nDesea seguir ejecutando los ejercicios? [y/n]").lower()
        if opt != 'y':
            break

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 1:
#    #Dada una cadena de texto, indique el número de vocales que tiene.
#    #Entrada: Supercalifragilisticoespialidoso
#    #Salida: 15

def ej1():
    
    def cadena_txt (cadena, vocales):
        contador = 0
        for mamastia in cadena:
            if mamastia in vocales:
                contador += 1
        return contador 
    
    cadena = "Supercalifragilisticoespialidoso"
    vocales = "aeiouAEIOU"
    resultado = cadena_txt(cadena, vocales)
    
    print(resultado)    
        
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 2:
    #Determine si un número dado es un número primo. (usando for)

def ej2():
    
    def primo (premo):
        mama = True
        for mamasita in range(2, premo):
            if premo % mamasita == 0:
                mama = False
        if mama:
            print("this numero is premo")
        else:
            print("this numero no es premo")
        
    premo = int(input("dime un numero "))  
    primo(premo) 

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 3:
    #Imprima los 100 primeros números de la sucesión de Fibonacci (comienza con los números 0 y 1; a partir de estos, 
    #«cada término es la suma de los dos anteriores») 0,1,1,2,3,5,8,13,21...

def ej3():
               
    a = 0
    b = 1
    while True:
        if b > 100:
            break
        else:
            a, b = b , a + b
            print(f"{a}", end=" ") 

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 4:
    #Escribe un programa en Python que genere todas las tablas de multiplicar (las muestre por pantalla.)

def ej4():

    def tablas (tabla, multiplicador):
        print("la tabla del 0 es:")
        while tabla <= 10:
            if multiplicador <= 10:
                print(f"{tabla} * {multiplicador} = {tabla*multiplicador}")
                multiplicador += 1
            else:                
                print("----------------------------------------")
                tabla += 1
                if tabla > 10:
                    break
                else:
                    print(f"la siguiente tabla es la del {tabla}")
                    multiplicador = 0
                
    tabla = 0
    multiplicador = 0
    
    tablas (tabla, multiplicador)    

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 5:
    #Escriba un programa que pida nombre y apellidos de una persona (usando un solo input) y
    #repita la pregunta mientras el nombre no esté en formato título
    #¿Su nombre? ana torres blanco
    #Error. Debe escribirlo correctamente
    #¿Su nombre? Ana torres blanco
    #Error. Debe escribirlo correctamente
    #¿Su nombre? Ana Torres blanco
    #Error. Debe escribirlo correctamente
    #¿Su nombre? Ana Torres Blanco

def ej5():
    
    def nombre_mayus ():
        while True:
            nombre = str(input("dime tu nombre bien escrito "))
            if nombre.istitle() is True:
                print(f"el nombre esta bien escrito {nombre}")
                break
            else:
                print("lo escribiste mal")
    
    nombre_mayus()

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

##Ejercicio6:
#    #Escriba un programa en Python que acepte una cadena de texto e indique si todos sus caracteres son alfabéticos. 
#    #Versión 1: puedes usar la función isalpha(). Versión 2: No usar la función isalpha() sino una constante
#    #ALPHABET = 'abcdefghijklmnopqrstuvwxyz'
#    #Entrada: hello-world Salida: Se han encontrado caracteres no alfabéticos

def ej6():
    
    def alfabeting (str1):
        alfabeto = "abcdefghijklmnopqrstuvwxyz"
        
        for mamasita in str1:
            if  mamasita not in alfabeto:
                return "ERROR, la cadena de caracteres que introdujiste contiene caracteres no alfabeticos"
        return "la cadena de caracteres que introdujiste esta correcta"
    
    str1 = str(input("dime una cadena de texto "))
    diablo = alfabeting(str1)
    print(diablo)
    
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 7:
    #Escriba un programa en Python que acepte dos cadenas de texto y compute el producto
    #cartesiano letra a letra entre ellas.
    #Entrada: str1=abc; str2=123
    #Salida: a1 a2 a3 b1 b2 b3 c1 c2 c3

def ej7():
    
    str1 = str(input("dime una cadena de texto "))
    str2 = str(input("dime otra cadena pero numerica "))
    
    for mama in str1:
        for papa in str2:
            print(f"{mama}{papa}", end=" ")
            
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 8:
    #Escriba un programa que calcule el máximo común divisor entre dos números enteros. No
    #utilice ningún algoritmo existente. Hágalo probando divisores.
    #Entrada: a=12; b=44
    #Salida: 4

def ej8():
    
    def mcd (a,b):
        if a < b:
            a, b = b, a
        mcd = b
        for i in range(b, 0, -1):
            if a % i == 0 and b % i == 0:
                mcd = i
                break
        return mcd
    
    num1 = int(input("dime el primer numero "))
    num2 = int(input("dime el segundo numero "))
    
    print(mcd(num1, num2))
    
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 9:
    #Escriba un programa que muestre por pantalla todas las fichas del dominó. La ficha «en
    #blanco» se puede representar con un 0
    #0|0 0|1 0|2 0|3 0|4 0|5 0|6
    #1|1 1|2 1|3 1|4 1|5 1|6
    #2|2 2|3 2|4 2|5 2|6
    #3|3 3|4 3|5 3|6
    #4|4 4|5 4|6
    #5|5 5|6
    #6|6

def ej9():
    
    for mamasita in range(7):
        for papasita in range(mamasita, 7):
            print(f"{mamasita}|{papasita}", end=" ")
        print()

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 10:
#Escriba un programa que permita al usuario adivinar un número. Indicar si el número buscado
    #es menor o mayor que el que se está preguntando y mostrar igualmente el número de intentos
    #hasta encontrar el número objetivo:
    #Introduzca número: 50
    #Mayor
    #Introduzca número: 100
    #Menor
    #Introduzca número: 90
    #Menor
    #Introduzca número: 87
    #¡Enhorabuena! Has encontrado el número en 4 intentos

def ej10():
    
    import random as arjona_transexual

    def la_rule():
        
        rule = arjona_transexual.randint(101)    
        while True:
            apuesta = int(input("dime tu apuesta "))
            if apuesta > rule:
                print ("tu numero es mayor al de la rule")
            elif apuesta < rule:
                print ("tu numero es menor al de la rule")
            elif apuesta == rule:
                print (f"has adivinado el numero de la rule({rule})")
                break
    
    la_rule()
            
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 11:
    #Crear una función llamada "signo";, que reciba un número real, y devuelva un número entero
    #con el valor: -1 si el número es negativo, 1 si es positivo o 0 si es cero.

def ej11():
    
    def signo ():
        num = float(input("dime un numero real, si el numero es negativo se escribira un -1 si es 0 se escribira un 0 y si es mayor a 0 se escribira un 1 "))
        if num < 0:
            print("-1")
        elif num > 0:
            print("1")
        elif num == 0:
            print("0")
    
    signo()
    
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 12:
    #Crear una función que calcule el menor de dos números enteros que recibirá como
    #parámetros. El resultado será otro número entero.

def ej12():
    
    def menor (num1, num2):
        if num1 > num2:
            return num2
        return num1
    
    fin = menor(5, 6)
    
    print(fin)
        
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 13:
    #Crea una función que calcule un número elevado a otro, usando multiplicaciones sucesivas.

def ej13():
    
    def multiplicaciones (num1, num2):
        contador = 1
        alma = num1
        while contador < num2:
            num1 *= alma
            contador += 1
        return num1
    
    base = int(input("dime la base "))
    exponente = int(input("dime el exponente "))
    fin = multiplicaciones(base, exponente)
    
    print(f"{base} elevado a {exponente} = {fin}")
        
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 14:
    #Crear una función "EscribirTablaMultiplicar", que reciba como parámetro un número entero, y
    #escriba la tabla de multiplicar de ese número (por ejemplo, para el 3 deberá llegar desde
    #"3x1=3"; hasta "3x10=30";).

def ej14():
    
    def tabla_multi(tabla):
        print(f"la tabla del {tabla} es:")
        for multiplicador in range(11):
            print(f"{tabla} * {multiplicador} = {tabla*multiplicador}")
            
    tabla_multi(10)
    
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 15:
    #Crear una función que reciba una letra y un número, y escriba un "triángulo" formado por esa
    #letra, que tenga como anchura inicial la que se ha indicado. Por ejemplo, si la letra es Q y la
    #anchura es 4, debería escribir
    #QQQQ
    #QQQ
    #QQ
    #Q

def ej15():
    
    def triangulo_Q(numero):
        for mama in range(numero):
            for _ in range(mama, numero):
                print(f"{letra}", end="     ")
            print()
            
    letra = str(input("dime una letra con la que haras el triangulo "))
    num = int(input("cuantas letras quieres por lado del triangulo "))
    
    triangulo_Q(num)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 16:
    #Crear una función que tenga como parámetros de entrada  números enteros y como
    #parámetro de salida un float con la media aritmética de ambos.

def ej16():
    
    def diablo(num1,num2):
        media = (num1+num2)/2.0
        print(media)
        
    str1 = int(7)
    str2 = int(9)
    
    diablo(str1,str2)
    
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 17:
    #Crea una función que dada una nota numérica devuelva una nota de forma textual: Suspenso,
    #Aprobado, Notable y Sobresaliente.

def ej17():
    
    def nota_txt(nota):
        if nota < 0 or nota > 10:
            print("nota invalida")
        elif nota < 5:
            print("suspenso")
        elif nota >= 5 and nota < 7:
            print("aprobado")
        elif nota >= 7 and nota < 9:
            print("notable")
        elif nota >= 9 and nota < 10:
            print("sobresaliene")
        
        
    nota_txt(7)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 18:
    #Crear una función que calcule el mayor de dos números enteros que recibirá como
    #parámetros. El resultado será otro número entero. Desarrolla otra implementación que reciba
    #2 números reales y devuelva un número real (double).

def ej18():
    
    def er_mayor(num1, num2):
        if num1 > num2:
            return num1
        return num2
    
    num1 = int(5)
    num2 = int(7)
      
    resultado = er_mayor(num1, num2)
    
    print (resultado)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 19:
    #Crea una función que realice una cuenta atrás partiendo de un número entero recibido como
    #parámetro y utilizando recursividad.

def ej19():
    
    def patras (num):
        for mamasita in range(num, 0, -1):
            print(mamasita)
        
    patras(7)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 20:
    #Crea una función que calcule el factorial de un número de manera iterativa.
    #!n = n*(n-1)*(n-2)* … *2*1+
    
def ej20():
    
    def facto (num):
        for mamasita in range(num-1, 0, -1):
            num *= mamasita
        print(num)
        
    facto(5)
    
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 21: 
#Crea una función que calcule el factorial de un número de manera recursiva.

def ej21():
    
    def facto (num):
        if num == 0:
            return True
        else:
            return num * facto(num - 1)
        
    fin = facto(5)
    print(fin)
    
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 22:
    #Crea una función que calcule el valor enésimo de la sucesión de Fibonacci utilizando
    #recursividad.
    #Sucesión de Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, …
    #Definición recursiva: f(n) = f(n-1) + f(n-2) con f(0) = 0 y f(1) = 1.

def ej22():
    
    def fibonacci_recursivo(n):
        if n == 0:
            return 0
        elif n == 1:
            return 1
        else:
            return fibonacci_recursivo(n-1) + fibonacci_recursivo(n-2)

    n = 6
    resultado = fibonacci_recursivo(n)
    print(f"El valor enésimo de la sucesión de Fibonacci para n={n} es {resultado}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 23:
    #Desarrolla una función que escriba la sucesión de Fibonacci hasta número de secuencia dado.
    
def ej23():
    
    def fibo(num):
        a = 0
        b = 1
        while a <= num:
            print(f"{a}", end=" ") 
            a, b = b, a + b
                   
    fibo(100)   

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 24:
    #Realiza una función recursiva que dado un número entero calcule la suma de todas sus cifras.

def ej24():
    
    def suma_cifras_recursiva(numero):
        if numero < 10:
            return numero
        else:
            return numero % 10 + suma_cifras_recursiva(numero // 10)

    numero_ejemplo = 12345
    resultado = suma_cifras_recursiva(numero_ejemplo)
    print(f"La suma de las cifras de {numero_ejemplo} es {resultado}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

if __name__ == "__main__":
    main()