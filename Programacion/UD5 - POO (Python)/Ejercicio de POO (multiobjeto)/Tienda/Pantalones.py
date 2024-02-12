from Producto import Producto

class Pantalones(Producto):

    def __init__(self, id, marca, modelo, precio, talla, color, longitud):
        super().__init__(id, marca, modelo, precio)
        self.talla = talla
        self.color = color
        self.longitud = longitud

    def mostrar_info(self):
        print(f"{super().mostrar_info()} la talla es {self.talla}, el color es {self.color}, la longitud es {self.longitud}")