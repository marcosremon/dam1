from Libro import Libro as Libro

#----------------------------------------------------------------------------------------------------------------

#Realiza el mismo ejercicio en Python, en lugar de un ArrayList usa una Lista.

#----------------------------------------------------------------------------------------------------------------

listasinduplicado = []
listaconduplicado = [Libro("Don quijote", "Cervantes"), Libro("Orgullo y prejuicio", "Jane Austen"),
                    Libro("Frankenstein", "Mary Shelley"), Libro("Don quijote", "Cervantes"),
                    Libro("Don quijote", "Cervantes"), Libro("Don quijote", "Cervantes"),
                    Libro("Los tres mosqueteros", "Alexandre Dumas"),
                    Libro("Don quijote", "Cervantes"),
                    Libro("Cumbres borrascosas", "Emily Brontë")]

# Convertir el conjunto de nuevo en una lista
for libro in listaconduplicado:
    if libro not in listasinduplicado:
        listasinduplicado.append(libro)

#print(*listasinduplicado, sep=" ")
for libro in listaconduplicado:
    print(libro)