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
        else:
            print("Ejercicio no válido")

        opt = input("\nDesea seguir ejecutando los ejercicios? [y/n]").lower()
        if opt != 'y':
            break

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 1
#Determine si una cadena de texto dada es un isograma, es decir, 
#no se repite ninguna letra. Ejemplos válidos de isogramas:
#    lumberjacks
#    background
#    downstream
#    six-year-old

def ej1():
    
    palabra = str(input("dime una palabra y te digo si es un isograma "))
    letras_analizadas = []
    isograma = True

    for mamasita in palabra:
        if mamasita in letras_analizadas:
            isograma = False
            break
        letras_analizadas.append(mamasita)
        
    if isograma:
        print("es un isograma")
    else:
        print("no es un isograma")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 2
#Dada una lista de números: [1, 25, 12, 4, 8 ,5 93, 4] 
#Imprima la lista ordenada. De menor a mayor

def ej2():
    
    lista = [1, 25, 12, 4, 8, 5, 93, 4]

    for mamasita in range(len(lista)):
        for papasito in range(mamasita+1, len(lista)):
            if lista[mamasita] > lista[papasito]:
               lista[mamasita], lista[papasito] = lista[papasito], lista[mamasita]
    print(lista)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 3
#Dados dos vectores (listas) de la misma dimensión, utilice la función zip() 
#para calcular su producto escalar. Entrada:
#v1 = [4, 3, 8, 1]
#v2 = [9, 2, 7, 3]

def ej3():
    
    v1 = [4, 3, 8, 1]
    v2 = [9, 2, 7, 3] 
    resultado = 0

    for mama, papa in zip(v1, v2):
        resultado = resultado + (mama*papa)
    print(resultado)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

if __name__ == "__main__":
    main()