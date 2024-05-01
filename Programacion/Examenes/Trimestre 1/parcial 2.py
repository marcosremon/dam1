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
        else:
            print("Ejercicio no válido")

        opt = input("\nDesea seguir ejecutando los ejercicios? [y/n]").lower()
        if opt != 'y':
            break

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Escribe un programa en Python que tome una lista de nombres y elimine aquellos que aparezcan tres o más veces
#en la lista. Después de aplicar este filtro, imprime la lista resultante.

def ej1():

    lista = ["Antonio", "Juan", "Juan", "Pedro", "Lucas", "Ana", "Julian", "Ana", "Juan",
             "Ana", "Ana", "Lucia", "Pablo"]

    for i in lista:
        if lista.count(i) >= 3:
            lista.remove(i)

    print(lista)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Define una clase base llamada Empleado, que tiene los siguientes atributos: nombre: El nombre del empleado (str).
#edad: La edad del empleado (int) salario: El salario del empleado (float).
#Además, la clase Empleado tiene un atributo predeterminado llamado bono, inicializado en 10.0.
#Luego, crea dos clases derivadas de Empleado: La clase Desarrollador, que tiene un atributo adicional llamado
#lenguaje (Str). La clase Gerente, que tiene un atributo adicional llamado departamento (str). Cada clase derivada
#debe tener un método llamado calcular_bono() que actualice el atributo bono de acuerdo con ciertas reglas:
#Para los desarrolladores, el bono se calcula como el 15% de su salario. Para los gerentes, el bono se calcula
#como el 20% de su salario. Cada clase derivada también debe tener un método llamado mostrar_info() que imprima
#la información del empleado, incluyendo su nombre, edad, salario, área de trabajo
#(ya sea el lenguaje para desarrolladores o el departamento para gerentes) y el bono actual.
#Finalmente, crea dos instancias de trabajadores:
#trabajador1: Un desarrollador llamado Juan, de 23 años, con un salario de 2000.0€, trabajando en Python.
#trabajador2: Un gerente llamado Manuel, de 22 años, con un salario de 1922.0€, trabajando en el departamento de Informática.
#Llama al método calcular_bono() para cada uno de los trabajadores y luego al método mostrar_info() para mostrar
#la información completa de cada trabajador, incluyendo su bono actualizado.

def ej2():
    
    class Empleado:

        nombre = str
        edad = int
        salario = float

        def __init__(self, nombre, edad, salario):
            self.nombre = nombre
            self.edad = edad
            self.salario = salario
            self.bono = 10.0

    class Desarrollador(Empleado):

        lenguaje = str

        def __init__(self, nombre, edad, salario, lenguaje):
            super().__init__(nombre, edad, salario)
            self.lenguaje = lenguaje

        def calcular_bono(self):
            self.bono = self.salario * 0.15

        def mostrar_info(self):
            print(f"Este trabajador es {self.nombre}, tiene {self.edad} años, tiene un salario de {self.salario}€ "
                  f"y trabaja en {self.lenguaje} y un bono de: {self.bono}€")

    class Gerente(Empleado):

        departamento = str

        def __init__(self, nombre, edad, salario, departamento):
            super().__init__(nombre, edad, salario)
            self.departamento = departamento

        def calcular_bono(self):
            self.bono = self.salario * 0.20

        def mostrar_info(self):
            print(f"Este trabajador es {self.nombre}, tiene {self.edad} años, tiene un salario de {self.salario}€ "
                  f"y trabaja en {self.departamento} y un bono de: {self.bono}€")

    trabajador1 = Desarrollador("Juan", 23, 2000.0, "Python")
    trabajador2 = Gerente("Manuel", 22, 1922.0, "Informática")

    trabajador1.calcular_bono()
    trabajador1.mostrar_info()

    trabajador2.calcular_bono()
    trabajador2.mostrar_info()

# --------------------------------------------------------------------------------------------------------------------------------------------------------------------------

def ej3():

    #Escribe un programa en Python que encuentre el primer número primo mayor que un número dado entre los
    #Entrada: 24
    #Salida: 29

    numero = 24
    primos = []

    for i in range(2, 2000):
        primo = True
        for j in range(2, i):
            if i % j == 0:
                primo = False
                break
        if primo:
            primos.append(i)

    for k in primos:
        if k > numero:
            print(k)
            break

# --------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Define una clase llamada Ficha que tenga los siguientes atributos:
#id: El identificador único de la ficha (cadena de caracteres).
#titulo: El título de la ficha (cadena de caracteres).
#Además, la clase Ficha tiene un método mostrar_info() que devuelve una cadena con la información de la ficha.
#Crea tres clases derivadas de Ficha:
#Dvd: Representa un DVD, con atributos adicionales como director, año de producción y tipo.
#Libro: Representa un libro, con atributos adicionales como autor y editorial.
#Revista: Representa una revista, con atributos adicionales como número de revistas y año de publicación.
#Cada una de estas clases debe tener un método mostrar_info() que imprima la información específica de cada tipo de ficha.
#Define una clase llamada Biblioteca que tenga listas separadas para almacenar DVDs, libros y revistas.
#Implementa los siguientes métodos en la clase Biblioteca:
#anyadir_item(item): Agrega un objeto de tipo Ficha (DVD, libro o revista) a la biblioteca.
#eliminar_item(item): Elimina un objeto de tipo Ficha de la biblioteca.
#buscar_item(item): Busca un objeto de tipo Ficha en la biblioteca e imprime su información si se encuentra.
#mostrar_lista(): Imprime la lista de DVDs, libros y revistas actualmente en la biblioteca.Crea instancias
#de varios DVDs, libros y revistas, y agrégalas a la biblioteca utilizando el método anyadir_item().
#Llama al método mostrar_lista() para mostrar todos los elementos de la biblioteca.
#Elimina un elemento de la biblioteca utilizando el método eliminar_item() y luego muestra nuevamente la lista.
#Utiliza el método buscar_item() para buscar un elemento específico en la biblioteca e imprimir su información.

