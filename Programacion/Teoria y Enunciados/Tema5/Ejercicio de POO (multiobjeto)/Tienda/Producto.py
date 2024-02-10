class Producto:

    def __init__(self, id, marca, modelo, precio):
        self.id = id
        self.marca = marca
        self.modelo = modelo
        self.precio = precio

    def mostrar_info(self):
        return f"el id es {self.id} la marca es {self.marca}, el modelo es {self.modelo}, el precio es{self.precio}"