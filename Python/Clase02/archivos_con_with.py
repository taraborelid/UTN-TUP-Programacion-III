# manejo de contexto with: sintaxis simplificada
from ManejoArchivo import ManejoArchivo

with open("prueba.txt", "r", encoding="utf-8") as archivo:
    print(archivo.read())

# no hace falta ni el try, ni el finally
#en el contexto de with lo que se ejecuta de manera automatica
# utiliza diferentes metodos: __enter__ este es el abre
# ahora el siguiente metodo es el que cierra: __exit__

with ManejoArchivo("prueba.txt") as archivo:
    print(archivo.read())