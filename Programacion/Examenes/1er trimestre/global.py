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

#Escribe unfa funcion en python llamada "suma_recursiva" que calcule la suma de los primeros n numeros de forma
#recursiva. La suma de los primeros n numeros se define como:
#1 + 2 + 3 + 4 + ... + n

def ej1():

    def suma_recursiva(numero):

        if numero == 0:
            return 0
        else:
            return numero + suma_recursiva(numero - 1)

    num = 4
    resultado = suma_recursiva(num)
    print(f"la suma de los {num} primeros numeros es {resultado}")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Escribe una funcion en python llamada "combinar_listas_ordenadas" que trabaje dos listas ordenadas
#de numeros y devuelva una nueva lista que contenga todos los elementos de ambas listas ordenados de manera
#ascendente. Asegurate de que la nueva lista no contenga elementos duplicados

#nota: en este ejercicio no debes implementar interfaz de usuario

#lista1 = [2, 3, 8, 9, 58, 200]
#lista2 = [3, 8, 25, 120, 200, 300]

def ej2():

    def combinar_listas_ordenadas(lista1, lista2):

            lista_combinada = sorted(set(lista1 + lista2))
            return lista_combinada

    lista1 = [2, 3, 8, 9, 58, 200]
    lista2 = [3, 8, 25, 120, 200, 300]
    lista_sin_duplicados = combinar_listas_ordenadas(lista1, lista2)

    print(lista_sin_duplicados)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Desarrolla un programa que genere 30 numeros aleatorios entre 0 y 49. El programa debe mostar los numeros
#y cuantas veces ha aparecido dicho numero ordenados de mayor a menor segun el numero de apariciones.

#Ejemplo: [2, 5, 1, 1, 3, 5, 1]
#1 - 3 veces
#5 - 2 veces
#2 - 1 vez
#3 - 1 vez

def ej3():

    import random

    lista = []
    contador = 0

    for _ in range(30):
        aleatorio = random.randint(1, 50)
        lista.append(aleatorio)

    print(lista)

    for i in lista:
        contador = 0
        for j in lista:
            if j == i:
                contador += 1
        print(f"el numero {i} aparece {contador} veces")

# --------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#imagina que estas desarrollando un programa para simular una carrera en un circuito. Queremos modelar vehiculos
#como choches y motos que participan en la carrera. Para este ejercicio, tanto los coches y las motos
#podran participar en una misma carrera

#del circuito queremos guardar el nombre del circuito y una lista con los participantes en la carrera
#en el circuito tendremos un metodo: añadir_participante, que lo añade a la lista de participantes

#de los vehiculos queremos guardar el nombre(cadena), dorsal(entero), velocidad_actual(entero inicializado en 0)
#velocidad_maxima(entero) y tipo_de_combustible(cadena)

#agrega un metodo acelerar(km/h) a la clase vehiculo que simule la aceleracion del vehiculo. Este metodo
#debe aumentar la velocidad actual del vehiculo sumando el numero de km/h pasados como argumento al mismo. Este
#metodo debe impedir que se pase de su velocidad maxima

#crea dos clases coche y moto ambas deben de tener un atributo adicional: numero_de_ruedas que indica el numero
#de ruedas que tiene

#agrega un metodo sonido_motor() a ambas clases que imprima un mensaje indicando el sonido del motor del vehiculo.
#Si el tipo de combustible es electrico debera imprimir "silencio", si es gasolina tendra que imprimir "brum brum"
#y si es gasoil "sonido a cafetera"

#en la clase coche agrega un metodo adicional bajar_ventanilla() que imprima un mensaje indicando que la "ventanilla
#del coche con dorsal xxx esta bajada".

#en la clase moto agrega un metodo adicional abrochar_casco() que imprima un mensaje indicando que "el piloto
#con dorsal xxx se ha abrochado el casco"

#todas las clases deben tener un metodo mostrar_info() que nos muestre toda la informacion que hay en sus
#atributos (incluyendo la lista de participantes)

#por ultimo crea un metodo dentro de circuito: inicializa_carrera(). Este metodo recorrera la lista de vehiculos
#participantes en la carrera mostarndo la informacion del coche o la moto

#nota: en este ejercicio no debes implementar interfaz de usuario

#prueba el codigo
#1. crea un circuito
#2. crea 2 o 3 coches
#3. crea 2 o 3 motos
#4. introduce todos los coches y motos creados en la lista de participantes (usa el metodo creado para ello)
#5. llama a inicializar_carrera
#6. acelera un coche
#7. llama al metodo mostrar_info del coche que acabas de acelerar


