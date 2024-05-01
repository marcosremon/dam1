class Cliente:

    def __init__(self):
        self.lista_compra = []
        self.gasto = 0.0

    def compra_add(self, articulo):
        self.lista_compra.append(articulo)
        self.gasto += articulo.precio