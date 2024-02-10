def main():
    while True:
        eleccion = int(input("Elige qué ejercicio quieres ejecutar (número del ejercicio): "))
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
        else:
            print("Ejercicio no válido")

        opt = input("\nDesea seguir ejecutando los ejercicios? [y/n]").lower()
        if opt != 'y':
            break

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 1:
#   Si P = True y Q es igual a False:	(P=1 Q=0)

'''a)	P and Q = False 
   b)	not P = False
   c)	not (not P) = True
   d)	P and not Q = True
   e)	not P or not Q = True
   f)	not Q and P = True
   g)	P and Q and Q and P and (not Q) or Q = False
   h)	not (not( Q and P) = False'''

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio2: True o False:
#    (x > 7 and x < 0)

'''Esto es falso por que si x es mayor que 7 no puede ser a su vez menor que 0'''

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio3: Simplifica (en papel) p y q son True
#    not (not(p or(q and (p and (q or not (x > 7 and x < 0)))
#    not (not(p or(q and (p and (q or not (Falso)))

'''Verdadero'''

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 4:
#    Realiza un programa:

'''a)	Crea una variable entera llamada i que valga 3
           i=3

   b)	Crea una variable entera llamada j que valga el doble de i
           j=2*i

   c)	Crea una variable entera llamada k que valga el triple de j
           k=3*j

   d)	Cambia el valor de i por su valor dividido por 2
           i=i/2 

   e)	Muestra por pantalla el valor de k
       print(k)   

   f)	Crea una variable entera llamada l que valga la mitad de 36
           l=36/2  

   g)	Muestra por pantalla si k es igual a l
           no podemos hacerlo 

   h)	Crea una variable booleana b con el resultado de comparar si k y l son iguales
           no podemos hacerlo  

   i)	Asigna a k el valor cero 
           k=0   

   j)	Muestra por pantalla el valor de b
           print(b)'''

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 5:
#    ¿Compilará y funcionará el siguiente código?

'''a)
   a = 'a'
   print(a)   
       si inprimira por pantall la letra "a"

   b)
   pi = 3.14
   print(pi)   
       si que funcionara 

   c)
   pi = 3,14
   print(pi)   
       no funcionara por que la coma es un error de compilacion  

   d)
   adivina = (1 == 4)
   print(adivina)   
       dara error por que 1 no es igual que d'''

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 6: Qué mostrará el siguiente programa por pantalla:
#    i=0b100
#    i += 1
#    print(i)

'''el numero 5 por que 100 en binario es 4 + 1 = 5'''

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 7: ¿Por qué no compila el siguiente programa? Modifícalo para hacer que funcione

'''int n1=50, n2=30,            |    n1=50, n2=30,          
boolean suma=0                  |    suma=0
suma=n1+n2;                     |    suma=n1+n2
print("LA SUMA ES: " + suma);   |    print("LA SUMA ES: " + suma)'''

'''Se quitan los tipos de datos en python y los ;'''

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 8: Si ejecutamos el siguiente programa ¿Qué aparecerá en pantalla?
#    num=5
#    num += num - 1 * 4 + 1
#    print(num)
#    num=4
#    num %= 7 * num % 3 * 7 - 1
#    print(num)

'''dara el primer print 7 y el segundo print 4'''

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 9: El siguiente programa tiene 3 errores, averigua cuáles son y modifica el programa para que funcione.
#    numero=2,
#    cuad=numero * número;
#    print("EL CUADRADO DE "+ str(NUMERO)+" ES: " + str(cuad));

'''los errores son los ";" la "," del 2 y la "ú"'''

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 10: ¿Compilará y funcionará el siguiente código?
#    adivina = (97 == 'a' == 97);
#    print(adivina);

'''si que compilara por que 97 = a y a = 97'''

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 11: ¿Compilará y funcionará el siguiente código?
#    adivina = (97 == 'a' == true);
#    print(adivina);
        
'''no por que juntas 2 cadenas siendo booleanos y string'''

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 12: Arregla el siguiente programa y consigue que funcione:

'''n2=30, suma=0, n3                   |   n2=30, n1=10, n3=20
   suma=n1+n2                          |   suma=n1+n2
   print("LA SUMA ES: " + str(suma))   |   print("LA SUMA ES: " + str(suma))
   suma=suma+n3                        |   suma=suma+n3
   print(suma)                         |   print(suma)'''

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 13: 
#Realiza un programa con una variable entera “segundos” la cual contiene un tiempo en segundos y queremos conocer 
#este tiempo expresado en horas, minutos y segundos. : Ejemplo: segundos=9500
#9500 segundos son 2 horas, 38 minutos y 20 segundos.