def ej4():

    class Circuito:

        def __init__(self, nombre_circuito):
            self.nombre_circuito = nombre_circuito
            self.participantes = []

        def anyadir_participante(self, participante):
            self.participantes.append(participante)

        def mostrar_info(self):
            print(f"el nombre del circuito es {self.nombre_circuito}")
            for vehiculo in self.participantes:
                vehiculo.mostrar_info()
            print("------------------------------------")

        def inicializa_carrera(self):
            print("la carrera va a empezar los participantes son:")
            for vehiculo in self.participantes:
                vehiculo.mostrar_info()
            print("------------------------------------")

    class Vehiculos:

        nombre_piloto = str
        dorsal = int
        velocidad_actual = 0
        velocidad_maxima = int
        tipo_combustible = "gasolina"

        def __init__(self, nombre_piloto, dorsal, velocidad_actual, velocidad_maxima, tipo_combustible):
            self.nombre_piloto = nombre_piloto
            self.dorsal = dorsal
            self.velocidad_actual = velocidad_actual
            self.velocidad_maxima = velocidad_maxima
            self.tipo_combustible = tipo_combustible

        def mostrar_info(self):
            return (f"piloto: {self.nombre_piloto}, su dorsal es {self.dorsal}, su velocidad actual es "
                    f"{self.velocidad_actual}, su velocidad maxima es {self.velocidad_maxima} y utiliza "
                    f"{self.tipo_combustible} como combustible")

        def acelerar(self, km_pasados):
            suma_km = self.velocidad_actual + km_pasados
            if suma_km > self.velocidad_maxima:
                print(f"el vehiculo a alcanzado su velocidad maxima {self.velocidad_maxima}km/h")
            else:
                print(f"el vehiculo ahora va a {suma_km}km/h")
            print("----------------------------------------")

    class Coche(Vehiculos):

        def __init__(self, nombre_piloto, dorsal, velocidad_actual, velocidad_maxima, tipo_combustible, num_ruedas):
            super().__init__(nombre_piloto, dorsal, velocidad_actual, velocidad_maxima, tipo_combustible)
            self.num_ruedas = num_ruedas

        def sonido_motor(self, vehiculos):
            combustible = vehiculos.tipo_combustible.lower()
            if combustible == "electrico":
                print("silencio")
            elif combustible == "gasolina":
                print("brum brum")
            elif combustible == "gasoil":
                print("sonido cafetera")

        def bajar_ventanilla(self, coche):
            print(f"la ventanilla del coche con dorsal {coche.dorsal} esta bajada")

        def mostrar_info(self):
            print(f"{super().mostrar_info()} y tiene {self.num_ruedas} ruedas")

    class Moto(Vehiculos):

        def __init__(self, nombre_piloto, dorsal, velocidad_actual, velocidad_maxima, tipo_combustible, num_ruedas):
            super().__init__(nombre_piloto, dorsal, velocidad_actual, velocidad_maxima, tipo_combustible)
            self.num_ruedas = num_ruedas

        def sonido_motor(self, vehiculos):
            combustible = vehiculos.tipo_combustible.lower()
            if combustible == "electrico":
                print("silencio")
            elif combustible == "gasolina":
                print("brum brum")
            elif combustible == "gasoil":
                print("sonido cafetera")

        def abrochar_casco(self, moto):
            print(f"el piloto con dorsal {moto.dorsal} se ha abrochado el casco")

        def mostrar_info(self):
            print(f"{super().mostrar_info()} y tiene {self.num_ruedas} ruedas")

    circuito = Circuito("torremocha")

    coche1 = Coche("jaime", 17, 53, 80, "gasolina", 4)
    coche2 = Coche("matias", 18, 53, 80, "electrico", 4)
    coche3 = Coche("juan", 19, 53, 80, "gasoil", 4)

    moto1 = Moto("alex", 170, 70, 80, "electrico", 2)
    moto2 = Moto("jose", 108, 33, 80, "gasolina", 2)
    moto3 = Moto("carlos", 107, 44, 80, "gasoil", 2)

    circuito.anyadir_participante(coche1)
    circuito.anyadir_participante(coche2)
    circuito.anyadir_participante(coche3)

    circuito.anyadir_participante(moto1)
    circuito.anyadir_participante(moto2)
    circuito.anyadir_participante(moto3)

    circuito.inicializa_carrera()

    Vehiculos.acelerar(coche1, 50)

    Coche.mostrar_info(coche1)

# --------------------------------------------------------------------------------------------------------------------------------------------------------------------------

if __name__ == "__main__":
    main()