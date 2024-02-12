from Profesores import Profesores

class JefeEstudios(Profesores):

    def __init__(self, nombre, apellidos, dni, direccion, telefono, asignaturas, horario, complemento, localizable):
        super().__init__(nombre, apellidos, dni, direccion, telefono, asignaturas, horario)
        self.complemento = complemento
        self.localizable = bool

    def mostrar_info(self):
        print(f"{super().mostrar_info()} tiene un complemento de {self.complemento} "
              f"y su localizabilidad es {self.localizable}")