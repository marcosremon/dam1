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
        else:
            print("Ejercicio no válido")

        opt = input("\nDesea seguir ejecutando los ejercicios? [y/n]").lower()
        if opt != 'y':
            break

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 1:
#Crear una clase Libro que contenga los siguientes atributos:
#– ISBN
#– Titulo
#– Autor
#– Número de páginas
#Crear sus respectivos métodos get y set correspondientes para cada atributo. Crear el método
#mostrar_información() para mostrar la información relativa al libro con el siguiente formato:
#«El libro con ISBN creado por el autor tiene páginas»
#En el fichero main, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por pantalla.
#Por último, indicar cuál de los 2 tiene más páginas.

def ej1():

    class Libro:
        isbn = str
        titulo = str
        autor = str
        numero_paginas = int

        def __init__(self, isbn, titulo, autor, numero_paginas):
            self.isbn = isbn
            self.titulo = titulo
            self.autor = autor
            self.numero_paginas = numero_paginas

        @property
        def isbn(self):
            return self.__isbn
        @isbn.setter
        def isbn(self, isbn):
            self.__isbn = isbn
        @property
        def titulo(self):
            return self.__titulo
        @titulo.setter
        def titulo(self, titulo):
            self.__titulo = titulo
        @property
        def autor(self):
            return self.__autor
        @autor.setter
        def autor(self, autor):
            self.__autor = autor
        @property
        def numero_paginas(self):
            return self.__numero_paginas
        @numero_paginas.setter
        def numero_paginas(self, numero_paginas):
            self.__numero_paginas = numero_paginas

        def mostrar_info(self):
            print(f"El libro con ISBN: {self.__isbn} creado por el autor: {self.__autor} tiene {self.__numero_paginas} páginas")
        def mas_paginas(self, otro_libro):
            if self.__numero_paginas > otro_libro.numero_paginas:
                print(f"{self.__titulo} tiene más páginas que {otro_libro.titulo}")
            elif self.__numero_paginas < otro_libro.numero_paginas:
                print(f"{self.__titulo} tiene menos páginas que {otro_libro.titulo}")
            else:
                print(f"{self.__titulo} tiene el mismo número de páginas que {otro_libro.titulo}")

    libro1 = Libro("B12252222", "los mercenarios", "yo", "1250")
    libro2 = Libro("B122ESS12", "la vida de brayan", "monty", "650")
    libro1.mostrar_info()
    libro2.mostrar_info()

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 2:
#Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede
#tener decimales).
#El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo
#anterior.
#Crea sus métodos get, set y un método para mostrar por pantalla toda la información de la
#cuenta. Además tendrá dos métodos especiales:
#ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es
#negativa, no se hará nada.
#retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la
#que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.

def ej2():

    class Cuenta:

        titular = str
        cantidad = float

        def __init__(self, titular, cantidad):
            self.__titular = titular
            self.__cantidad = cantidad

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

        def mostrar_info(self):
            print(f"{self.titular} {self.cantidad}")
        def ingresar(self, cantidad):
            if cantidad > 0:
                self.__cantidad += cantidad
        def retirar(self, cantidad):
            if self.__cantidad - cantidad < 0:
                self.__cantidad = 0
            else:
                self.__cantidad -= cantidad

    cuenta = Cuenta("juan", 200.0)
    cuenta.ingresar(20.0)
    cuenta.retirar(120.0)
    cuenta.mostrar_info()
    cuenta.retirar(300.0)
    cuenta.mostrar_info()

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 3:
#Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación
#de 2º grado.
#Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
#Hay que insertar estos 3 valores para construir el objeto.
#Las operaciones que se podrán hacer son las siguientes:
#obtenerRaices(): imprime las 2 posibles soluciones
#obtenerRaiz(): imprime única raíz, que será cuando solo tenga una solución posible.
#getDiscriminante(): devuelve el valor del discriminante (double), el discriminante tiene la
#siguiente formula, (b^2)-4*a*c
#tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el
#discriminante debe ser mayor que 0.
#tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra,
#el discriminante debe ser igual que 0.
#calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuación, en caso de
#no existir solución, mostrarlo también.
#Formula ecuación 2º grado: (-b±√((b^2)-(4*a*c)))/(2*a)

