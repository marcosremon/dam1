def main():
    while True:
        eleccion = int(input("Elige qué ejercicio quieres ejecutar (número del ejercicio): "))
        if eleccion == 1:
            ej1()
            break
        if eleccion == 2:
            ej2()
            break
        else:
            print("Ejercicio no válido")

        opt = input("\nDesea seguir ejecutando los ejercicios? [y/n]").lower()
        if opt != 'y':
            break

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 1:
#Escriba una clase MobilePhone que represente un teléfono móvil.

#Atributos:
#manufacturer (cadena de texto)
#screen_size (flotante)
#num_cores (entero)
#apps (lista de cadenas de texto)
#status (False: apagado, True: encendido)

#Métodos:
#__init__(self, manufacturer, screen_size, num_cores)
#power_on(self)
#power_off(self)
#install_app(self, app) (no instalar la app si ya existe)
#uninstall_app(self, app) (no borrar la app si no existe)

def ej1():

    class MobilePhone:
        manufacturer = str
        screen_size = float
        num_cores = int
        app = []
        status = bool #false = telefono apagado, true = telefono encendido

        def __init__(self, manufacturer, screen_size, num_cores):
            self.manufacturer = manufacturer
            self.screen_size = screen_size
            self.num_cores = num_cores

        def power_on(self):
            if self.status == False:
                self.status = True

        def power_off(self):
            if self.status == True:
                self.status = False

        def install_app(self, app):
            if app not in self.app:
                self.app.append(app)
            else:
                print("la aplicacion ya estaba iniciada")

        def uninstall_app(self):
                if app in self.app:
                    self.app.remove(app)
                else:
                    print("la aplicacion no estaba iniciada")

        def mostrar_todo(self):
            print(f"{self.manufacturer} {self.screen_size} {self.num_cores} {self.status} lista de apps: {self.app}")

    movil1 = MobilePhone("xiaomi", 6.32, 8)
    movil1.install_app("Buscador Google")
    movil1.install_app("Whatsapp")
    movil1.install_app("Telegram")

    movil1.mostrar_todo()

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

def ej2():
    class Persona:
        nombre = ""
        altura = 0
        peso = 0
        color_pelo = ""
        edad = 0

        def __init__(self, nombre, altura, peso, color_pelo, edad):
            self.nombre = nombre
            self.altura = altura
            self.peso = peso
            self.color_pelo = color_pelo
            self.edad = edad

        def mostrar(self):
            print(
                f"la persona tiene el nombre de {self.nombre}, tiene una edad {self.edad}, su altura es {self.altura} "
                f"su peso es {self.peso}, su color de pelo es {self.color_pelo}")

        def esmayordeedad(self) -> bool:
            if self.edad >= 18:
                return True
            else:
                return False

        @property
        def nombre(self):
            return self.__nombre

        @nombre.setter
        def nombre(self, nombre):
            self.__nombre = nombre

        @property
        def peso(self):
            return self.__peso

    alex = Persona("Alex", 150, 30, "marrón", 20)
    mario = Persona("Mario", 182, 90, "castaño", 19)
    marcos = Persona("marcos", 140, 170, "castaño", 17)

    alex.mostrar()
    mario.mostrar()
    marcos.mostrar()

    print(alex.esmayordeedad())
    print(marcos.esmayordeedad())


#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

if __name__ == "__main__":
    main()