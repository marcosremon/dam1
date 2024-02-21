class Libro:
    def __init__(self, autor="", titulo=""):
        self.autor = autor
        self.titulo = titulo

    def __str__(self):
        return f"autor: {self.autor} titulo: {self.titulo}"

    def __eq__(self, other):
        if self.titulo == other.titulo and self.autor == other.autor:
            return True
        else:
            return False