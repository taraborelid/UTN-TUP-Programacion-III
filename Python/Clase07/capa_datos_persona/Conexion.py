# Permite usar sys.exit(1) para cerrar el programa si hay un error grave (por ejemplo,
# no se puede conectar a la base de datos).
import sys
# Importa la librería para conectarse a bases de datos PostgreSQL.
#  Se le pone el alias bd para usarlo más fácilmente en el código.
import psycopg2 as bd
# psycopg2 as db es otra manera de importar el psycop2
# Importa logger que configuramos para el manejo de errores
from logger_base import log

class Conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'Huntdown089'
    _HOST = 'localhost'
    _DB_PORT = 5432
    _conexion = None
    _cursor = None

    @classmethod
    # Esto es un método de clase, no de instancia.
    #  Se usa cls(class) en lugar de self porque se refiere a la clase, no a un objeto.
    def obtenerConexion(cls):
        if cls._conexion is None:
            try:
                cls._conexion = bd.connect(host=cls._HOST,
                                          user=cls._USERNAME,
                                          password=cls._PASSWORD,
                                          port=cls._DB_PORT,
                                          database=cls._DATABASE)
                log.debug(f'Conexion establecida{cls._conexion}')
                return cls._conexion
            except Exception as e:
                # Si ocurre un error (por ejemplo, contraseña incorrecta), lo registra con log.error()
                # y luego termina el programa con sys.exit(1).
                log.error(f'Error conectando conexion: {e}')
                sys.exit(1)
        else:
            # Si no hubo errores, devuelve la conexión creada.
            return cls._conexion

    @classmethod
    def obtenerCursor(cls):
        if cls._cursor is None:
            try:
                cls._cursor = cls._obtenerConexion().cursor()
                log.debug(f'Se abrio correctamente el cursor: {cls._cursor}')
                return cls._cursor
            except Exception as e:
                log.error(f'Error conectando conexion: {e}')
                sys.exit(1)
        else:
            return cls._cursor

if __name__ == '__main__':
    conexion = Conexion.obtenerConexion()
    cursor = conexion.cursor()