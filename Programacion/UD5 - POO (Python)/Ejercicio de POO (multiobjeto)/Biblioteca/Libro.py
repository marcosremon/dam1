from Ficha import Ficha

class Libro(Ficha):

    def __init__(self, id, titulo, autor, editorial):
        super().__init__(id, titulo)
        self.autor = autor
        self.editorial = editorial

    def mostrar_info(self):
        print(f"{super().mostrar_info()} el autor es {self.autor} y la editorial es {self.editorial}")