def ej3():

    class Raices:

        a = int
        b = int
        c = int

        def __init__(self, a, b, c):
            self.a = a
            self.b = b
            self.c = c

        def obtener_raices(self):
            #(-b±√((b ^ 2) - (4 * a * c))) / (2 * a)
            raiz1 = (-self.b + ((self.b)**2 - (4*self.a*self.c))**0.5) / 2*self.a
            raiz2 = (-self.b - ((self.b)**2 - (4*self.a*self.c))**0.5) / 2*self.a
            print(f"la raiz positiva es: {raiz1}")
            print(f"la raiz negativa es: {raiz2}")
        def obtener_raiz(self):
            raiz1 = (-self.b + ((self.b)**2 - (4*self.a*self.c))**0.5) / 2*self.a
            raiz2 = (-self.b - ((self.b)**2 - (4*self.a*self.c))**0.5) / 2*self.a
            if raiz1 == raiz2:
                print(f"la raiz es: {raiz1}")
        def getDiscriminante(self):
            discriminante = (self.b)**2 - 4*self.a * self.c
            return discriminante
        def tiene_raices(self):
            if self.getDiscriminante() > 0:
                return True
            else:
                return False
        def tiene_raiz(self):
            if self.getDiscriminante() == 0:
                return True
            else:
                return False
        def calcular(self):
            if self.tiene_raiz():
                self.obtener_raices()
            elif self.tiene_raices():
                self.obtener_raices()
            else:
                print("no existen raices")



    raiz = Raices(100, 2, 300)
    raiz.calcular()

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 4:
#Haz una clase llamada Persona que siga las siguientes condiciones:
#Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. Piensa cual es
#el tipo más adecuado. Si quieres añadir algún atributo puedes hacerlo.
#Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0
#números, cadena vacía para String, etc.). Sexo será mujer por defecto, usa una constante para
#ello.
#Los métodos que se implementaran son:
#calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2 en m)), si esta
#fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número
#entre 20 y 25 (incluidos), significa que está por debajo de su peso ideal la función devuelve un
#0 y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1.
#Te recomiendo que uses constantes para devolver estos valores.
#esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
#comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Devolverá un
#booleano
#mostrar_información(): devuelve toda la información del objeto.
#generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su
#letra correspondiente. Este método será invocado cuando se construya el objeto. Puedes
#dividir el método para que te sea más fácil.
#Métodos get y set de cada parámetro, excepto de DNI.
#Ahora, crea una clase ejecutable que haga lo siguiente:
#Pide por teclado el nombre, la edad, sexo, peso y altura.
#Crea 3 objetos de la clase anterior, obteniendo los datos por teclado.
#Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de
#su peso ideal y mostrar un mensaje.
#Indicar para cada objeto si es mayor de edad.
#Por último, mostrar la información de cada objeto.

def ej4():

    import random
    class Persona:

        nombre = str
        edad = int
        dni = str
        peso = int
        altura = int
        MUJER = "m"
        sexo = MUJER

        def __init__(self, nombre, edad, sexo, peso, altura):
            self.nombre = nombre
            self.edad = edad
            self.dni = self.genera_dni()
            self.sexo = sexo
            self.peso = peso
            self.altura = altura

        def calcularIMC(self):
            PESOIDEAL = 0
            PESOBAJO = -1
            PESOALO = 1


            imc = self.peso / ((self.altura)**2)
            if imc < 20:
                return -1
            elif imc >= 20 and imc < 25:
                return 0
            else:
                return 1
        def es_mayor_de_edad(self):
            if self.edad >= 18:
                return True
            else:
                return False
        def comprobar_sexo(self, sexo):
            if sexo == "H" or sexo == "M":
                return True
            else:
                return False
        def mostrar_info(self):
            print(f"tu nombre es {self.nombre} tu edad es {self.edad} tu dni es {self.dni} tu sexo es {self.sexo} tu altura es {self.altura} y tu peso es {self.peso} ")
        def genera_dni(self):
            numero = random.randint(0, 99999999)
            letras = "TRWAGMYFPDXBNJZSQVHLCKE"
            letradeldni = letras[numero % 23]
            return str(numero) + letradeldni

    persona1 = Persona("Juan", 20, "H", 70, 150)
    persona2 = Persona("Andres", 19, "M", 90, 200)
    persona3 = Persona("Jaime", 23, "H", 50, 192)

    persona1.calcularIMC()
    persona2.calcularIMC()
    persona3.calcularIMC()

    persona1.es_mayor_de_edad()
    persona2.es_mayor_de_edad()
    persona3.es_mayor_de_edad()

    persona1.mostrar_info()
    persona2.mostrar_info()
    persona3.mostrar_info()

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 5:
#Haz una clase llamada Password que siga las siguientes condiciones:
#Que tenga los atributos longitud y contraseña . Por defecto, la longitud será de 8.
#Los métodos que implementa serán:
#esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener más de 2
#mayúsculas, más de 1 minúscula y más de 5 números.
#generarPassword(): genera la contraseña del objeto con la longitud por defecto.
#Ahora, crea un archivo main:
#Crea una lista de Passwords con el tamaño que tú le indiques por teclado.
#Crea un bucle que cree un objeto para cada posición de la lista.
#Indica también por teclado la longitud de los Passwords (antes de bucle).
#Crea otra lista de booleanos donde se almacene si el password de la lista de Password es o no
#fuerte (usa el bucle anterior).
#Al final, muestra la contraseña y si es o no fuerte. Usa este simple formato:
#contraseña1 valor_booleano1
#contraseña2 valor_bololeano2

