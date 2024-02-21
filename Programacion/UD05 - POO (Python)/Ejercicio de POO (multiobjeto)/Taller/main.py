from Concesionario import Concesionario
from Coche import Coche
from Motocicleta import Motocicleta

coche1 = Coche("lada", "4x4", "rojo", 1800, 4000000)
coche2 = Coche("dacia", "logan", "azul_dacia", 2003, 400000)
coche3 = Coche("Toyota", "Corolla", "silver", 2020, 2500000)
coche4 = Coche("Ford", "Mustang", "blue", 2018, 3500000)

moto1 = Motocicleta("kawasaki", "z700", "i2", 700)
moto2 = Motocicleta("opresor", "mk2", "bumbum", 7)
moto3 = Motocicleta("Harley-Davidson", "Sportster", "cruiser", 1200)
moto4 = Motocicleta("Yamaha", "YZF-R6", "sport", 600)

concesionario = Concesionario()

concesionario.agregar_vehiculo(coche1)
concesionario.agregar_vehiculo(coche2)
concesionario.agregar_vehiculo(coche3)
concesionario.agregar_vehiculo(coche4)
concesionario.agregar_vehiculo(moto1)
concesionario.agregar_vehiculo(moto2)
concesionario.agregar_vehiculo(moto3)
concesionario.agregar_vehiculo(moto4)

concesionario.mostrar_info()

concesionario.eliminar_vehiculo(coche1)
concesionario.eliminar_vehiculo(coche2)
concesionario.eliminar_vehiculo(coche3)

concesionario.mostrar_info()

concesionario.buscar_vehiculo(moto1)