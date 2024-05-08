from Personas import Personas

class Profesores(Personas):

    def __init__(self, nombre, apellidos, dni, direccion, telefono, asignaturas, horario):
        super().__init__(nombre, apellidos, dni, direccion, telefono)
        self.asignaturas = asignaturas
        self.horario = horario

    def mostrar_info(self):
        print(f"{super().mostrar_info()} implante las siguientes asignaturas {self.asignaturas}"
              f"y su horario es {self.horario}")