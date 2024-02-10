from Producto import Producto

class Camisetas(Producto):

    def __init__(self, id, marca, modelo, precio, color, talla, tipo, composicion):
        super().__init__(id, marca, modelo, precio)
        self.color = color
        self.talla = talla
        self.tipo = tipo
        self.composicion = composicion

    def mostrar_info(self):
        print(f"{super().mostrar_info()} su color es {self.color} su talla es {self.talla} es de tipo {self.tipo} y tiene una composicion de {self.composicion}")