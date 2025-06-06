# Declaramos una variable
try:
    archivo = open("prueba.txt", "w", encoding = "utf8") # la w es de la palabra write
    archivo.write("Programamos con diferentes tipos de archivos, ahora en txt. \n")
    archivo.write("Los ascentos son importantes para las palabras\n")
    archivo.write("como por ejemplo: acción, ejecución y producción\n")
    archivo.write("Las letras son: \nr read lee, \na append anexa, \nw write escribe, \nx exclusive crea un archivo,"
                  " \nr+ read and write, \na+ append and write, \nw+ write and read, \nx+ exclusive and read,")
    archivo.write("\nt esta es para texto o text, \nb archivos binarios, \no archivos de imagenes")
    archivo.write("\n\n")
    archivo.write("Con esto terminamos")
except Exception as e:
    print(e)
finally: # siempre se ejecuta
    archivo.close() # con esto se dee cerrar el archivo
# archivo.write('todo quedo perfecto') tendremos error porque ela rchivo se cerro