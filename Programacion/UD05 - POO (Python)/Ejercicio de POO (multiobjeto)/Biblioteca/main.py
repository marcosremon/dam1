from DVD import Dvd
from Libro import Libro
from Revista import Revista
from Bibilioteca import Biblioteca

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
