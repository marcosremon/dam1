from Producto import Producto

class Chandal(Producto):

    def __init__(self, id, marca, modelo, precio, color, talla):
        super().__init__(id, marca, modelo, precio)
        self.color = color
        self.talla = talla

    def mostrar_info(self):
        print(f"{super().mostrar_info()}, su talla es {self.talla} y su color es {self.color}")