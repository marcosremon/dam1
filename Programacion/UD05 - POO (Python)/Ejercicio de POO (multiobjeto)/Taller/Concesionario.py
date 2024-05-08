from Coche import Coche
from Motocicleta import Motocicleta

class Concesionario:

    def __init__(self):
        self.lista_coches = []
        self.lista_motos = []

    def agregar_vehiculo(self, vehiculo):
        if isinstance(vehiculo, Coche):
            self.lista_coches.append(vehiculo)
        elif isinstance(vehiculo, Motocicleta):
            self.lista_motos.append(vehiculo)

    def eliminar_vehiculo(self, vehiculo):
        for i in self.lista_coches:
            if i == vehiculo:
                self.lista_coches.remove(i)
        for j in self.lista_coches:
            if j == vehiculo:
                self.lista_coches.remove(i)

    def buscar_vehiculo(self, vehiculo):
        if isinstance(vehiculo, Coche):
            vehiculo.mostrar_info()
        elif isinstance(vehiculo, Motocicleta):
            vehiculo.mostrar_info()

    def mostrar_info(self):
        print("-------------------------------")
        for motocileta in self.lista_motos:
            motocileta.mostrar_info()
        for coche in self.lista_coches:
            coche.mostrar_info()