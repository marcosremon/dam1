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
        else:
            print("Ejercicio no válido")

        opt = input("\nDesea seguir ejecutando los ejercicios? [y/n]").lower()
        if opt != 'y':
            break

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 1: 
    #Escriba un programa en Python que acepte 3 números y calcule el mínimo. Usa condicionales. 
        #Entrada: 7, 4, 9 
        #Salida: 4

def ej1():
    
    num1 = int(input("dime el valor para el numero 1: "))
    num2 = int(input("dime el valor para el numero 2: "))
    num3 = int(input("dime el valor para el numero 3: "))

    if num1 < num2 and num1 < num3:
        print(num1)
    elif num2 < num1 and num2 < num3:
        print(num2)
    elif num3 < num1 and num3 < num2:
        print(num3)

#-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio2: 
    #Escriba un programa en Python que acepte un país (como «string») y muestre por pantalla su 
    #bandera (como «emoji»). Puedes restringirlo a un conjunto limitado de países. 
        #Entrada: Italia 
        #Salida: emoji de la bandera de italia

def ej2():
    
    g7=str(input("dime un pais del g7 "))

    if(g7 == "Estados Unidos"):
        print("Elegiste Estados Unidos " + "\U0001F1FA\U0001F1F8")
    elif (g7 == "Japon"):
        print("Elegiste Japon" + "\U0001F1EF\U0001F1F5")
    elif (g7 == "Alemania"):
        print("Elegiste Alemania" + "\U0001F1E9\U0001F1EA")
    elif (g7 == "Reino Unido"):
        print("Elegiste Reino Unido" + "\U0001F1EC\U0001F1E7")
    elif (g7 == "Francia"):
        print("Elegiste Francia" + "\U0001F1EB\U0001F1F7")
    elif (g7 == "Italia"):
        print("Elegiste Italia" + "\U0001F1EE\U0001F1F9")
    elif (g7 == "Canada"):
        print("Elegiste Canada" + "\U0001F1E8\U0001F1E6")
    else:
        print("el pais que escribiste no pertenece al g7")

#-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 3: 
    #Escriba un programa en Python que acepte edad, peso, pulso y plaquetas, y determine si una 
    #persona cumple con estos requisitos para donar sangre. (disponibles en la siguiente hoja) 
    #Entrada: edad=34; peso=81; pulso=70; plaquetas=150000 
    #Salida: Apto para donar sangre
    
def ej3():
    
    edad = int(input("diem la cantidad de la edad del paciente: "))
    peso = int(input("diem la cantidad del peso del paciente: "))
    pulso = int(input("diem la cantidad del pulso del paciente: "))
    plaquetas = int(input("diem la cantidad de las plaquetas del paciente: "))

    if (edad >= 18 and edad <= 65) and (plaquetas > 150000) and (peso > 50) and (pulso > 50 and pulso < 110):
        print("el paciente es apto para donar sangre")
    else:
        print("el paciente no es apto")

#-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 4: 
    #Escriba un programa en Python que acepte la opción de dos jugadoras en Piedra-Papel-Tijera y 
    #decida el resultado. 
        #Entrada: person1=piedra; person2=papel 
        #Salida: Gana persona2: El papel envuelve a la piedra

def ej4():
    
    import random

    fin = 0
    #creamos la variable fin=0 para que en los ifs que son empate vuelvan a jugar, pero los ifs que no son empate
    #entrando en el while y los que no son empate estan representados con fin=1 para que no entren en el bucle ya que hay un ganador

    while(fin==0):
        p1=str(input("elija entre piedra papel o tijera para empezar el juego "))
        mamasita=["piedra", "papel", "tijera"]
        p2=random.choice(mamasita)
        print("el segundo jugador eligio aleatoriamente " + str(p2))

    #estos ifs representan la victoria del segundo jugador en el juego
        if (p1 == "piedra" and p2 == "papel"):
            fin=1
            print("el ganador es el jugador 2 porque papel le gana a piedra")
        if (p1 == "papel" and p2 == "tijera"):
            fin=1
            print("el ganador es el jugador 2 porque tijera le gana al papel")
        if(p1 == "tijera" and p2 == "piedra"):
            fin=1
            print("el ganador es jugador 2 porque piedra le gana a tijera")

    #estos ifs representan la victoria del primer jugador en el juego 
        if (p2 == "piedra" and p1 == "papel"):
            fin=1
            print("el ganador es el jugador 1 porque papel le gana a piedra")
        if (p2 == "papel" and p1 == "tijera"):
            fin=1
            print("el ganador es el jugador 1 porque tijera le gana al papel")
        if(p2 == "tijera" and p1 == "piedra"):
            fin=1
            print("el ganador es jugador 1 porque piedra le gana a tijera")

    #estos ifs representan un empate en el juego
        if (p1 == "piedra"):
            if(p2 == "piedra"):
                fin=0
                print("empate piedra")
        if (p1 == "papel"):
            if(p2 == "papel"):
                fin=0
                print("empate papel")
        if (p1 == "tijera"):
            if(p2 == "tijera"):
                fin=0
                print("empate tijera")
        
#-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
            
if __name__ == "__main__":
    main()