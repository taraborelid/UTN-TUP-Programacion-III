package paquete1;

import paquete2.Clase4;

public class TestDefault {
    public static void main(String[] args) {
        Clase2 clase2 = new Clase2();
        ClaseHija2 claseHija2 = new ClaseHija2();
        claseHija2.atributoDefault = "Modificacion del atributo default";
        System.out.println("ClaseH2 atributo default = " + claseHija2.atributoDefault);

        Clase4 clase4 = new Clase4("Publico");
        System.out.println(clase4.getAtributoPrivado());
        clase4.getAtributoPrivado();
        clase4.setAtributoPrivado("Privado");
    }
}
