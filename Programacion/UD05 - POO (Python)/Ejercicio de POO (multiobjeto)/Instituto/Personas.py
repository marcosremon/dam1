class Personas:

    def __init__(self, nombre, apellidos, dni, direccion, telefono):
        self.nombre = nombre
        self.apellidos = apellidos
        self.dni = dni
        self.direccion = direccion
        self.telefono = telefono

    def mostrar_info(self):
        return (f"su nombre es {self.nombre} su apellido es {self.apellidos} su dni es {self.dni} "
                f"su direccion es {self.direccion} y su telefono es {self.telefono}")