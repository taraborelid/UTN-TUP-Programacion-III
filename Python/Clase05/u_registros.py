import psycopg2 # esto es para poder conectarnos a Postgre

conexion = psycopg2.connect(
    user="postgres",
    password="admin",
    host="localhost",
    port="5432",
    database="test_bd"
)

try:
    with conexion: # esto es para que no tengamos que cerrar la conexion manualmente
        # Ademas, esto es para que si ocurre un error, se haga un rollback automaticamente
        with conexion.cursor() as cursor:# un cursor es un objeto que nos permitira ejecutar sentencias de sql postg
            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s;' # placeholder
            valores = (
                ('Juan Carlos', 'Roldan', 'rcarlos@gmail.com', 4), # esto es una tupla   
                ('Romina', 'Ayala', 'ayalar@gmail.com', 5) 
            ) # esto es una tupla de tuplas
            cursor.executemany(sentencia, list(valores)) # esto es para ejecutar la sentencia
            #conexion.commit() commit() es un metodo que nos permite guardar los cambios en la base de datos
            # pero with ya lo hace automaticamente
            registros_actualizados = cursor.rowcount # rowcount es un atributo que nos permite saber cuantas filas se vieron afectadas
            print(f'Los registros insertados son: {registros_actualizados}') # esto es un entero
            
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    print('Se cierra la conexion a la base de datos')
    conexion.close()

# https://www.psycopg.org/docs/usage.html