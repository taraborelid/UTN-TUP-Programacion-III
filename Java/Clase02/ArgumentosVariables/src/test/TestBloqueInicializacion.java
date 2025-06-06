package test;

import domain.Persona1;

public class TestBloqueInicializacion {

    public static void main(String[] args) {
        Persona1 persona1 = new Persona1();
        System.out.println("persona1 = " + persona1);
        Persona1 persona2 = new Persona1();
        System.out.println("persona2 = " + persona2);

    }
}
