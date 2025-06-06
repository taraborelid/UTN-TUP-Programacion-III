package test;

import domain.Empleado;
import domain.Gerente;


public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 1000);
        System.out.println("empleado1.obtenerDetalles() = " + empleado1.obtenerDetalles());
        imprimir(empleado1);


        Gerente gerente = new Gerente("Jose", 5000, "Sistemas");
        System.out.println("gerente1.obtenerDetalles() = " + gerente.obtenerDetalles());
        imprimir(gerente);

        //reutilizamos la variable
        empleado1 = new Gerente("Pedro", 6000, "Diseño");
        imprimir(empleado1);


    }

    /*
    POLIMORFISMO
    En el método estático `imprimir` de la clase `TestSobreescritura`,
    se demuestra el uso del polimorfismo. Aunque el método recibe un objeto
    de tipo `Empleado`, puede procesar tanto objetos de la clase `Empleado`
    como de la clase `Gerente`:

    1. **Extensibilidad del Código**
    Se pueden añadir nuevas clases derivadas que sobreescriban los métodos según necesidades específicas, sin modificar el método `imprimir`.
    2. **Reutilización de Código**
    El método `imprimir` trabaja con el tipo base (`Empleado`), por lo que no es necesario crear versiones específicas de este método para cada subclase.
    3. **Mantenimiento Sencillo**
    Los cambios realizados en la lógica de los métodos sobreescritos se reflejarán automáticamente donde sea que se utilicen.

     */
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }


}
