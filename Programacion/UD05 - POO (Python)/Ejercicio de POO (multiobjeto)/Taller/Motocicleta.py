from Vehiculo import Vehiculo

class Motocicleta(Vehiculo):

    def __init__(self, marca, modelo, tipo_motor, cilindrada):
        super().__init__(marca, modelo)
        self.tipo_motor = tipo_motor
        self.cilindrada = cilindrada

    def mostrar_info(self):
        print(f"{super().mostrar_info()} tiene el tipo de motor {self.tipo_motor} y la cilindrada es {self.cilindrada}")