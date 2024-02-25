class Vehiculo:

    def  __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo

    def mostrar_info(self):
        return f"la marca es {self.marca}, el model {self.modelo}"