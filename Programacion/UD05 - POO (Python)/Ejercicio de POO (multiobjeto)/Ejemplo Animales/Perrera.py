from Perro import Perro

class Perrera:

    def __init__(self, direccion, jefe):
        self.direccion = direccion
        self.jefe = jefe
        self.lista_de_perros = []

    def dame_la_informacion_de_la_perrera(self):
        print(f"la perrera esta en {self.direccion} y su jefe es {self.jefe} y tenemos", end= ' ')
        for perro in self.lista_de_perros:
            perro.dame_info()

    def nuevo_perro(self, perro):
        self.lista_de_perros.append(perro)

    def se_muere_perro(self,perro):
        self.lista_de_perros.remove(perro)