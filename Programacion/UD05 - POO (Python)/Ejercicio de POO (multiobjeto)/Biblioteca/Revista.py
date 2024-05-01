from Ficha import Ficha

class Revista(Ficha):

    def __init__(self, id, titulo, numero_revistas, anyo_publicacion):
        super().__init__(id, titulo)
        self.numero_revistas = numero_revistas
        self.anyo_publicacion = anyo_publicacion

    def mostrar_info(self):
        print(f"{super().mostrar_info()} hay {self.numero_revistas} revistas y el año de publicacion fue {self.anyo_publicacion}")