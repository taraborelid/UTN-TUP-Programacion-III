from catalogo_peliculas.dominio.Pelicula import Pelicula
from catalogo_peliculas.servicio.CatalogoPeliculas import CatalogoPeliculas


def menu():
    while True:
        print("\nMenú:")
        print("1) Agregar película")
        print("2) Listar películas")
        print("3) Eliminar archivo de películas")
        print("4) Salir")

        opcion = input("Seleccione una opción: ")

        if opcion == "1":
            nombre = input("Ingrese el nombre de la película: ")
            pelicula = Pelicula(nombre)
            CatalogoPeliculas.agregar_pelicula(pelicula)
            print(f'Película "{nombre}" agregada.')

        elif opcion == "2":
            print("Peliculas en el catalogo:")
            CatalogoPeliculas.listar_peliculas()

        elif opcion == "3":
            CatalogoPeliculas.eliminar()
            print("Archivo de peliculas eliminado.")
        elif opcion == "4":
            print("Saliendo del programa.")
            break
        else:
            print("Opcion no valida, intente de nuevo.")

if __name__ == "__main__":
    menu()