def ej5():

    import string, random
    class Paswword:

        longitud = 8
        contrasenya = str

        def __init__(self):
            self.contrasenya = self.genera_contrasenya()

        def genera_contrasenya(self):
            passw = ("")
            for i in range(self.longitud):
                numero_o_letra = random.randint(0, 1)
                if numero_o_letra == 0: #sera un numero
                    passw = passw + str(random.randint(0, 9))
                else: #sera una letra
                    passw = passw + random.choice(string.ascii_letters)
        def es_fuerte(self):
            numeros = 0
            mayus = 0
            minus = 0
            print("")

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 6:
#Crearemos una clase padre llamada Electrodomestico con las siguientes características:
#Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso.
#Por defecto, el color será blanco, el consumo energético sera F, el precioBase es de 100 € y el
#peso de 5 kg. Usa constantes para ello.
#Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre está en
#mayúsculas o en minúsculas.
#Los métodos que implementara serán:
#comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es
#correcta usara la letra por defecto.
#comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por
#defecto.
#precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también.
#Esta es la lista de precios:
#Letra Precio
#A 100 €
#B 80 €
#C 60 €
#D 50 €
#E 30 €
#F 10 €
#Tamaño Precio
#Entre 0 y 19 kg 10 €
#Entre 20 y 49 kg 50 €
#Entre 50 y 79 kg 80 €
#Mayor que 80 kg 100 €
#Crearemos una clase hija llamada Lavadora con las siguientes características:
#Su atributo es carga, además de los atributos heredados.
#Por defecto, la carga es de 5 kg. Usa una constante para ello.
#Los métodos que se implementara serán:
#precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se
#incrementara el precio. Llama al método padre y añade el código necesario. Recuerda que las
#condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
#Crearemos una clase hija llamada televisión con las siguientes características:
#Sus atributos son resolución, tamaño (en pulgadas) y sintonizador TDT (booleano), además de
#los atributos heredados.
#Por defecto, el tamaño será de 20 pulgadas y el sintonizador será false.
#Los métodos que se implementara serán:
#precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y
#si tiene un sintonizador TDT incorporado, aumentara 50 €. Recuerda que las condiciones que
#hemos visto en la clase Electrodomestico también deben afectar al precio.
#Ahora crea un main que realice lo siguiente:
#Crea una lista de Electrodomesticos de 10 posiciones.
#Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
#Ahora, recorre este array y ejecuta el método precioFinal().
#Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un
#lado, el de las lavadoras por otro y la suma de los Electrodomesticos
#
#Por ejemplo, si tenemos un electrodoméstico con un precio final de 300, una lavadora de 200 y
#una televisión de 500, el resultado final sera de 1000 (300+200+500) para electrodomésticos,
#200 para lavadora y 500 para televisión.

