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
        else:
            print("Ejercicio no válido")

        opt = input("\nDesea seguir ejecutando los ejercicios? [y/n]").lower()
        if opt != 'y':
            break

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 1
#Escriba un programa que permita crear una lista de palabras. Para ello, el programa tiene que
#pedir un número y luego solicitar ese número de palabras para crear la lista. Por último, el
#programa tiene que escribir la lista.
#Dígame cuántas palabras tiene la lista: 3

#Dígame la palabra 1: Alberto
#Dígame la palabra 2: Benito
#Dígame la palabra 3: Carmen

#La lista creada es: ["Alberto", "Benito", "Carmen"]
#Dígame cuántas palabras tiene la lista: 0
#¡Imposible!

def ej1():

    palabras = []
    numero_de_palabras = int(input("dime cuantas palabras quieres "))

    for i in range(numero_de_palabras):
        palabra = str(input(f"dime la palabra numero {i+1}: "))
        palabras.append(palabra)
    print(f"la lista creada es: {palabras}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 2
#Escriba un programa que permita crear una lista de palabras y que, a continuación, pida una
#palabra y diga cuántas veces aparece esa palabra en la lista.
#Dígame cuántas palabras tiene la lista: 4
#Dígame la palabra 1: Carmen
#Dígame la palabra 2: Alberto
#Dígame la palabra 3: Benito
#Dígame la palabra 4: Carmen
#La lista creada es: ["Carmen", "Alberto", "Benito", "Carmen"]

#Dígame la palabra a buscar: Carmen
#La palabra "Carmen" aparece 2 veces en la lista.
#Dígame cuántas palabras tiene la lista: 4
#Dígame la palabra 1: Carmen
#Dígame la palabra 2: Alberto
#Dígame la palabra 3: Benito
#Dígame la palabra 4: Carmen
#La lista creada es: ["Carmen", "Alberto", "Benito", "Carmen"]

#Dígame la palabra a buscar: Alberto
#La palabra "Alberto" aparece una vez en la lista.
#Dígame cuántas palabras tiene la lista: 4
#Dígame la palabra 1: Carmen
#Dígame la palabra 2: Alberto
#Dígame la palabra 3: Benito
#Dígame la palabra 4: Carmen
#La lista creada es: ["Carmen", "Alberto", "Benito", "Carmen"]

#Dígame la palabra a buscar: David
#La palabra "David" no aparece en la lista.

def ej2():

    palabras = []
    contador = 0
    numero_de_palabras = int(input("dime cuantas palabras quieres "))

    for i in range(numero_de_palabras):
        palabra = str(input(f"dime la palabra numero {i + 1}: "))
        palabras.append(palabra)
    buscar_palabra = str(input("dime una palabra de la lista creada anteriormente para buscar "))

    for j in palabras:
        if j == buscar_palabra:
            contador += 1
    if buscar_palabra not in palabras:
        print(f"La palabra {buscar_palabra} no aparece en la lista")
    elif contador == 1:
        print(f"La palabra {buscar_palabra} aparece una vez en la lista")
    else:
        print(f"La palabra {buscar_palabra} aparece {contador} vez en la lista")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 3:
#Escriba un programa que permita crear una lista de palabras y que, a continuación, pida dos
#palabras y sustituya la primera por la segunda en la lista.
#Dígame cuántas palabras tiene la lista: 4

#Dígame la palabra 1: Alberto
#Dígame la palabra 2: Carmen
#Dígame la palabra 3: Benito
#Dígame la palabra 4: Carmen
#La lista creada es: ["Alberto", "Carmen", "Benito", "Carmen"]
#Sustituir la palabra: Carmen
#por la palabra: David
#La lista es ahora: ["Alberto", "David", "Benito", "David"]

def ej3():

    palabras = []
    palabras_cambiadas = []
    numero_de_palabras = int(input("dime cuantas palabras quieres "))

    for i in range(numero_de_palabras):
        palabra = str(input(f"dime la palabra numero {i + 1}: "))
        palabras.append(palabra)
    palabra_a_sustituir = str(input("dime una palabra la cual sustituira una de la lista "))
    palabra_sustituida = str(input("dime una palabra de la lista la cual sera sustituida "))

    for j in palabras:
        if j == palabra_a_sustituir:
            palabras_cambiadas.append(palabra_sustituida)
        else:
            palabras_cambiadas.append(j)

    print(f"la lista original era {palabras}")
    print(f"la lista cambiada es {palabras_cambiadas}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 4:
#Escriba un programa que permita crear una lista de palabras y que, a continuación, pida una
#palabra y elimine esa palabra de la lista.
#Dígame cuántas palabras tiene la lista: 4

#Dígame la palabra 1: Alberto
#Dígame la palabra 2: Carmen
#Dígame la palabra 3: Carmen
#Dígame la palabra 4: Benito
#La lista creada es: ["Alberto", "Carmen", "Carmen", "Benito"]
#Palabra a eliminar: Carmen
#La lista es ahora: ["Alberto", "Benito"]

def ej4():

    palabras = []
    numero_de_palabras = int(input("dime cuantas palabras quieres "))

    for i in range(numero_de_palabras):
        palabra = str(input(f"dime la palabra numero {i + 1}: "))
        palabras.append(palabra)
    eliminar_palabra = str(input("dime una palabra de la lista a eliminar "))

    while eliminar_palabra in palabras:
        palabras.remove(eliminar_palabra)
    print(palabras)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 5:
#Escriba un programa que permita crear dos listas de palabras y que, a continuación, elimine de
#la primera lista los nombres de la segunda lista.
#Dígame cuántas palabras tiene la lista: 5

#Dígame la palabra 1: Carmen
#Dígame la palabra 2: Carmen
#Dígame la palabra 3: Alberto
#Dígame la palabra 4: Benito
#Dígame la palabra 5: David
#La lista creada es: ["Carmen", "Carmen", "Alberto", "Benito", "David"]
#Dígame cuántas palabras tiene la lista de palabras a eliminar: 3

#Dígame la palabra 1: Benito
#Dígame la palabra 2: Juan
#Dígame la palabra 3: Carmen
#La lista de palabras a eliminar es: ["Benito", "Juan", "Carmen"]
#La lista es ahora: ["Alberto", "David"]

def ej5():

    lista1 = []
    lista2 = []
    eliminar_palabras = []
    numero_de_palabras1 = int(input("Dime cuántas palabras quieres en la primera lista: "))

    for i in range(numero_de_palabras1):
        palabra1 = str(input(f"Dime la palabra número {i + 1} para la primera lista: "))
        lista1.append(palabra1)

    numero_de_palabras2 = int(input("Dime cuántas palabras quieres en la segunda lista: "))
    for j in range(numero_de_palabras2):
        palabra2 = str(input(f"Dime la palabra número {j + 1} para la segunda lista: "))
        lista2.append(palabra2)

    for k in lista2:
        if k not in eliminar_palabras and k in lista1:
            eliminar_palabras.append(k)
    for palabra in eliminar_palabras:
        lista1.remove(palabra)

    print(f"La lista de palabras a eliminar es: {eliminar_palabras}")
    print(f"La lista es ahora: {lista1}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 6:
#Escriba un programa que permita crear una lista de palabras y que, a continuación, cree una
#segunda lista igual a la primera, pero al revés (no se trata de escribir la lista al revés, sino de
#crear una lista distinta).
#Dígame cuántas palabras tiene la lista: 4

#Dígame la palabra 1: Alberto
#Dígame la palabra 2: Carmen
#Dígame la palabra 3: Benito
#Dígame la palabra 4: Daniel
#La lista creada es: ["Alberto", "Carmen", "Benito", "Daniel"]
#La lista inversa es: ["Daniel", "Benito", "Carmen", "Alberto"]

def ej6():

    palabras = []
    palabras_invertidas = []
    numero_de_palabras = int(input("dime cuantas palabras quieres "))

    for i in range(numero_de_palabras):
        palabra = str(input(f"dime la palabra numero {i + 1}: "))
        palabras.append(palabra)
    palabras_invertidas = palabras[::-1]

    print(f"la lista creada es: {palabras}")
    print(f"la lista inversa es: {palabras_invertidas}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 7:
#Escriba un programa que permita crear una lista de palabras y que, a continuación, elimine los
#elementos repetidos (dejando únicamente el primero de los elementos repetidos).
#Dígame cuántas palabras tiene la lista: 4

#Dígame la palabra 1: Alberto
#Dígame la palabra 2: Carmen
#Dígame la palabra 3: Benito
#Dígame la palabra 4: Carmen
#La lista creada es: ["Alberto", "Carmen", "Benito", "Carmen"]
#La lista sin repeticiones es: ["Alberto", "Carmen", "Benito"]

def ej7():

    lista = []
    lista_sin_repetir = []
    numero_de_palabras = int(input("dime cuantas palabras quieres "))

    for i in range(numero_de_palabras):
        palabra = str(input(f"dime la palabra numero {i + 1}: "))
        lista.append(palabra)
    for j in lista:
        if j not in lista_sin_repetir:
            lista_sin_repetir.append(j)
    print(f"La lista creada es: {lista}")
    print(f"La lista sin repeticiones es: {lista_sin_repetir}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 8:
#Escriba un programa que permita crear dos listas de palabras y que, a continuación, escriba las
#siguientes listas (en las que no debe haber repeticiones):
# Lista de palabras que aparecen en las dos listas.
# Lista de palabras que aparecen en la primera lista, pero no en la segunda.
# Lista de palabras que aparecen en la segunda lista, pero no en la primera.
# Lista de palabras que aparecen en ambas listas.
#Nota: Para evitar las repeticiones, el programa deberá empezar eliminando los elementos
#repetidos en cada lista.

#Dígame cuántas palabras tiene la primera lista: 4
#Dígame la palabra 1: Carmen
#Dígame la palabra 2: Alberto
#Dígame la palabra 3: Benito
#Dígame la palabra 4: Carmen
#La primera lista es: ["Carmen", "Alberto", "Benito", "Carmen"]

#Dígame cuántas palabras tiene la segunda lista: 3
#Dígame la palabra 1: Benito
#Dígame la palabra 2: Juan
#Dígame la palabra 3: Carmen
#La segunda lista es: ["Benito", "Juan", "Carmen"]
#Palabras que aparecen en las dos listas: ["Carmen", "Benito"]
#Palabras que sólo aparecen en la primera lista: ["Alberto"]
#Palabras que sólo aparecen en la segunda lista: ["Juan"]
#Todas las palabras: ["Carmen", "Benito", "Alberto", "Juan"]

def ej8():
    lista1 = []
    lista2 = []
    palabras_en_las_dos_listas = []
    palabras_solo_lista1 = []
    palabras_solo_lista2 = []
    todas_palabras = []

    # Input de la primera lista
    numero_de_palabras1 = int(input("Dígame cuántas palabras tiene la primera lista: "))
    for i in range(numero_de_palabras1):
        palabra1 = input(f"Dígame la palabra {i + 1}: ")
        lista1.append(palabra1)

    # Eliminar repeticiones en la primera lista
    lista1 = list(set(lista1))

    print(f"La primera lista es: {lista1}")

    # Input de la segunda lista
    numero_de_palabras2 = int(input("Dígame cuántas palabras tiene la segunda lista: "))
    for j in range(numero_de_palabras2):
        palabra2 = input(f"Dígame la palabra {j + 1}: ")
        lista2.append(palabra2)

    # Eliminar repeticiones en la segunda lista
    lista2 = list(set(lista2))

    print(f"La segunda lista es: {lista2}")

    # Proceso para encontrar las palabras en ambas listas, solo en la primera, solo en la segunda
    for k in lista1:
        if k not in todas_palabras:
            todas_palabras.append(k)
        if k in lista2 and k not in palabras_en_las_dos_listas:
            palabras_en_las_dos_listas.append(k)
        if k not in lista2 and k not in palabras_solo_lista1:
            palabras_solo_lista1.append(k)

    for l in lista2:
        if l not in lista1 and l not in palabras_solo_lista2:
            palabras_solo_lista2.append(l)
        if l not in todas_palabras:
            todas_palabras.append(l)

    print("Palabras que aparecen en las dos listas:", palabras_en_las_dos_listas)
    print("Palabras que solo aparecen en la primera lista:", palabras_solo_lista1)
    print("Palabras que solo aparecen en la segunda lista:", palabras_solo_lista2)
    print("Todas las palabras:", todas_palabras)


#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

if __name__ == "__main__":
    main()