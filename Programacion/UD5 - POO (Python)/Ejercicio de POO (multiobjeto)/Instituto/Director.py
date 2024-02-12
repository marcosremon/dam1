from Profesores import Profesores

class Director(Profesores):

    def  __init__(self, nombre, apellidos, dni, direccion, telefono, asignaturas, horario, complemento, horas_semanales, antiguedad):
        super().__init__(nombre, apellidos, dni, direccion, telefono, asignaturas, horario)
        self.complemento = complemento
        self.horas_semanales = horas_semanales
        self.antiguedad = antiguedad

    def mostrar_info(self):
        print(f"{super().mostrar_info()} su complemento es de {self.complemento} hace {self.horas_semanales} horas"
              f"a la semana y tiene {self.antiguedad} años de antiguedad como director")