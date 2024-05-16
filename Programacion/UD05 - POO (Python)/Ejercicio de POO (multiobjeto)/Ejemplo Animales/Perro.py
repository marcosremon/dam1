from Animal import Animal

class Perro(Animal):

    def __init__(self, numero_de_identificacion, sexo, raza):
        super().__init__(numero_de_identificacion, sexo)
        self.raza = raza

    def hacer_sonido(self):
        print("soy un perro y ladro.... ")
    def dame_info(self):
        print(f"soy un animal y tengo el numero {self.numero_de_identificacion}, mi raza es {self.raza}")