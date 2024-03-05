from Instituto import Instituto
from Alumnos import Alumnos
from Profesores import Profesores
from Director import Director
from JefeEstudios import JefeEstudios

alumno1 = Alumnos("Carlos", "Martinez", "11111111X", "Calle Alumno 1", "555555555", "DAM1", True)
alumno2 = Alumnos("Laura", "Garcia", "22222222Y", "Calle Alumno 2", "666666666", "DAM2", True)
alumno3 = Alumnos("Pedro", "Lopez", "33333333Z", "Calle Alumno 3", "777777777", "SMR1", True)
alumno4 = Alumnos("Maria", "Rodriguez", "44444444W", "Calle Alumno 4", "888888888", "SMR2", False)
alumno5 = Alumnos("Javier", "Fernandez", "55555555V", "Calle Alumno 5", "999999999", "DAM1", True)
alumno6 = Alumnos("Sofia", "Hernandez", "66666666U", "Calle Alumno 6", "101010101", "DAM2", False)
alumno7 = Alumnos("Daniel", "Moreno", "77777777T", "Calle Alumno 7", "111111111", "SMR1", True)
alumno8 = Alumnos("Elena", "Gomez", "88888888S", "Calle Alumno 8", "121212121", "SMR2", True)
alumno9 = Alumnos("Luis", "Sanchez", "99999999R", "Calle Alumno 9", "131313131", "DAM1", False)
alumno10 = Alumnos("Ana", "Jimenez", "10101010Q", "Calle Alumno 10", "141414141", "DAM2", False)
alumno11 = Alumnos("David", "Perez", "12121212P", "Calle Alumno 11", "151515151", "SMR1", True)
alumno12 = Alumnos("Marta", "Garcia", "13131313O", "Calle Alumno 12", "161616161", "SMR2", True)
alumno13 = Alumnos("Antonio", "Martin", "14141414Ñ", "Calle Alumno 13", "171717171", "DAM1", True)
alumno14 = Alumnos("Isabel", "Ruiz", "15151515N", "Calle Alumno 14", "181818181", "DAM2", True)
alumno15 = Alumnos("Alejandro", "Sanz", "16161616M", "Calle Alumno 15", "191919191", "SMR1", True)


director = Director("Juan", "Perez", "12345678A", "Calle Principal", "123456789", ["Matemáticas", "Física"], "Mañana", 500, 40, 5)
jefe_estudios = JefeEstudios("Ana", "Gomez", "87654321B", "Calle Secundaria", "987654321", ["Lengua", "Historia"], "Tarde", 300, True)
instituto = Instituto("Calle Instituto", "987654321", director.nombre, jefe_estudios.nombre)

instituto.matricular_alumno(alumno1)
instituto.matricular_alumno(alumno1)
instituto.matricular_alumno(alumno2)
instituto.matricular_alumno(alumno3)
instituto.matricular_alumno(alumno4)
instituto.matricular_alumno(alumno5)
instituto.matricular_alumno(alumno6)
instituto.matricular_alumno(alumno7)
instituto.matricular_alumno(alumno8)
instituto.matricular_alumno(alumno9)
instituto.matricular_alumno(alumno10)
instituto.matricular_alumno(alumno11)
instituto.matricular_alumno(alumno12)
instituto.matricular_alumno(alumno13)
instituto.matricular_alumno(alumno14)
instituto.matricular_alumno(alumno15)

instituto.mostrar_info()

instituto.dar_de_baja(alumno1)
instituto.dar_de_baja(alumno1)
instituto.dar_de_baja(alumno2)
instituto.dar_de_baja(alumno3)
instituto.dar_de_baja(alumno4)

instituto.buscar_alumno(alumno1)

instituto.mostrar_info()
