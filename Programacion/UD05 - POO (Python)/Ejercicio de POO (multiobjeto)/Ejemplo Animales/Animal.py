class Animal:

    def __init__(self, numero_de_identificacion, sexo):
        self.numero_de_identificacion = numero_de_identificacion
        self.sexo = sexo
    def hacer_sonido(self):
        print("Haciendo sonido.... ")
    def dame_info(self):
        print(f"soy un animal y tengo el numero: {self.numero_de_identificacion} y soy {self.sexo}")