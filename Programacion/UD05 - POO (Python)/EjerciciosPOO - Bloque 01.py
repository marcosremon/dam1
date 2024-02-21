def main():
    while True:
        eleccion = int(input("Elige qué ejercicio quieres ejecutar (número del ejercicio): "))
        if eleccion == 1:
            ej1()
            break
        if eleccion == 2:
            ej2()
            break
        if eleccion == 3:
            ej3()
            break
        if eleccion == 4:
            ej4()
            break
        if eleccion == 5:
            ej5()
            break
        if eleccion == 6:
            ej6()
            break
        if eleccion == 7:
            ej7()
            break
        if eleccion == 8:
            ej8()
            break
        if eleccion == 9:
            ej9()
            break
        else:
            print("Ejercicio no válido")

        opt = input("\nDesea seguir ejecutando los ejercicios? [y/n]").lower()
        if opt != 'y':
            break

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 1:
#Vamos a crear una clase llamada Persona. Sus atributos son: nombre, edad y DNI. Construye
#los siguientes métodos para la clase:
# Un constructor, donde los datos pueden estar vacíos.
# Los setters y getters para cada uno de los atributos. Hay que validar las entradas de datos.
# mostrar(): Muestra los datos de la persona.
# esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.

def ej1():

    class Persona:
        nombre = str
        edad = int
        dni = str

        def __init__(self, nombre, edad, dni):
            self.nombre = nombre
            self.edad = edad
            self.dni = dni

            @property
            def nombre(self):
                return self.__nombre
            @property
            def edad(self):
                return self.__edad
            @property
            def dni(self):
                return self.__dni
            @nombre.setter
            def nombre(self, nombre):
                self.__nombre = nombre
            @edad.setter
            def edad(self):
                self.__edad = edad
            @dni.setter
            def dni(self, dni):
                self.__dni = dni

        def mostrar(self):
            print(f"la persona se llama {self.__nombre} tiene el dni {self.dni} y tiene una edad de {self.__edad}")
        def es_mayor_de_eddad(self):
            if self.__edad >= 18:
                return True
            else:
                return False

    persona = Persona("antonio", 19, "123456789A")
    persona.mostrar()
    persona.es_mayor_de_eddad()

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 2:
#Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular (que es una persona)
#y cantidad (puede tener decimales). El titular será obligatorio y la cantidad es opcional.
#Construye los siguientes métodos para la clase:
# Un constructor, donde los datos pueden estar vacíos.
# Los setters y getters para cada uno de los atributos. El atributo no se puede modificar
#directamente, sólo ingresando o retirando dinero.
# mostrar(): Muestra los datos de la cuenta.
# ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es
#negativa, no se hará nada.
# retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en números rojos.

def ej2():

    class Cuenta:

        titular = str
        cantidad = float

        def __init__(self, titular, cantidad):
            self.titular = titular
            self.cantidad = cantidad

        @property
        def titular(self):
            return self.__titular
        @titular.setter
        def titular(self, titular):
            self.__titular = titular
        @property
        def cantidad(self):
            return self.__cantidad
        @cantidad.setter
        def cantidad(self, cantidad):
            self.__cantidad = cantidad

        def mostrar(self):
            print(f"la cuenta es de {self.__titular} y tiene {self.__cantidad}")
        def ingresar(self, cantidad):
            if cantidad > 0:
                self.cantidad += cantidad
        def retirar(self, cantidad):
            self.cantidad -= cantidad

    cuenta = Cuenta("yo", 4)
    cuenta.ingresar(50)
    cuenta.ingresar(-8)
    cuenta.retirar(100)
    cuenta.mostrar()

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 3:
#Realizar un programa que conste de una clase llamada Alumno que tenga como atributos el
#nombre y la nota del alumno. Definir los métodos para inicializar sus atributos, imprimirlos y
#mostrar un mensaje con el resultado de la nota y si ha aprobado o no.

def ej3():

    class Alumno:

        nombre = str
        nota = float

        def __init__(self, nombre, nota):
            self.nombre = nombre
            self.nota = nota
        def mostrar_info(self):
            print(f"la persona se llama {self.__nombre} y tiene una nota de {self.__nota}")
        def ha_aprobado(self):
            if self.nota > 5:
                print(f"ha aprobado")
            else:
                print(f"suspendido")

    alumno = Alumno("pepe", 4)
    alumno.mostrar_info()
    alumno.ha_aprobado()

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 4:
#Desarrollar un programa que cargue los datos de un triángulo. Implementar una clase con los
#métodos para inicializar los atributos, imprimir el valor del lado con un tamaño mayor y el tipo
#de triángulo que es (equilátero, isósceles o escaleno).

