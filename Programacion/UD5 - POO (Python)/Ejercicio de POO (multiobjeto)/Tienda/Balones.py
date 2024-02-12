from Producto import Producto

class Balones(Producto):

    def __init__(self, id, marca, modelo, precio, tipo_deporte):
        super().__init__(id, marca, modelo, precio)
        self.tipo_deporte = tipo_deporte
        
    def mostrar_info(self):
        print(f"{super().mostrar_info()}, y su tipo de deporte es {self.tipo_deporte}")