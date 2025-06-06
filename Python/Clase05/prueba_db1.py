import psycopg2 # esto es para poder conectarnos a Postgre

conexion = psycopg2.connect(
    user="postgres",
    password="admin",
    host="localhost",
    port="5432",
    database="test_bd"
)

try:
    with conexion:
        with conexion.cursor() as cursor:# un cursor es un objeto que nos permitira ejecutar sentencias de sql postg
            sentencia = 'SELECT * FROM persona WHERE id_persona IN %s' # placeholder
            entrada = input('Proporciona los id_persona (separados por comas): ')
            llaves_primarias = (tuple(entrada.split(', ')),) 
            # tupla de tuplas
            # llaves_primarias = (('1', '2', '3'),)
            # Esto es importante porque psycopg2 espera que, si usas IN %s, 
            # el valor asociado sea una tupla dentro de otra tupla para que lo entienda correctamente como un solo 
            # parámetro: una lista de valores.
            cursor.execute(sentencia, llaves_primarias) # el segundo argumento es una tupla de tuplas
            registros = cursor.fetchall() # fetchall() es un metodo que nos permite obtener todos los registros de la consulta
            for registro in registros:
                print(registro)
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    print('Se cierra la conexion a la base de datos')
    conexion.close()

# https://www.psycopg.org/docs/usage.html