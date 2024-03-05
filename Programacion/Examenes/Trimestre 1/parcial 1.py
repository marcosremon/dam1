def main():
    while True:
        eleccion = int(input("Elige que ejercicio quieres ejecutar (número del ejercicio): "))
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
        else:
            print("Ejercicio no válido")

        opt = input("\nDesea seguir ejecutando los ejercicios? [y/n]").lower()
        if opt != 'y':
            break

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ej1. Crea un programa que detecte si hay una letra en este caso la "o" en una palabra o frase pedida por parametro o por teclado, en caso de que halla una "o" minuscula 
#se debera contar cuantaso letras "o" hay en la oracion.
#entrada: hola buenas como estas?
#salida: a letra o aparecio un total de 3 veces en tu frase

def ej1():

    palabra = "hola buenas como estas"
    contador = 0

    for i in palabra:
        if i == "o":
            contador += 1

    print(f"la letra o aparece un total de {contador} veces")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#ej2. Crea un programa que detecte si hay una vocal en una palabra o frase y en caso afirmativo la vocal tendras que eliminarla
#entrada: El pobo
#salida: l p b

def ej2():

    palabra = "el pobo"
    vocales = "aeiou"

    for i in palabra:
        if i not in vocales:
             print(i, end="")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#ej3. Crea un programa que imprima los numeros desde el 1 hasta el 100, cuando se imprima un numero multiplo de 3 en vez del numero se tendra que imprimir la palabra "fizz"
#si es multiplo de 5 se imprimira la palabra "buzz" y si es multiplo de 3 y de 5 se imprimira la palabra "fizzbuz"

def ej3():

    for i in range(1,101):
        if i % 3 == 0 and i % 5 == 0:
            i = "fizzbuz"
        elif i % 5 == 0:
            i = "buzz"
        elif i % 3 == 0:
            i = "fizz"
        print(i, end=" ")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#ej4. Crea un programa que al pedir una frase se encripte con el cifrado Cesar, este cifrado consiste en que cada letra del abecedario se conbierte en otra letra del abecedario
#en este ejercicio el paso sera de 3 posiciones es decir que el abecedario se convertira de:
#sin cifrado: 'abcdefghijklmnñopqrstuvwxyz'
#con cifrado: 'defghijklmnñopqrstuvwxyzabc'
 
def ej4():

    alfabeto = "abcdefghijklmnñopqrstuvwxyz"
    palabra = "ma-masita"
    resultado = ""

    for i in palabra:
        if i in alfabeto:
            posicion = alfabeto.index(i) + 3
            cifrado = alfabeto[posicion]
            resultado += cifrado
        else:
            resultado += i

    print(resultado)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

if __name__ == "__main__":
    main()