def ej4():

    class Biblioteca:

        def __init__(self):
            self.lista_dvd = []
            self.lista_libro = []
            self.lista_revista = []

        def anyadir_item(self, item):
            if isinstance(item, Dvd):
                self.lista_dvd.append(item)
            elif isinstance(item, Libro):
                self.lista_libro.append(item)
            elif isinstance(item, Revista):
                self.lista_revista.append(item)

        def mostrar_lista(self):
            print("--------------------------------------------")
            if len(self.lista_dvd) >= 1:
                print("los dvds que hay actualmente son:")
                for dvd in self.lista_dvd:
                    dvd.mostrar_info()
            else:
                print("no tenemos este producto actualmente")
            print("--------------------------------------------")
            if len(self.lista_libro) >= 1:
                print("los libros que hay actualmente son:")
                for libro in self.lista_libro:
                    libro.mostrar_info()
            else:
                print("no tenemos este producto actualmente")
            print("--------------------------------------------")
            if len(self.lista_revista) >= 1:
                print("las revistas que hay actualmente son:")
                for revista in self.lista_revista:
                    revista.mostrar_info()
            else:
                print("no tenemos este producto actualmente")

        def eliminar_item(self, item):
            if item in self.lista_dvd:
                self.lista_dvd.remove(item)
            elif item in self.lista_libro:
                self.lista_libro.remove(item)
            elif item in self.lista_revista:
                self.lista_revista.remove(item)

        def buscar_item(self, item):
            print("--------------------------------------------")
            for dvd in self.lista_dvd:
                if dvd == item:
                    dvd.mostrar_info()
            print("--------------------------------------------")
            for libro in self.lista_libro:
                if libro == item:
                    libro.mostrar_info()
            print("--------------------------------------------")
            for revista in self.lista_revista:
                if revista == item:
                    revista.mostrar_info()

    class Ficha:

        def __init__(self, id, titulo):
            self.id = id
            self.titulo = titulo

        def mostrar_info(self):
            return f"el id es {self.id} y su titulo es {self.titulo}"

    class Dvd(Ficha):

        def __init__(self, id, titulo, director, anyo_produccion, tipo):
            super().__init__(id, titulo)
            self.director = director
            self.anyo_produccion = anyo_produccion
            self.tipo = tipo

        def mostrar_info(self):
            print(
                f"{super().mostrar_info()} el director es {self.director} el año de produccion es {self.anyo_produccion} y es de tipo {self.tipo}")


    class Libro(Ficha):

        def __init__(self, id, titulo, autor, editorial):
            super().__init__(id, titulo)
            self.autor = autor
            self.editorial = editorial

        def mostrar_info(self):
            print(f"{super().mostrar_info()} el autor es {self.autor} y la editorial es {self.editorial}")

    class Revista(Ficha):

        def __init__(self, id, titulo, numero_revistas, anyo_publicacion):
            super().__init__(id, titulo)
            self.numero_revistas = numero_revistas
            self.anyo_publicacion = anyo_publicacion

        def mostrar_info(self):
            print(
                f"{super().mostrar_info()} hay {self.numero_revistas} revistas y el año de publicacion fue {self.anyo_publicacion}")

    biblioteca = Biblioteca()

    dvd1 = Dvd("302", "Titanic", "James Cameron", 1997, "Romance")
    dvd2 = Dvd("303", "The Dark Knight", "Christopher Nolan", 2008, "Action")
    dvd3 = Dvd("304", "Inception", "Christopher Nolan", 2010, "Sci-Fi")
    dvd4 = Dvd("305", "The Shawshank Redemption", "Frank Darabont", 1994, "Drama")
    dvd5 = Dvd("306", "Jurassic Park", "Steven Spielberg", 1993, "Adventure")

    libro1 = Libro("307", "Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Bloomsbury")
    libro2 = Libro("308", "To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.")
    libro3 = Libro("309", "1984", "George Orwell", "Secker & Warburg")
    libro4 = Libro("310", "The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons")
    libro5 = Libro("311", "The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company")

    biblioteca.anyadir_item(dvd1)
    biblioteca.anyadir_item(dvd2)
    biblioteca.anyadir_item(dvd3)
    biblioteca.anyadir_item(dvd4)
    biblioteca.anyadir_item(dvd5)

    biblioteca.anyadir_item(libro1)
    biblioteca.anyadir_item(libro2)
    biblioteca.anyadir_item(libro3)
    biblioteca.anyadir_item(libro4)
    biblioteca.anyadir_item(libro5)

    biblioteca.mostrar_lista()

    biblioteca.eliminar_item(dvd1)

    biblioteca.mostrar_lista()
    biblioteca.buscar_item(dvd2)

#--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

if __name__ == "__main__":
    main()