def ej4():

    class Triangulo:

        lado1 = float
        lado2 = float
        lado3 = float

        def __init__(self, lado1, lado2, lado3):
            self.lado1 = lado1
            self.lado2 = lado2
            self.lado3 = lado3
        def lado_mayor(self):
            maximo = max(self.lado1, self.lado2, self.lado3)
            print(f"el lado mas grande mide: {maximo}")
        def tipo_triangulo(self):
            if self.lado1 == self.lado2 and self.lado1 == self.lado3:
                print("es un triangulo equilatero")
            elif self.lado1 != self.lado2 and self.lado1 != self.lado3:
                print("es un triangulo escaleno")
            else:
                print("es un triangulo isosceles")

    triangulo = Triangulo(5, 5, 3)
    triangulo.lado_mayor()
    triangulo.tipo_triangulo()
    triangulo2 = Triangulo(1, 2, 3)
    triangulo2.lado_mayor()
    triangulo2.tipo_triangulo()
    triangulo3 = Triangulo(2, 2, 3)
    triangulo3.lado_mayor()
    triangulo3.tipo_triangulo()

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 5:
#Realizar un programa en el cual se declaren dos valores enteros por teclado utilizando el
#método __init__. Calcular después la suma, resta, multiplicación y división. Utilizar un método
#para cada una e imprimir los resultados obtenidos. Llamar a la clase Calculadora.

def ej5():
    class Calculadora:

        def __init__(self):
            self.operando1 = float(input("Ingrese el primer operando: "))
            self.operando2 = float(input("Ingrese el segundo operando: "))

        def suma(self):
            return self.operando1 + self.operando2

        def resta(self):
            return self.operando1 - self.operando2

        def multiplicacion(self):
            return self.operando1 * self.operando2

        def division(self):
            return self.operando1 / self.operando2

    cal = Calculadora()
    print("Suma:", cal.suma())
    print("Resta:", cal.resta())
    print("Multiplicación:", cal.multiplicacion())
    print("División:", cal.division())

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 6:
#Realizar una clase que administre una agenda. Se debe almacenar para cada contacto el
#nombre, el teléfono y el email. Además deberá mostrar un menú con las siguientes opciones
# Añadir contacto
# Lista de contactos
# Buscar contacto
# Editar contacto
# Cerrar agenda

def ej6():

    print("")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 7:
#En un banco tienen clientes que pueden hacer depósitos y extracciones de dinero. El banco
#requiere también al final del día calcular la cantidad de dinero que se ha depositado.
#Se deberán crear dos clases, la clase cliente y la clase banco. La clase cliente tendrá los
#atributos nombre y cantidad y los métodos __init__, depositar, extraer, mostrar_total.
#La clase banco tendrá como atributos 3 objetos de la clase cliente y los métodos __init__,
#operar y deposito_total.

def ej7():

    class Cliente:

        nombre = str
        cantidad = float

        def __init__(self, nombre, cantidad):
            self.nombre = nombre
            self.cantidad = cantidad

        def depositar(self, cantidad):
            self.cantidad += cantidad
        def extraer(self, cantidad):
            self.cantidad -= cantidad
        def mostrar_info(self):
                print(f"{self.nombre} {self.cantidad}")

    class Banco:

        cliente1 = Cliente("juan", 300)
        cliente2 = Cliente("pepe", 12)
        cliente3 = Cliente("marta", 50)

        def operar(self, cliente):
            numeroCliente = int(input("indica el numero de cliente con el que quieres operar (1,2,3): "))
            opcion = int(input("1 para ingresar \n2 para extraer: "))
            cantidad = float(input("introduce la cantidad: "))

            match opcion:
                case 1:
                    match numeroCliente:
                        case 1:
                            cliente1.depositar(cantidad)
                        case 2:
                            cliente2.extraer(cantidad)
                        case 3:
                            cliente2.extraer(cantidad)
                case 2:
                    match numeroCliente:
                        case 1:
                            cliente1.depositar(cantidad)
                        case 2:
                            cliente2.extraer(cantidad)
                        case 3:
                            cliente2.extraer(cantidad)
        def deposito_total(self):
            print(f"el deposito total es: {self.cliente1 + self.cliente2 + self.cliente3}")

    banco = Banco()
    banco.operar()
    banco.operar()
    banco.deposito_total()

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 8:
#Desarrollar un programa que conste de una clase padre Cuenta y dos subclases PlazoFijo y
#CajaAhorro. Definir los atributos titular y cantidad y un método para imprimir los datos en la
#clase Cuenta. La clase CajaAhorro tendrá un atributo llamado número de cuenta, y un método
#para mostrar la información.
#La clase PlazoFijo tendrá dos atributos propios, plazo e interés. Tendrá un método para
#obtener el importe del interés (cantidad*interés/100) y otro método para mostrar la
#información, datos del titular plazo, interés y total de interés.
#Crear al menos un objeto de cada subclase.

