from catalogo_peliculas.dominio import Pelicula

class CatalogoPeliculas:

    ruta_archivo = 'pelicula.txt'

    @staticmethod
    def agregar_pelicula(pelicula):

        archivo = open(CatalogoPeliculas.ruta_archivo, 'a', encoding='utf-8')
        archivo.write(str(pelicula))

    @staticmethod
    def listar_peliculas():
        try:
            with open(CatalogoPeliculas.ruta_archivo, 'r', encoding='utf-8') as archivo:
                lineas = archivo.readlines()
                if lineas:
                    print("Películas:")
                    for pelicula in lineas:
                        print(f"- {pelicula.strip()}")  # Imprime cada película con un formato claro.
                else:
                    print("No hay películas registradas.")
        except FileNotFoundError:
            print("El archivo no existe. Agrega películas primero.")

    @staticmethod
    def eliminar():
        open(CatalogoPeliculas.ruta_archivo, 'w').close()