def ej6():
    class Electrodomestico:
        CIEN = 100.0
        BLANCO = 'blanco'
        CONSUMO = 'F'
        PESO5 = 5.0
        precio_base = CIEN
        color = BLANCO
        consumo_energetico = CONSUMO
        peso = PESO5

        def __init__(self, precio_base=CIEN, color=BLANCO, consumo_energetico=CONSUMO, peso=PESO5):
            self.precio_base = precio_base
            self.color = color
            self.consumo_energetico = consumo_energetico
            self.peso = peso

        def cambia_color(self, color):
            if color.lower() not in ['blanco', 'negro', 'rojo', 'azul', 'gris']:
                print("Error, el color indicado no existe")
            else:
                self.color = color.lower()

        def comprobarConsumoEnergetico(self, consumo_energetico):
            if consumo_energetico.upper() in ['A', 'B', 'C', 'D', 'E', 'F']:
                self.consumo_energetico = consumo_energetico.upper()
            else:
                self.consumo_energetico = self.CONSUMO
                print("El consumo energetico no es correcto")

        def precio_final(self):
            if self.consumo_energetico == 'A':
                self.precio_base += 100
            elif self.consumo_energetico == 'B':
                self.precio_base += 80
            elif self.consumo_energetico == 'C':
                self.precio_base += 60
            elif self.consumo_energetico == 'D':
                self.precio_base += 50
            elif self.consumo_energetico == 'E':
                self.precio_base += 30
            elif self.consumo_energetico == 'F':
                self.precio_base += 10

            if self.peso >= 0 and self.peso <= 19:
                self.precio_base += 10
            elif self.peso >= 20 and self.peso <= 49:
                self.precio_base += 50
            elif self.peso >= 50 and self.peso <= 79:
                self.precio_base += 80
            elif self.peso >= 80:
                self.precio_base += 100

    class Lavadora(Electrodomestico):
        KILOS = 5.0
        carga = KILOS

        def __init__(self, precio_base, color, consumo_energetico, peso, carga=KILOS):
            super().__init__(precio_base, color, consumo_energetico, peso)
            self.carga = carga

        def precio_final(self):
            super().precio_final()
            if self.carga >= 30:
                self.precio_base += 50.0

    class Television(Electrodomestico):
        resolucion = float
        tamano = 20.0
        sintonizador = False

        def __init__(self, precio_base, color, consumo_energetico, peso, resolucion=0.0, tamano=20.0,
                     sintonizador=False):
            super().__init__(precio_base, color, consumo_energetico, peso)
            self.resolucion = resolucion
            self.tamano = tamano
            self.sintonizador = sintonizador

        def precio_final(self):
            super().precio_final()
            if self.resolucion > 40:
                self.precio_base = self.precio_base * 1.30
            if self.sintonizador == True:
                self.precio_base += 50

    l1 = Lavadora(300.0, 'Negro', 'B', 60, 20.0)
    l2 = Lavadora(400.0, 'Gris', 'C', 50, 25.0)
    l3 = Lavadora(450.0, 'Gris', 'C', 50, 25.0)
    tv1 = Television(500, "NEGRO", "B", 20, resolucion=1080, tamano=48.0, sintonizador=True)

    l1.precio_final()
    l2.precio_final()
    l3.precio_final()
    tv1.precio_final()

    print(f'{l1.precio_base}   {l2.precio_base}   {l3.precio_base}   {tv1.precio_base}')

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 7:
#Crearemos una clase llamada Serie con las siguientes características:
#Sus atributos son título, número de temporadas, entregado, género y creador.
#Por defecto, el número de temporadas es de 3 temporadas y entregado false.
#Los métodos que se implementara serán:
#Crea un método mostrar información que mostrará toda la información de la Serie
#Crearemos una clase Videojuego con las siguientes características:
#Sus atributos son título, horas estimadas, entregado, género y compañía.
#Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de atributos
#serán valores por defecto según el tipo del atributo.
#Los métodos que se implementara serán:
#Crea un método para mostrar toda la información del objeto.
#Crea una clase padre a ambas, en dicha clase deberás implementar unos métodos, piensa si
#además debes realizar algún cambio más:
#entregar(): cambia el atributo prestado a true.
#devolver(): cambia el atributo prestado a false.
#isEntregado(): devuelve el estado del atributo prestado.
#Ahora crea un main y realiza lo siguiente:
#Crea dos Lista, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
#Crea un objeto en cada posición de la lista, con los valores que desees.
#Entrega algunos Videojuegos y Series con el método entregar().
#Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, muéstralos por pantalla.
#Por último, indica el Videojuego tiene más horas estimadas y la serie con más temporadas.
#Muéstralos en pantalla con toda su información.