def ej8():

    class Cuenta:

        titular = str
        cantidad = float

        def __init__(self, titular, cantidad):
            self.titular = titular
            self.cantidad = cantidad

        def mestraDatos(self):
            print(f"{self.titular} {self.cantidad}")

    class PlazoFijo(Cuenta):

        plazo = int
        interes = float

        def __init__(self, titular, cantidad, plazo, interes):
            super.__init__(titular, cantidad)
            self.plazo = plazo
            self.interes = interes

        def importe_del_interes(self):
            return self.cantidad * self.interes/100
        def mostrar_info(self):
            print(f"titular: {self.titular} cantidad: {self.cantidad} plazo: {self.plazo} interes: {self.interes} total interes {self.importe_del_interes()}")

    class CuentaDeAhorro(Cuenta):

        numero_de_cuenta = int

        def __init__(self, titular, cantidad, ccc):
            super.__init__(titular, cantidad)
            self.numero_de_cuenta = ccc

        def muestra_info(self):
            print(f"{self.mestraDatos()} + ccc:{self.numero_de_cuenta}")

    cuentaAhorro = CuentaDeAhorro("juan", 300.0, 1822505050)
    plazoFijo = PlazoFijo("antonio", 500.0, 2, 2)
    cuentaAhorro.muestraDatos()
    plazoFijo.mestraDatos()

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 9:
#Basándonos en el ejercicio 2. Vamos a definir ahora una “Cuenta Joven”, para ello vamos a
#crear una nueva clase CuantaJoven que deriva de la anterior. Cuando se crea esta nueva clase,
#además del titular y la cantidad se debe guardar una bonificación que estará expresada en
#tanto por ciento.Construye los siguientes métodos para la clase:
# Un constructor.
# Los setters y getters para el nuevo atributo.
# En esta ocasión los titulares de este tipo de cuenta tienen que ser mayor de edad., por
#lo tanto hay que crear un método esTitularValido() que devuelve verdadero si el titular
#es mayor de edad pero menor de 25 años y falso en caso contrario.
# Además la retirada de dinero sólo se podrá hacer si el titular es válido.
# El método mostrar() debe devolver el mensaje de “Cuenta Joven” y la bonificación de la cuenta.
#Piensa los métodos heredados de la clase madre que hay que reescribir.

def ej9():
    from Ej2.Cuenta import Cuenta as Cuenta

    class CuentaJoven(Cuenta):
        bonificacion = float
        edad = int

        def __init__(self, titular, cantidad, bonificacion, edad):
            super().__init__(titular, cantidad)
            self.bonificacion = bonificacion
            self.edad = edad

        @property
        def bonificacion(self):
            return self.__bonificacion

        @bonificacion.setter
        def bonificacion(self, bonificacion):
            self.__bonificacion = bonificacion

        def esTitularValido(self) -> bool:
            if self.edad >= 18 and self.edad < 25:
                return True
            else:
                return False

        def retirar(self, cantidad):
            if self.esTitularValido():
                self.cantidad -= cantidad
            else:
                print("Usted no puede retirar dinero")

        def mostrar(self):
            print(f'Cuenta Joven, bonificación: {self.__bonificacion}')

    cuentajoven = CuentaJoven("Pepe", 200, 2.0, 19)
    cuentajoven.mostrar()
    cuentajoven.retirar(100)
    print(cuentajoven.cantidad)
    cuentajoven.edad = 80
    cuentajoven.retirar(100)
    print(cuentajoven.cantidad)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

if __name__ == "__main__":
    main()