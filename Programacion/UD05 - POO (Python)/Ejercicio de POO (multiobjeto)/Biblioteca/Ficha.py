class Ficha:

    def __init__(self, id, titulo):
        self.id = id
        self.titulo = titulo

    def mostrar_info(self):
        return f"el id es {self.id} y su titulo es {self.titulo}"