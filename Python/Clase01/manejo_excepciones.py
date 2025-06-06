from NumerosIgualesException import NumerosIgualesException

resultado = None

a = '10'
b = 0

try:
    a = int(input('Digite el primer numero: '))
    b = int(input('Digite el segundo numero: '))
    if a == b:
        raise NumerosIgualesException('Los numeros no pueden ser iguales')
    resultado = a / b
except TypeError as e:
    print(f'No se puede dividir entre {a} y {b}: {e},{type(e)}')
except ZeroDivisionError as e:
    print(f'No se puede dividir entre 0: {e}')
except Exception as e:
    print(f'Ocurrio un error: {e}')
else:
    print('No se arrojo ninguna excepcion.')
finally:
    print('Se ejecuto el finally')

print(f'El resultado es: {resultado}')
print('seguimos')