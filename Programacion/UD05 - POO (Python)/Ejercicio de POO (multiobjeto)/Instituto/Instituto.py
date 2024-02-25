from Alumnos import Alumnos
from Profesores import Profesores
from Director import Director
from JefeEstudios import JefeEstudios

class Instituto:

    def __init__(self, direccion, telefono, director, jefe_estudios):
        self.direccion = direccion
        self.telefono = telefono
        self.director = director
        self.jefe_estudios = jefe_estudios
        self.alumno_smr1 = []
        self.alumno_smr2 = []
        self.alumno_dam1 = []
        self.alumno_dam2 = []

    def mostrar_info(self):
        print("-------------------------")
        print(f"la direccion del instituto es {self.direccion} su telefono es {self.telefono} "
              f"el director es {self.director} y su jefe de estudios es {self.jefe_estudios}")
        print("-------------------------")
        print("alumnos matriculados en smr1:")
        for i in self.alumno_smr1:
            print(f"  - {i.nombre} {i.apellidos} {i.dni}")
        print("-------------------------")
        print("alumnos matriculados en smr2:")
        for i in self.alumno_smr2:
            print(f"  - {i.nombre} {i.apellidos} {i.dni}")
        print("-------------------------")
        print("alumnos matriculados en dam1:")
        for i in self.alumno_dam1:
            print(f"  - {i.nombre} {i.apellidos} {i.dni}")
        print("-------------------------")
        print("alumnos matriculados en dam2:")
        for i in self.alumno_dam2:
            print(f"  - {i.nombre} {i.apellidos} {i.dni}")
        
    def matricular_alumno(self, alumno):
        grado = alumno.grado.upper()
        if grado == "SMR1" and len(self.alumno_smr1) < 30 and alumno not in self.alumno_smr2 + self.alumno_dam1 + self.alumno_dam2:
                self.alumno_smr1.append(alumno)
        elif grado == "SMR2" and len(self.alumno_smr2) < 30 and alumno not in self.alumno_smr1 + self.alumno_dam1 + self.alumno_dam2:
                self.alumno_smr2.append(alumno)
        elif grado == "DAM1" and len(self.alumno_dam1) < 30 and alumno not in self.alumno_smr2 + self.alumno_smr1 + self.alumno_dam2:
                self.alumno_dam1.append(alumno)
        elif grado == "DAM2" and len(self.alumno_dam2) < 30 and alumno not in self.alumno_smr2 + self.alumno_dam1 + self.alumno_smr2:
                self.alumno_dam2.append(alumno)

    def buscar_alumno(self, alumnos):
        alumno_grado = alumnos.grado
        print(f"el grado del alumno es {alumno_grado}")
        
    def dar_de_baja(self, alumno):
        for i in self.alumno_smr1:
            if i == alumno:
                self.alumno_smr1.remove(alumno)
        for i in self.alumno_smr2:
            if i == alumno:
                self.alumno_smr2.remove(alumno)
        for i in self.alumno_dam1:
            if i == alumno:
                self.alumno_dam1.remove(alumno)
        for i in self.alumno_dam2:
            if i == alumno:
                self.alumno_dam2.remove(alumno)