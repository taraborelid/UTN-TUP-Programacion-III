package test;

import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado; //declaramos la variable

        //Esto es polimorfismo: una misma variable (empleado) puede referenciar distintos tipos de objetos,
        //siempre que sean subtipos de Empleado.
        //Aqui tiene una referencia de tipo padre(Empleado) apuntando a un objeto de tipo hijo(Escritor)
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);

        /*cuando aqui ejecutamos System.out.println(empleado); Aunque empleado es de tipo Empleado, el objeto real es
         de tipo Escritor. Y como Escritor sobrescribe (@Override) el método toString(), Java ejecuta el toString()
         de la clase Escritor, no el del padre.
        Escritor sobrescribe toString()	Se usa el de Escritor
        Escritor NO sobrescribe toString()	Se usa el de Empleado
        Ninguno de los dos tiene toString()	Se usa el de Object, que imprime algo como domain.Escritor@1a2b3c4d
        A nivel compilación, el compilador solo te deja usar lo que sabe que tiene un Empleado.
        Pero en tiempo de ejecución, Java ve que el objeto real es un Escritor y usará sus métodos sobrescritos
        (como toString() o obtenerDetalles()).


         */
        System.out.println(empleado);

        System.out.printf(empleado.obtenerDetalles());

        //Si queremos llamar el metodo getTipoEscritura de la clase Escritor
        // con el objeto empleado debemos convertir el objeto
        // DOWNCASTING: Aqui convertimos una referencia de un tipo padre habia un tipo hijo
        // Ahora estás diciéndole al compilador: “Confía en mí, sé que este Empleado es en realidad un Escritor.”
        ((Escritor)empleado).getTipoEscritura();
        Escritor escritor = (Escritor)empleado;

        escritor.getTipoEscritura();

        //upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());


    }
}
