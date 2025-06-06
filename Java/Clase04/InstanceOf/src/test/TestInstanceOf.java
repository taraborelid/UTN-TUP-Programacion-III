package test;

import domain.Empleado1;
import domain.Gerente1;

public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado1 empleado1 = new Empleado1("Juan", 1000);
        determinarTipo(empleado1);
        empleado1 = new Gerente1("Jose", 10000, "Administracion");
        determinarTipo(empleado1);
    }

    /*
        public static void determinarTipo(Empleado1 empleado1){

            if(empleado1 instanceof Empleado1){
                System.out.println("empleado1 es de tipo Empleado1");
            }else if(empleado1 instanceof Gerente1){
                System.out.println("empleado1 es de tipo gerente");
            }
        }
     El problema es que cualquier instancia de `Gerente1` **también es una
     instancia válida de** `Empleado1`, porque `Gerente1` hereda de
    `Empleado1`. Esto significa que cuando el objeto `empleado1` apunta
     a una instancia de `Gerente1`, la primera condición del `if`
     (`empleado1 instanceof Empleado1`) **siempre se evalúa como
     verdadera**, ya que `Gerente1` es un subtipo de `Empleado1`.
     Como resultado, la segunda condición (`empleado1 instanceof Gerente1`) nunca se evalúa.

     1.
    - El operador `instanceof` evalúa si un objeto es compatible
     con un tipo dado, y eso incluye todas las superclases del
     objeto. Por eso, una instancia de `Gerente1` también es válida
     como `Empleado1`.

     Debes evaluar primero si el objeto es una instancia de la subclase
     `Gerente1` antes de verificar la instancia de la clase base
     `Empleado1`. Es decir, cambia el orden de los condicionales:

     */

    public static void determinarTipo(Empleado1 empleado1) {

        if (empleado1 instanceof Gerente1) {
            System.out.println("empleado1 es de tipo Gerente1");
            /*
            La expresión `((Gerente1) empleado1).getDepartamento();`
            en Java utiliza **casting explícito** para tratar el
            objeto `empleado1` como una instancia de la clase `Gerente1`.
            Esto es útil en escenarios donde sabes que un objeto, aunque se
            está manejando desde una referencia de tipo base (en este caso `Empleado1`),
            realmente pertenece a una subclase más específica (`Gerente1`).
            otra orma de hacerlo es Gerente gerente = (Gerente) empleado;
            gerente.getDepartamento();
            Esto sucede porque en Java, cuando defines una referencia a una clase base (como `Empleado1 empleado1`),
            únicamente puedes acceder directamente a los métodos y atributos que están declarados en esa clase base
            (`Empleado1`), **aunque la referencia apunte a un objeto de una subclase** (como `Gerente1`). Esto está
             relacionado con las reglas de acceso en el tiempo de **compilación**, que únicamente consideran el tipo
              declarado de la referencia y no el tipo real del objeto al que apunta.

             */
            ((Gerente1) empleado1).getDepartamento();

        } else if (empleado1 instanceof Empleado1) {
            System.out.println("empleado1 es de tipo Empleado1");
        } else if (empleado1 instanceof Object) {
            System.out.println("empleado1 es de tipo Object");
        }
    }



}
