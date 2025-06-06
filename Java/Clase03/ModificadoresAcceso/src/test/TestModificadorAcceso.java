package test;

import paquete1.Clase1;
import paquete2.Clase3;

public class TestModificadorAcceso {
    public static void main(String[] args) {


        Clase1 clase1 = new Clase1(); //aqui creamos objeto de la class Clase1 de tipo publico
        //si queremos pasarle por parametros una string para acceder al constructor protected no podriamos
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();
        Clase3 claseHija = new Clase3();
        System.out.println("claseHija = " + claseHija);
    }


    
}