def ej7():
    class Entretenimiento:
        # titulo, numerodetemporadas = 3, entregado = False, genero = "", creador = ""
        # titulo, horas_estimadas = 10, entregado = False, genero = "", compania = ""

        def __init__(self, titulo, entregado, genero):
            self.titulo = titulo
            self.entregado = entregado
            self.genero = genero

        def entregar(self):
            self.entregado = True

        def devolver(self):
            self.entregado = False

        def is_entregado(self):
            return self.entregado

    class Serie(Entretenimiento):

        def __init__(self, titulo, entregado, genero, numerodetemporadas=3, creador=""):
            super().__init__(titulo, entregado, genero)
            self.numerodetemporadas = numerodetemporadas
            self.creador = creador

        def mostrar_info(self):
            print(f'{super().titulo} {self.numerodetemporadas} {super().entregado} {super().genero} {self.creador}')

    class Videojuego(Entretenimiento):

        def __init__(self, titulo, horas_estimadas=10, entregado=False, genero="", compania=""):
            super().__init__(titulo, entregado, genero)
            self.horas_estimadas = horas_estimadas
            self.compania = compania

    listaSerie = []
    listaVideo = []
    s1 = Serie("El Señor de los anillos", False, "Ficción", 8, "Tolkin")
    s2 = Serie("Juego de tronos", False, "Ficción", 6, "R.R. Martin")
    v1 = Videojuego("GTA", 100, entregado=False, genero="Tiros", compania="Rockstar")

    listaSerie.append(s1)
    listaSerie.append(s2)
    listaVideo.append(v1)

    s1.entregar()
    v1.entregar()

    numeroEntregados = 0
    for serie in listaSerie:
        if serie.is_entregado():
            numeroEntregados += 1
            print(serie.titulo)

    print("El numero de series entregadas es: " + str(numeroEntregados))

    numeroEntregadosJuegos = 0
    for juego in listaVideo:
        if juego.is_entregado():
            numeroEntregadosJuegos += 1
            print(juego.titulo)

    print("El numero de videojuegos entregadas es: " + str(numeroEntregadosJuegos))

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Ejercicio 8:
#Nos piden realizar una agenda telefónica de contactos.
#Un contacto está definido por un nombre y un teléfono (No es necesario de validar). Un
#contacto es igual a otro cuando sus nombres son iguales.
#Una agenda de contactos está formada por un grupo de contactos
#Los métodos de la agenda serán los siguientes:
#
#añadirContacto(Contacto c): Añade un contacto a la agenda. No se pueden meter contactos
#que existan, es decir, no podemos duplicar nombres, aunque tengan distinto teléfono.
#existeContacto(Conctacto c): indica si el contacto pasado existe o no.
#listarContactos(): Lista toda la agenda
#buscaContacto(String nombre): busca un contacto por su nombre y muestra su teléfono.
#eliminarContacto(Contacto c): elimina el contacto de la agenda, indica si se ha eliminado o no
#por pantalla
#Crea un menú con opciones por consola para probar todas estas funcionalidades.

def ej8():
    class Contacto:

        def __init__(self, nombre, telefono):
            self.nombre = nombre
            self.telefono = telefono

    class Agenda:

        def __init__(self):
            self.lista = []

        def anadir(self, contacto):
            self.lista.append(contacto)

        def existe_contacto(self, contacto):
            for persona in self.lista:
                if persona.nombre == contacto.nombre:
                    return True

        def listar_contacto(self):
            for persona in self.lista:
                print(f'{persona.nombre} {persona.telefono}')

        def buscar_contacto(self, contacto):
            for persona in self.lista:
                if persona.nombre == contacto.nombre:
                    print(f'{persona.nombre}  {persona.telefono}')

        def eliminar_contacto(self, contacto):
            for persona in self.lista:
                if persona.nombre == contacto.nombre:
                    self.lista.remove(persona)
                    print(f"El contacto {persona.nombre} {persona.telefono} ha sido borrado")
                    break
            else:
                print(f"El contacto {contacto.nombre} no existe")

    agenda = Agenda()
    c1 = Contacto("Pepe", 978604030)
    c2 = Contacto("Pepito", 978601300)
    c3 = Contacto("Juan", 978601360)
    c4 = Contacto("Mara", 978606060)

    agenda.anadir(c1)
    agenda.anadir(c2)
    agenda.anadir(c3)
    agenda.anadir(c4)

    agenda.buscar_contacto(Contacto("Mara", 00000))
    agenda.eliminar_contacto(Contacto("Cros", 0000))

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

if __name__ == "__main__":
    main()