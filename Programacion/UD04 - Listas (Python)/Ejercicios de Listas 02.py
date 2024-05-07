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
        else:
            print("Ejercicio no válido")

        opt = input("\nDesea seguir ejecutando los ejercicios? [y/n]").lower()
        if opt != 'y':
            break

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 1:
#Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas,
#Física, Química, Historia y Lengua) en una lista y la muestre por pantalla.
#Yo estudio Matemáticas
#Yo estudio Física
#Yo estudio Química
#Yo estudio Historia
#Yo estudio Lengua

def ej1():

    lista = []
    num_asignaturas = int(input("cuantas asignaturas tienes "))

    for mamastia in range(num_asignaturas):
        asignaturas = str(input(f"cual es la asignaturas numero {mamastia + 1} "))
        lista.append(asignaturas)
    for papasito in lista:
        print(f"yo estudio {papasito}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 2
#Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas,
#Física, Química, Historia y Lengua) en una lista, pregunte al usuario la nota que ha sacado en
#cada asignatura, y después las muestre por pantalla con el mensaje En <asignatura> has
#sacado <nota> donde <asignatura> es cada una de las asignaturas de la lista y <nota> cada una
#de las correspondientes notas introducidas por el usuario.
#¿Qué nota has sacado en Matemáticas? 6
#¿Qué nota has sacado en Física? 7
#¿Qué nota has sacado en Química? 4
#¿Qué nota has sacado en Historia? 6
#¿Qué nota has sacado en Lengua? 5
#En Matemáticas has sacado 6
#En Física has sacado 7
#En Química has sacado 4
#En Historia has sacado 6
#En Lengua has sacado 5

def ej2():
   
    lista = []
    notas = []
    num_asignaturas = int(input("cuantas asignaturas tienes "))

    for mamastia in range(num_asignaturas):
        asignaturas = str(input(f"cual es la asignaturas numero {mamastia + 1} "))
        lista.append(asignaturas)

    print(f"la lista con todas tus asignaturas es {lista}")
    for papasito in lista:
        nota = int(input(f"que nota has sacado en {papasito} "))
        notas.append(nota)
    
    for diabla in range(len(lista)):
        print(f"en {lista[diabla]} has sacado un: {notas[diabla]}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 3
#Escribir un programa que pregunte al usuario los números ganadores de la lotería primitiva, los
#almacene en una lista y los muestre por pantalla ordenados de menor a mayor.
#Introduce un número ganador: 46
#Introduce un número ganador: 25
#Introduce un número ganador: 32
#Introduce un número ganador: 15
#Introduce un número ganador: 9
#Introduce un número ganador: 21
#Los números ganadores son [9, 15, 21, 25, 32, 46]

def ej3():
    
    lista = []

    for mamasita in range(6):
        numero_ganador = int(input(f"el numero ganador {mamasita + 1} es: "))
        lista.append(numero_ganador)
        lista.sort()
    print(lista)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 4
#Escribir un programa que almacene en una lista los números del 1 al 10 y los muestre por
#pantalla en orden inverso separados por comas.

def ej4():
    
    lista = []
    
    for mamasita in range(1,11):
        lista.append(mamasita)
    lista.reverse()
    print(lista)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 5
#Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas,
#Física, Química, Historia y Lengua) en una lista, pregunte al usuario la nota que ha sacado en
#cada asignatura y elimine de la lista las asignaturas aprobadas. Al final el programa debe
#mostrar por pantalla las asignaturas que el usuario tiene que repetir.
#¿Qué nota has sacado en Matemáticas? 7
#¿Qué nota has sacado en Física? 4
#¿Qué nota has sacado en Química? 5
#¿Qué nota has sacado en Historia? 6
#¿Qué nota has sacado en Lengua? 3
#Tienes que repetir ["Física", "Lengua"]

def ej5():
   
    todas_tus_asignaturas = []
    notas = []
    num_asignaturas = int(input("¿Cuántas asignaturas tienes? "))

    for mamasita in range(num_asignaturas):
        asignatura = str(input(f"¿Cuál es la asignatura número {mamasita + 1}? "))
        todas_tus_asignaturas.append(asignatura)

    print(f"La lista con todas tus asignaturas es: {todas_tus_asignaturas}")

    for papasito in todas_tus_asignaturas:
        nota = int(input(f"¿Qué nota has sacado en {papasito}? "))
        notas.append(nota)
        if nota < 5:
            asignatura_repetir = todas_tus_asignaturas[notas.index(nota)]
            print(f"Tienes que repetir la asignatura de {asignatura_repetir}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 6
#Escribir un programa que almacene el abecedario en una lista, elimine de la lista las letras que
#ocupen posiciones múltiplos de 3, y muestre por pantalla la lista resultante.
#["a", "b", "d", "e", "g", "h", "j", "k", "m", "n", "o", "p", "r", "s", "u", "v", "x", "y"]

def ej6():
    
    abecedario = ["a", "b", "d", "e", "g", "h", "j", "k", "m", "n", "o", "p", "r", "s", "u", "v", "x", "y"]
    
    for i in range(len(abecedario),1, -1):
        if i % 3 == 0:
            abecedario.pop(i-1)
    print(abecedario)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 7
#Escribir un programa que pida al usuario una palabra y muestre por pantalla si es un
#palíndromo. (Con listas!! Mira si la lista es idéntica en un sentido que en otro)
#Introduce una palabra: arañara
#Es un palíndromo

def ej7():

    palabra = input("dame una palabra ")

    if palabra == palabra[::-1]:
        print("es un palindromo")
    else:
        print("no es un palindromo")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 8
#Escribir un programa que pida al usuario una palabra y muestre por pantalla el número de
#veces que contiene cada vocal.
#Introduce una palabra: En un lugar de la Mancha
#La vocal a aparece 4 veces
#La vocal e aparece 1 veces
#La vocal i aparece 0 veces
#La vocal o aparece 0 veces
#La vocal u aparece 2 veces

def ej8():
    
    palabra = input("dame una palabra ")
    vocales = ["a", "e", "i", "o", "u"]

    for vocal in vocales:
        veces = 0
        for letra in palabra:
            if letra == vocal:
                veces += 1
        print(f"la vocal {vocal} aparece {veces} veces")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 9
#Escribir un programa que almacene en una lista los siguientes precios, 50, 75, 46, 22, 80, 65, 8,
#y muestre por pantalla el menor y el mayor de los precios.
#El mínimo es 8
#El máximo es 80

def ej9():
    precios = [50, 75, 46, 22, 80, 65, 8]
    precios.sort()
    menor = precios[0]
    mayor = precios[-1]

    print(f"El menor de la lista es {menor}")
    print(f"El mayor de la lista es {mayor}")


#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 10
#Escribir un programa que almacene los vectores (1,2,3) y (-1,0,2) en dos listas y muestre por
#pantalla su producto escalar.
#El producto de los vectores(1, 2, 3) y (-1, 0, 2) es 5

def ej10():

    v1 = [1, 2, 3]
    v2 = [-1, 0, 2]

    producto_escala = sum(a*b for a, b in zip(v1, v2))
    print(producto_escala)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

if __name__ == "__main__":
    main()