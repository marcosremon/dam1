from Ficha import Ficha

class Dvd(Ficha):

    def __init__(self, id, titulo, director, anyo_produccion, tipo):
        super().__init__(id, titulo)
        self.director = director
        self.anyo_produccion = anyo_produccion
        self.tipo = tipo

    def mostrar_info(self):
        print(f"{super().mostrar_info()} el director es {self.director} el año de produccion es {self.anyo_produccion} y es de tipo {self.tipo}")