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
            sentencia = 'SELECT * FROM persona WHERE id_persona IN (1, 2);' # placeholder
            # id_persona =  int(input('Proporciona el id_persona: '))
            cursor.execute(sentencia)
            registros = cursor.fetchall() # fetchall() es un metodo que nos permite obtener todos los registros de la consulta
            for registro in registros:
                print(registro)
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    print('Se cierra la conexion a la base de datos')
    conexion.close()

# https://www.psycopg.org/docs/usage.html