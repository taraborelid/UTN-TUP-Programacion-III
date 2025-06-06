class ManejoArchivo:
    def __init__(self, nombre_archivo):
        self.nombre_archivo = nombre_archivo

    def __enter__(self):
        print("Abriendo archivo".center(50, '-'))
        self.archivo = open(self.nombre_archivo, 'r', encoding= 'utf8') # encapsulamos el codigo dentro del metodo
        return self.archivo

    def __exit__(self, tipo_exception, valor_exception, traza_error):
        print('cerramos el recurso'.center(50, '-'))
        if self.nombre_archivo:
            self.nombre_archivo.close()
