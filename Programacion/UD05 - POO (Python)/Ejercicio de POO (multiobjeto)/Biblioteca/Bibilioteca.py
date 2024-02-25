from DVD import Dvd
from Libro import Libro
from Revista import Revista

class Biblioteca:

    def  __init__(self):
        self.lista_dvd = []
        self.lista_libro = []
        self.lista_revista = []

    def anyadir_item(self, item):
        if isinstance(item, Dvd):
            self.lista_dvd.append(item)
        elif isinstance(item, Libro):
            self.lista_libro.append(item)
        elif isinstance(item, Revista):
            self.lista_revista.append(item)

    def mostrar_lista(self):
        print("--------------------------------------------")
        if len(self.lista_dvd) >= 1:
            print("los dvds que hay actualmente son:")
            for dvd in self.lista_dvd:
                dvd.mostrar_info()
        else:
            print("no tenemos este producto actualmente")
        print("--------------------------------------------")
        if len(self.lista_libro) >= 1:
            print("los libros que hay actualmente son:")
            for libro in self.lista_libro:
                libro.mostrar_info()
        else:
            print("no tenemos este producto actualmente")
        print("--------------------------------------------")
        if len(self.lista_revista) >= 1:
            print("las revistas que hay actualmente son:")
            for revista in self.lista_revista:
                revista.mostrar_info()
        else:
            print("no tenemos este producto actualmente")

    def eliminar_item(self, item):
        if item in self.lista_dvd:
            self.lista_dvd.remove(item)
        elif item in self.lista_libro:
            self.lista_libro.remove(item)
        elif item in self.lista_revista:
            self.lista_revista.remove(item)

    def buscar_item(self, item):
        print("--------------------------------------------")
        for dvd in self.lista_dvd:
            if dvd == item:
                dvd.mostrar_info()
        print("--------------------------------------------")
        for libro in self.lista_libro:
            if libro == item:
                libro.mostrar_info()
        print("--------------------------------------------")
        for revista in self.lista_revista:
            if revista == item:
                revista.mostrar_info()