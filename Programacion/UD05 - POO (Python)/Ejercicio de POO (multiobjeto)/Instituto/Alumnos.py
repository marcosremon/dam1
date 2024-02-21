from Personas import Personas

class Alumnos(Personas):

    def __init__(self, nombre, apellidos, dni, direccion, telefono, grado, evaluacion_continua):
        super().__init__(nombre, apellidos, dni, direccion, telefono)
        self.grado = grado
        self.evaluacion_continua = bool

    def mostrar_info(self):
        print(f"{super().mostrar_info()} quiere pertenecer al grado {self.grado}, y el estado de su evaluacion"
              f"continua es {self.evaluacion_continua}")