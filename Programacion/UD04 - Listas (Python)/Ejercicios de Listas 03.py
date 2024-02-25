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
        else:
             print("Ejercicio no válido")

        opt = input("\nDesea seguir ejecutando los ejercicios? [y/n]").lower()
        if opt != 'y':
            break
        
#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 1
# Realizar un programa que inicialice una lista con 10 valores aleatorios (del 1 al 10) y
# posteriormente muestre en pantalla cada elemento de la lista junto con su cuadrado y su
# cubo.

def ej1():

    import random as arjonapalomo

    lista = []
    aleatorio = arjonapalomo.randint(1,10)

    for i in range(10):
        lista.append(aleatorio)
    for j in lista:
        print(f"el cuadrado de {j} es {j**2} y su cubo es {j**3}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 2
# Crea una lista e inicializala con 5 cadenas de caracteres leídas por teclado. Copia los elementos
# de la lista en otra lista pero en orden inverso, y muestra sus elementos por la pantalla.

def ej2():

    lista = []
    lista_al_reves = []

    for i in range(5):
        palabra = str(input("dime una cadena de caracteres "))
        lista.append(palabra)
    lista_al_reves = lista[::-1]

    print(f"la lista original era {lista}")
    print(f"la lista al reves es {lista_al_reves}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 3
# Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno
# (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la
# nota más alta que ha sacado y la menor.

def ej3():

    notas = []

    for i in range(5):
        nota = int(input("dime tus notas "))
        if nota >= 0 or nota <=10:
            notas.append(nota)
        else:
            print("nota invalida")
    notas.sort()
    suma = sum(notas)

    print(f"tus notas son {notas}")
    print(f"la nota mas baja que sacaste es {notas[0]}")
    print(f"la nota mas alta que sacaste es {notas[-1]}")
    print(f"la media de todas tus notas es {suma/5}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 4
# Programa que declare una lista y la valla llenando de números hasta que introduzcamos un
# número negativo. Entonces se debe imprimir la lista (sólo los elementos introducidos).

def ej4():

    lista = []

    while True:
        numeros = int(input("dime numeros, el programa finalizara cuando introduzcar un numero negativo "))
        if numeros < 0:
            break
        else:
            lista.append(numeros)
    print(f"todos los numeros que introdujiste hasta que elegiste uno negativo fue esta: {lista}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 5
# Hacer un programa que inicialice una lista de números con valores aleatorios (10 valores), y
# posterior ordene los elementos de menor a mayor.

def ej5():

    import random as arjonapalomo

    lista = []

    for i in range(10):
        aleatorio = arjonapalomo.randint(1,100)
        lista.append(aleatorio)
    print(f"la lista original era {lista}")
    lista.sort()
    print(f"la lista ordenada de menor a mayor es {lista}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 6
# Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y diga
# cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar listas. Para simplificarlo
# vamos a suponer que febrero tiene 28 días.

def ej6():

    mes = int(input("dime un mes de manera numerica por ejemplo (Junio --> 6, Julio --> 7): "))
    treintaiun_dias = [1, 3, 5, 7, 8, 10, 12]

    if mes == 2:
        print(f"tu mes tiene 28 o 29 dias")
    elif mes in treintaiun_dias:
        print(f"tu mes tiene 31 dias")
    else:
        print("tu mes tiene 30 dias")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 7
# Programa que declare tres listas ‘lista1’, ‘lista2’ y ‘lista3’ de cinco enteros cada uno, pida
# valores para ‘lista1’ y ‘lista2’ y calcule lista3=lista1+lista2.

def ej7():

    lista1 = []
    lista2 = []
    lista3 = []

    for _ in range(5):
        num1 = int(input("dime un numero para la lista 1 "))
        lista1.append(num1)
    for _ in range(5):
        num2 = int(input("dime un numero para la lista 2 "))
        lista2.append(num2)
    lista3 = lista1 + lista2

    print(lista1)
    print(lista2)
    print(lista3)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 8
# Queremos guardar los nombres y las edades de los alumnos de un curso. Realiza un programa
# que introduzca el nombre y la edad de cada alumno. El proceso de lectura de datos terminará
# cuando se introduzca como nombre un asterisco (*) Al finalizar se mostrará los siguientes
# datos (puedes usar zip):
#  Todos los alumnos mayores de edad.
#  El alumno de mayor edad, o Los alumnos mayores si hay varios con la misma edad

# Dime el nombre de un alumno:Pepe
# Dime su edad:23
# Dime el nombre de un alumno:Juan
# Dime su edad:12
# Dime el nombre de un alumno:Antonio
# Dime su edad:58
# Dime el nombre de un alumno:Luis
# Dime su edad:9
# Dime el nombre de un alumno:*
# Alumnos mayores de edad
# =======================
# Pepe
# Antonio
# Alumnos mayores
# ===============
# Antonio

def ej8():

    mayores_de_edad = []
    menores_de_edad = []
    numero_alumno = 1

    while True:
        nombre = input(f"dime el nombre de tu alumno numero {numero_alumno}: ")
        numero_alumno += 1
        if "*" in nombre:
            break
        edad = int(input(f"dime la edad de {nombre}: "))
        if edad >= 18:
            mayores_de_edad.append(nombre)
        elif edad < 18:
            menores_de_edad.append(nombre)
    print(f"los alumno mayores de edad son {mayores_de_edad}")
    print(f"los alumno menores de edad son {menores_de_edad}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 9
# Queremos guardar la temperatura mínima y máxima de 5 días. Realiza un programa que de la
# siguiente información:
#  La temperatura media de cada día
#  Los días con menos temperatura
#  Se lee una temperatura por teclado y se muestran los días cuya temperatura máxima
# coincide con ella. si no existe ningún día se muestra un mensaje de información.
# Día 1. Temperatura máxima:35
# Día 1. Temperatura mínima:18
# Día 2. Temperatura máxima:39
# Día 2. Temperatura mínima:22
# Día 3. Temperatura máxima:33
# Día 3. Temperatura mínima:16
# Día 4. Temperatura máxima:41
# Día 4. Temperatura mínima:10
# Día 5. Temperatura máxima:42
# Día 5. Temperatura mínima:24
# Temperaturas medias
# ===================
# Día 1. Temperatura media: 26.500000:
# Día 2. Temperatura media: 30.500000:
# Día 3. Temperatura media: 24.500000:
# Día 4. Temperatura media: 25.500000:
# Día 5. Temperatura media: 33.000000:
# Días con menos temperatura
# ==========================
# Día 4
# Días con temperatura máxima
# ===========================

def ej9():

    temp_max = []
    temp_min = []
    temperatura_minima = []
    temperatura_maxima = []
    media = []
    contador = 1

    for i in range(5):
        maxima = int(input(f"dime la temperatura maxima del dia {i + 1} "))
        minima = int(input(f"dime la temperatura minima del dia {i + 1} "))
        temp_max.append(maxima)
        temp_min.append(minima)
        temperatura_minima.append(minima)
        temperatura_maxima.append(maxima)
        media.append((maxima + minima) / 2)

    print(f"temperaturas medias \n==========================")

    for j in media:
        print(f"dia {contador}. Temperatura media: {j}")
        contador += 1

    temperatura_minima.sort()
    temperatura_maxima.sort(reverse=True)
    contador = 1

    print(f"Días con menos temperatura \n==========================")
    for k in temp_min:
        if k == temperatura_minima[0]:
            print(f"dia {contador}")
        contador += 1

    contador = 1
    print(f"Días con mas temperatura \n==========================")
    for l in temp_max:
        if l == temperatura_maxima[0]:
            print(f"dia {contador}")
        contador += 1

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 10
# Diseñar el algoritmo correspondiente a un programa, que:
#  Crea una tabla (lista con dos dimensiones) de 5x5 enteros.
#  Carga la tabla con valores numéricos enteros.
#  Suma todos los elementos de cada fila y todos los elementos de cada columna
# visualizando los resultados en pantalla.
# Introduce el número de la fila 1 y columna 1:1
# Introduce el número de la fila 1 y columna 2:2
# Introduce el número de la fila 1 y columna 3:3
# Introduce el número de la fila 1 y columna 4:4
# Introduce el número de la fila 1 y columna 5:5
# Introduce el número de la fila 2 y columna 1:6
# Introduce el número de la fila 2 y columna 2:7
# Introduce el número de la fila 2 y columna 3:8
# Introduce el número de la fila 2 y columna 4:9
# Introduce el número de la fila 2 y columna 5:10
# Introduce el número de la fila 3 y columna 1:11
# Introduce el número de la fila 3 y columna 2:12
# Introduce el número de la fila 3 y columna 3:13
# Introduce el número de la fila 3 y columna 4:14
# Introduce el número de la fila 3 y columna 5:15
# Introduce el número de la fila 4 y columna 1:16
# Introduce el número de la fila 4 y columna 2:17
# Introduce el número de la fila 4 y columna 3:18
# Introduce el número de la fila 4 y columna 4:19
# Introduce el número de la fila 4 y columna 5:20
# Introduce el número de la fila 5 y columna 1:21
# Introduce el número de la fila 5 y columna 2:22
# Introduce el número de la fila 5 y columna 3:23
# Introduce el número de la fila 5 y columna 4:24
# Introduce el número de la fila 5 y columna 5:25
# La suma de los elemento de la fila 1 es 15
# La suma de los elemento de la fila 2 es 40
# La suma de los elemento de la fila 3 es 65
# La suma de los elemento de la fila 4 es 90
# La suma de los elemento de la fila 5 es 115
# La suma de los elemento de la columna 1 es 55
# La suma de los elemento de la columna 2 es 60
# La suma de los elemento de la columna 3 es 65
# La suma de los elemento de la columna 4 es 70
# La suma de los elemento de la columna 5 es 75

def ej10():

    print("")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 11
# Diseñar el algoritmo correspondiente a un programa, que:
#  Crea una tabla bidimensional de longitud 5x5 y nombre ‘diagonal’.
#  Carga la tabla de forma que los componentes pertenecientes a la diagonal de la matriz
# tomen el valor 1 y el resto el valor 0.
#  Muestra el contenido de la tabla en pantalla.

# 1 0 0 0 1
# 0 1 0 1 0
# 0 0 1 0 0
# 0 1 0 1 0
# 1 0 0 0 1

def ej11():

    print("")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 12
# Diseñar el algoritmo correspondiente a un programa, que:
#  Crea una tabla bidimensional de longitud 5x15 y nombre ‘marco’.
#  Carga la tabla con dos únicos valores 0 y 1, donde el valor uno ocupará las posiciones o
# elementos que delimitan la tabla, es decir, las más externas, mientras que el resto de
# los elementos contendrán el valor 0.
# 111111111111111
# 100000000000001
# 100000000000001
# 100000000000001
# 111111111111111
# Visualiza el contenido de la matriz en pantalla.

def ej12():

    print("")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 13
# De una empresa de transporte se quiere guardar el nombre de los conductores que tiene, y los
# kilómetros que conducen cada día de la semana.
# Para guardar esta información se van a utilizar dos arreglos:
#  Nombre: Lista para guardar los nombres de los conductores.
#  kms: Tabla para guardar los kilómetros que realizan cada día de la semana.
# Se quiere generar una nueva lista (“total_kms”) con los kilómetros totales que realza cada
# conductor.
# Al finalizar se muestra la lista con los nombres de conductores y los kilómetros que ha
# realizado.
# ¿Cuántos conductores tiene la empresa?:2
# Nombre del conductor 1:Pepe
# ¿Cuántos km ha realizado el Lunes?:150
# ¿Cuántos km ha realizado el Martes?:200
# ¿Cuántos km ha realizado el Miércoles?:500
# ¿Cuántos km ha realizado el Jueves?:600
# ¿Cuántos km ha realizado el Viernes?:150
# ¿Cuántos km ha realizado el Sábado?:15
# ¿Cuántos km ha realizado el Domingo?:36
# Nombre del conductor 2:Antonio
# ¿Cuántos km ha realizado el Lunes?:10
# ¿Cuántos km ha realizado el Martes?:20
# ¿Cuántos km ha realizado el Miércoles?:10
# ¿Cuántos km ha realizado el Jueves?:13
# ¿Cuántos km ha realizado el Viernes?:150
# ¿Cuántos km ha realizado el Sábado?:600
# ¿Cuántos km ha realizado el Domingo?:10

# Pepe ha realizado 1651 kms.
# Antonio ha realizado 813 kms.

def ej13():

    dias_semana = ["lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"]
    conductores = []
    suma_km = []
    conductor = int(input("cuantos conductores tiene la empresa "))

    for i in range(conductor):
        camionero = str(input(f"dime el nombre del conductor numero {i+1}: "))
        conductores.append(camionero)
        kilometros = []
        for j in dias_semana:
            km = int(input(f"cuantos km ha realizado el {j}: "))
            kilometros.append(km)
        suma = sum(kilometros)
        suma_km.append(suma)

    print()
    for k in conductores:
        for l in suma_km:
            print(f"{k} ha realizado {l}km esta semana")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 14
# # Crear un programa que lea los precios de 5 artículos y las cantidades vendidas por una empresa en sus 4 formar:
#  Las cantidades totales de cada artículo.
#  La cantidad de artículos en la sucursal 2.
#  La cantidad del artículo 3 en la sucursal 1.
#  La recaudación total de cada sucursal.
#  La recaudación total de la empresa.
#  La sucursal de mayor recaudación.

def ej14():

    print("")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 15
# Crear un programa de ordenador para gestionar los resultados de la quiniela de fútbol. Para
# ello vamos a utilizar dos tablas:
#  Equipos: Que es una tabla de cadenas donde guardamos en cada columna el nombre
# de los equipos de cada partido. En la quiniela se indican 15 partidos.
#  Resultados: Es una tabla de enteros donde se indica el resultado. También tiene dos
# columnas, en la primera se guarda el número de goles del equipo que está guardado
# en la primera columna de la tabla anterior, y en la segunda los goles del otro equipo.
# El programa ira pidiendo los nombres de los equipos de cada partido y el resultado del partido,
# a continuación se imprimirá la quiniela de esa jornada.
# ¿Qué modificación habría que hacer en las tablas para guardar todos los resultados de todas
# las jornadas de la temporada?

def ej15():

    print("")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 16

# Vamos a crear un programa que tenga el siguiente menú:

# Añadir número a la lista: Me pide un número de la lista y lo añade al final de la lista.
# Añadir número de la lista en una posición: Me pide un número y una posición, y si la posición
# existe en la lista lo añade a ella (la posición se pide a partir de 1).
# Longitud de la lista: te muestra el número de elementos de la lista.
# Eliminar el último número: Muestra el último número de la lista y lo borra.
# Eliminar un número: Pide una posición, y si la posición existe en la lista lo borra de ella (la
# posición se pide a partir de 1).
# Contar números: Te pide un número y te dice cuantas apariciones hay en la lista.
# Posiciones de un número: Te pide un número y te dice en que posiciones está (contando
# desde 1).
# Mostrar números: Muestra los números de la lista
# Salir

def ej16():

    print("")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 17
# Crear un programa que añada números a una lista hasta que introducimos un número
# negativo. A continuación debe crear una nueva lista igual que la anterior pero eliminando los
# números duplicados. Muestra esta segunda lista para comprobar que hemos eliminados los
# duplicados.

def ej17():

    print("")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Ejercicio 18
# Escriba un programa que permita crear una lista de palabras y que, a continuación de tres
# opciones:

# Contar: Me pide una cadena, y me dice cuantas veces aparece en la lista
# Modificar: Me pide una cadena, y otra cadena a modificar, y modifica todas alas apariciones
# de la primera por la segunda en la lista.
# Eliminar: Me pide una cadena, y la elimina de la lista.
# Mostrar: Muestra la lista de cadenas
# Terminar

print("")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

if __name__ == "__main__":
    main()