from Chandal import Chandal
from Camisetas import Camisetas
from Pantalones import Pantalones
from Balones import Balones

class Tienda:

    def __init__(self):
        self.lista_chandals = []
        self.lista_camisetas = []
        self.lista_pantalones = []
        self.lista_balones = []
        self.recaudacion = 0.0

    def consultar_stock(self, elemento, Balones):
        if isinstance(elemento, Balones):
            print(f"actualmente tenemos {len(self.lista_balones)} balones en stock")
        elif isinstance(elemento, Camisetas):
            print(f"actualmente tenemos {len(self.lista_camisetas)} camisetas en stock")
        elif isinstance(elemento, Chandal):
            print(f"actualmente tenemos {len(self.lista_chandals)} chandals en stock")
        elif isinstance(elemento, Pantalones):
            print(f"acutalmene tenemos {len(self.lista_pantalones)} pantalones en stock")

    def mostrar_objetos_a_la_venta(self):
        print("--------------------------------------------")
        if len(self.lista_balones) >= 1:
            print(f"los balones que hay a la venta son los siguientes:")
            for balon in self.lista_balones:
                balon.mostrar_info()
        else:
            print("actualmente no contamos con stock de balones")
        print("--------------------------------------------")
        if len(self.lista_pantalones) >= 1:
            print(f"los pantalones que hay a la venta son los siguientes:")
            for pantalon in self.lista_pantalones:
                pantalon.mostrar_info()
        else:
            print("actualmente no contamos con stock de pantalones")
        print("--------------------------------------------")
        if len(self.lista_camisetas) >= 1:
            print(f"las camisetas que hay a la venta son los siguientes:")
            for camiseta in self.lista_camisetas:
                camiseta.mostrar_info()
        else:
            print("actualmente no contamos con stock de camisetas")
        print("--------------------------------------------")
        if len(self.lista_chandals) >= 1:
            print(f"los chandals que hay a la venta son los siguientes:")
            for chandal in self.lista_chandals:
                chandal.mostrar_info()
        else:
            print("actualmente no contamos con stock de chandals")

    def mostrar_recaudacion_dia(self):
        print(f'La recaudación del dia es: {self.recaudacion}')

    def obejtos_a_la_venta(self, articulo):
        if isinstance(articulo, Balones):
            self.lista_balones.append(articulo)
        elif isinstance(articulo, Camisetas):
            self.lista_camisetas.append(articulo)
        elif isinstance(articulo, Chandal):
            self.lista_chandals.append(articulo)
        elif isinstance(articulo, Pantalones):
            self.lista_pantalones.append(articulo)

    def comprar(self, cliente):
        for articulo in cliente.lista_compra:
            if isinstance(articulo, Balones):
                self.lista_balones.remove(articulo)
                self.recaudacion += articulo.precio
            elif isinstance(articulo, Camisetas):
                self.lista_camisetas.remove(articulo)
                self.recaudacion += articulo.precio
            elif isinstance(articulo, Chandal):
                self.lista_chandals.remove(articulo)
                self.recaudacion += articulo.precio
            elif isinstance(articulo, Pantalones):
                self.lista_pantalones.remove(articulo)
                self.recaudacion += articulo.precio