def ej13():   
             
        segundos = 9500
        horas = segundos//3600
        minutos = (segundos%3600)//60
        segundos_finales = segundos % 60

        print (f"{segundos} segundos son: {horas} horas {minutos} minutos y {segundos_finales} segundos")

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 14:
#    Realiza un programa que muestre en pantalla, respetando los retornos de línea, el siguiente texto:
#    Me gusta la programación
#    cada día más.
#        se pone \n para hacer un salto de linea como si fuera <br> en html

def ej14(): 
               
        print("me gusta la programacion \ncada dia mas.")

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 15:
#    Realiza un programa que pida al usuario introducir los lados de un rectángulo y calcule su área.

def ej15():
        
        Base = float(input("dime cuanto minde la base de un rectangulo "))
        altura = float(input("dime la altura de el rectangulo "))
        area = Base*altura

        print(f"el area del rectangulo cuya base es {Base} y su altura altura de {altura} es {area} ")

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 16:
#    Realiza un programa que pida al usuario introducir su nombre y después lo salude usuario
#    diciéndole “Hola” y su nombre.

def ej16():
        
        nombre = str(input("dime tu nombre"))

        print(f"hola {nombre}")

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 17:
#    Realiza un programa que pida al usuario introducir dos números enteros y que muestre:
#    1. el mayor
#    2. el menor
#    3. si el mayor es múltiplo del menor

def ej17():
        
        num1 = int(input("dime un numero y te digo el mayor el menor y si el mayor es multiplo del menor "))
        num2 = int(input("dime otro numero y te digo el mayor el menor y si el mayor es multiplo del menor "))

        if num1 > num2:
            if num1 % num2 == 0:
                print("el primer numero es mayor al segundo y es multiplo tambien")
            else:
                print("el numero 1 es mayor pero no es multiplo")
        else:
            if num2 % num1 == 0:
                print("el numero 2 es mayor y ademas es multiplo del numero 1")
            else:
                print("el numero 2 es mayor pero no es multiplo")

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 18:
#    Realiza un programa que pida al usuario introducir dos números, calcule el cociente entre
#    ambos y muestre el resultado con una precisión de 3 decimales.

def ej18():
        
        num1 = float(input("dime un numero "))
        num2 = float(input("dime un numero "))
        cociente = num1/num2

        print(round(cociente, 3))

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 19:
#    Realiza un programa que pida al usuario introducir dos números y muestre el resultado de
#    elevar el primero al segundo.

def ej19():
        
        num1 = float(input("dime un numero "))
        num2 = float(input("dime un numero "))
        potencia = num1**num2

        print(potencia)

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 20:
#    Realiza un programa que:
#    1. Pida por teclado la arista de un cubo.
#    2. Calcule el volumen del cubo.
#    3. Muestre por pantalla el resultado.

def ej20():
        
        arista = float(input("dime la arista de un cubo y te calculo su volumen "))
        volumen = arista**3

        print(volumen)

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 21:
#    Realiza un programa que:
#    1. Pida por teclado la nota de tres exámenes.
#    2. Calcule la nota media de los tres exámenes.
#    3. Muestre por pantalla el resultado.

def ej21():
        
        nota1 = float(input("dime la nota para el examen 1 "))
        nota2 = float(input("dime la nota para el examen 2 "))
        nota3 = float(input("dime la nota para el examen 3 "))
        media = (nota1+nota2+nota3)/3
        media_sin_decimales = (nota1+nota2+nota3)//3

        print(f"la media de los tres examenes es {media} y sin decimales es {media_sin_decimales}")

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 22:
#    Realiza un programa en python que dada dos variables v1 y v2, intercambie los valores de v1 y
#    v2.

def ej22():
        
        v1 = int(input("dime cuanto va a valer la variable 1 "))
        v2 = int(input("dime cuanto va a valer la variable 2 "))
        v1,v2 = v2,v1

        print(f"tras el cambio el valor de v1 es de {v1} la de v2 es {v2}")

#-----------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 23:
#    Realiza un programa en Python que dada dos variables a y b, intercambie los valores de a y b
#    sin utilizar una variable adicional para facilitar el intercambio.

def ej23():
        
        v1 = int(input("dime cuanto va a valer la variable 1 "))
        v2 = int(input("dime cuanto va a valer la variable 2 "))
        v1,v2 = v2,v1

        print(f"tras el cambio el valor de v1 es de {v1} la de v2 es {v2}")

#-----------------------------------------------------------------------------------------------------------------------------------------

if __name__ == "__main__":
    main()