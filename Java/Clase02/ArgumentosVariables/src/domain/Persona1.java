package domain;

public class Persona1 {

    private final int idPersona;
    private static int contadorPersonas;
    //Un **bloque de inicialización estático** es una sección de código que se ejecuta **una sola vez**,
    // cuando la clase es cargada en memoria por el **ClassLoader**, antes de que se cree
    // cualquier instancia de esa clase y antes de que se invoquen métodos estáticos.
    //1.
    //    1.
    //    - Se utiliza comúnmente para inicializar variables **estáticas** de una clase.
    //    - Como los atributos estáticos pertenecen a la clase y no a las instancias, este bloque asegura que
    //    cualquier configuración inicial necesaria para esos atributos esté lista antes
    //    de que se usen.
    //
    //2. **Ejecución automática**:
    //    - Cuando la clase es cargada, el bloque de inicialización estático se ejecuta
    //    automáticamente, antes de cualquier otra cosa.
    //    - No importa si nunca se crean instancias de la clase, el bloque estático se
    //    ejecutará una vez si se accede a cualquier miembro estático (por ejemplo, un método o una variable).
    //
    //3. **Acceso limitado a variables de instancia**:
    //    - Como este bloque se ejecuta antes de que se creen las instancias de la clase,
    //    no puede acceder a variables de instancia (no estáticas). Intentarlo generará un
    //    **error de compilación**.
    //¿Por qué es útil un bloque de inicialización estático?**
    //    - Sirve para ejecutar código de configuración global, como inicializar atributos
    //    **estáticos** complejos, cargar recursos externos, o establecer conexiones a
    //    bases de datos compartidas entre todas las instancias.
    //¡Exactamente! Los bloques de inicialización **estáticos** son muy eficientes en cuanto a la
    // gestión de recursos porque se ejecutan **una sola vez** durante el ciclo de vida de
    // una clase, justo cuando esta es cargada en memoria por el **ClassLoader** de Java.
    // Comparado con los bloques **no estáticos**, que se ejecutan cada vez que se crea una
    // nueva instancia, los bloques estáticos tienen un impacto mínimo en los recursos
    //- Siempre utiliza el enfoque correcto según lo que necesites inicializar: **elementos estáticos**
    // con bloques estáticos y **elementos de instancia** con constructores.

    static{//bloque de inicializacion estatico
        System.out.println("Ejecucion de bloque estatico");
        ++Persona1.contadorPersonas;
        //idPersona = 10; no es estatico, por esto tenemos un error
    }

    {//bloque de inicializacion no estatico(contexto dinamico)
        System.out.println("Ejecucion de bloque no estatico");
        this.idPersona = Persona1.contadorPersonas++; //incrementamos el atributo
    }

    public Persona1(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
}
