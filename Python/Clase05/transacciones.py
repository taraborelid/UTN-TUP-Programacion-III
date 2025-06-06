import psycopg2 as bd # esto es para poder conectarnos a Postgre

conexion = bd.connect(
    user="postgres",
    password="admin",
    host="localhost",
    port="5432",
    database="test_bd"
)

try:
    # conexion.autocommit quiere decir que sino hacemos un commit antes de cerrar la conexion, no se guardaran los cambios en la base de datos
    # no es una buena practica, ya que si hay un error en la transaccion, no se podra hacer un rollback
    conexion.autocommit = False # aqui se inicia la transaccion

    cursor = conexion.cursor()# un cursor es un objeto que nos permitira ejecutar sentencias de sql postg
    sentencia = 'INSERT INTO persona (nombre, apellido, email) VALUES (%s, %s, %s);' # %s en sql significa que es un placeholder, este placeholder se sustituira por el valor que le pasemos
    valores = ('Maria', 'Esparza123456', 'mesparza@gmail.com')
    cursor.execute(sentencia, valores) # el segundo argumento es una tupla de tuplas
    
    sentencia = 'UPDATE persona SET nombre = %s, apellido = %s, email = %s WHERE id_persona = %s'
    valores = ('Juan', 'Lopez', 'jlopez@gmail.com',26)
    cursor.execute(sentencia, valores) # el segundo argumento es una tupla de tuplas
    
    # aqui se cierra la transaccion
    conexion.commit() # esto es para guardar los cambios en la base de datos haciendo el commit manualmente
    sentencia = 'SELECT * FROM persona'
    cursor.execute(sentencia)
    registros = cursor.fetchall() # fetchall() es un metodo que nos permite obtener todos los registros de la consulta
    for registro in registros:
        print(registro)
    print('Termina la transaccion')
except Exception as e:
    conexion.rollback() # sino se hace el commit porque hay un error, se hace un rollback para deshacer los cambios
    print(f'Ocurrio un error, se hizo un rollback: {e}')
finally:
    print('Se cierra la conexion a la base de datos')
    conexion.close()

# https://www.psycopg.org/docs/usage.html