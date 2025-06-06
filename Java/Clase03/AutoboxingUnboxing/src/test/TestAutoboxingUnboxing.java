package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        // Clases envolventes (Wrapper Classes)
        /*
            En Java, cada tipo de dato primitivo (como int, double, etc.) tiene
            una clase envolvente asociada. Estas clases permiten manejar los valores
            primitivos como objetos, lo que facilita operaciones más avanzadas,
            como trabajar con colecciones genéricas que requieren tipos de objetos.

            Ejemplo:
            - Para el tipo primitivo 'int', la clase envolvente es 'Integer'.
            Esto implica que puedes usar métodos y propiedades asociadas a 'Integer'
            para realizar operaciones con los valores numéricos.

         */

        int enteroPrimitivo = 10; // Este es el tipo de dato primitivo int
        System.out.println("enteroPrimitivo = " + enteroPrimitivo);

        /*
          Aquí definimos un objeto de la clase envolvente Integer.
          Esto aprovecha la característica conocida como "Autoboxing".
          Autoboxing es el proceso automático en el cual un valor primitivo
          (como el entero '10') es convertido automáticamente en su clase envolvente
          (en este caso, un objeto de tipo Integer).

          Nota: El autoboxing nos permite simplificar la conversión y trabajar
          fluidamente entre tipos primitivos y sus objetos envolventes.
        */
        Integer entero = 10; // El valor primitivo 10 se convierte automáticamente en un objeto Integer
        System.out.println("Entero = " + entero);

        /*
          Aquí usamos uno de los métodos disponibles en la clase Integer: byteValue().
          Este método convierte el valor del objeto Integer (en este caso 10)
          a su representación en formato byte.
        */
        System.out.println("Conversión a tipo primitivo: " + entero.byteValue());

        /*
          En esta línea, se está haciendo un "Unboxing".
          El unboxing es el proceso automático en el cual un objeto de una clase envolvente
          (en este caso, un objeto Integer) se convierte nuevamente en su valor primitivo
          (int en este caso). Aquí el objeto 'entero' se convierte en un valor de tipo primitivo int.
        */
        int entero2 = entero; // Proceso de unboxing automático
        System.out.println("entero2 = " + entero2);

        byte b = 1;                   // Tipo primitivo
        Byte wrapByte = b;            // Clase envolvente Byte (Autoboxing)

        short s = 10;                 // Tipo primitivo
        Short wrapShort = s;          // Clase envolvente Short

        int i = 100;                  // Tipo primitivo
        Integer wrapInt = i;          // Clase envolvente Integer

        long l = 1000L;               // Tipo primitivo
        Long wrapLong = l;            // Clase envolvente Long

        float f = 10.5f;              // Tipo primitivo
        Float wrapFloat = f;          // Clase envolvente Float

        double d = 20.5;              // Tipo primitivo
        Double wrapDouble = d;        // Clase envolvente Double

        char c = 'A';                 // Tipo primitivo
        Character wrapChar = c;       // Clase envolvente Character

        boolean bool = true;          // Tipo primitivo
        Boolean wrapBoolean = bool;   // Clase envolvente Boolean

        // Mostramos ejemplos de los objetos envolventes
        System.out.println("Byte: " + wrapByte);
        System.out.println("Short: " + wrapShort);
        System.out.println("Integer: " + wrapInt);
        System.out.println("Long: " + wrapLong);
        System.out.println("Float: " + wrapFloat);
        System.out.println("Double: " + wrapDouble);
        System.out.println("Character: " + wrapChar);
        System.out.println("Boolean: " + wrapBoolean);
    }

}

