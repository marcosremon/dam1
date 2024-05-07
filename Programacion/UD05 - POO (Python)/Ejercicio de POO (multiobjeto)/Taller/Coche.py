from Vehiculo import Vehiculo

class Coche(Vehiculo):

    def __init__(self, marca, modelo, color, anyo_fabricaccion, kilometraje):
        super().__init__(marca, modelo)
        self.color = color
        self.anyo_fabricacion = anyo_fabricaccion
        self.kilometraje = kilometraje

    def mostrar_info(self):
        print(f"{super().mostrar_info()} su color es {self.color} se fabrico en el año {self.anyo_fabricacion}"
              f"y tiene {self.kilometraje} kilometros recorridos")