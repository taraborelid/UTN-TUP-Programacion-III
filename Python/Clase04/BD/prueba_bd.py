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
            sentencia = 'SELECT * FROM persona WHERE id_persona = %s;' # %s es un marcador de posicion = placeholder
            id_persona =  int(input('Proporciona el id_persona: '))
            cursor.execute(sentencia, (id_persona,)) # el segundo argumento es una tupla, el primer argumento es la sentencia
            registros = cursor.fetchone() #Esto nos devuelve una tupla con el resultado de la consulta
            #fetchone() devuelve una sola fila, fetchall() devuelve todas las filas
            print(registros)
            print(conexion)
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    print('Se cierra la conexion a la base de datos')
    conexion.close()

# https://www.psycopg.org/docs/usage.html