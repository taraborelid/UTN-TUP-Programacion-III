package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1 {

    //la clase3 es una clase hija de la clase1
    public Clase3(){

        super("Protected");
        this.atributoPublico = "Accedemos desde la clase3, la clase hija";
        System.out.println("atributoProtegido = " + this.atributoProtegido);
        this.atributoPublico = "Accedemos desde la clase3, la clase hija";
    }
}
