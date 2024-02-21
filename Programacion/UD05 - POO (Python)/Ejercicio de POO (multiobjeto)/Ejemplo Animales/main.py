from Animal import Animal
from Perro import Perro
from Perrera import Perrera

animalNormal = Animal("1a2b3c4d", "macho")
destructor_de_universos = Perro("1a2b3a", "Hembra", "patada")
princesa = Perro("1a2b3a44", "Macho", "Pitbull")
perro_sanchez = Perro("1a2b3a52", "Macho", "Salchicha")
perrera = Perrera("camino de santiago 15, Teruel", "aurelio")

perrera.nuevo_perro(destructor_de_universos)
perrera.nuevo_perro(princesa)
perrera.nuevo_perro(perro_sanchez)

perrera.dame_la_informacion_de_la_perrera()
perrera.se_muere_perro(perro_sanchez)