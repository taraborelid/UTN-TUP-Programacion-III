import psycopg2  # esto es para poder conectarnos a Postgre

conexion = psycopg2.connect(
    user="postgres",
    password="admin",
    host="localhost",
    port="5432",
    database="test_bd"
)

try:
    with conexion:  # esto es para que no tengamos que cerrar la conexion manualmente
        # Ademas, esto es para que si ocurre un error, se haga un rollback automaticamente
        with conexion.cursor() as cursor:  # un cursor es un objeto que nos permitira ejecutar sentencias de sql postg
            sentencia = 'DELETE FROM persona WHERE id_persona=%s;'  # placeholder
            entrada = input('Digite el id de la persona a eliminar: ')
            # esto es para que el usuario ingrese el id de la persona a eliminar
            valores = (entrada, ) # Es una tupla de valores
            cursor.execute(sentencia, valores)  # esto es para ejecutar la sentencia
            # conexion.commit() commit() es un metodo que nos permite guardar los cambios en la base de datos
            # pero with ya lo hace automaticamente
            registros_actualizados = cursor.rowcount  # rowcount es un atributo que nos permite saber cuantas filas se vieron afectadas
            print(f'Los registros insertados son: {registros_actualizados}')  # esto es un entero
            cursor.execute('SELECT * FROM persona')
            personas = cursor.fetchall()
            for persona in personas:
                print(persona)
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    print('Se cierra la conexion a la base de datos')
    conexion.close()

# https://www.psycopg.org/docs/usage.html