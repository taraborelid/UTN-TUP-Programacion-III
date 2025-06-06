
archivo = open(r"C:\Users\aceof\Desktop\UTN TUP - Tercer Semestre\Python\Clase02\prueba.txt", "r", encoding="utf-8") # las letras son: 'r' read, 'a' append, 'w' write
# print(archivo.read())
#print(archivo.read(15)) # lee los primeros 15 caracteres
#print(archivo.read(5)) # imprime continuando luego de las primeras 15 caracteres
#print(archivo.readline())# lee una linea entera de nuestro archivo
#print(archivo.readline())


# vamos a iterar el archivo, cada una de las lineas
#for linea in archivo:
    # print(linea) # iteramos todos los elementos del archivo
    # print(archivo.readlines()) # accedemos al archivo como si fuera una lista
print(archivo.readlines(1)) # accedemos al archivo como si fuera una lista

with open(r"C:\Users\aceof\Desktop\UTN TUP - Tercer Semestre\Python\Clase02\prueba.txt", "r", encoding="utf-8") as archivo:
    lineas = archivo.readlines()
    for n in range(len(lineas)):
        print(n, lineas[n])

