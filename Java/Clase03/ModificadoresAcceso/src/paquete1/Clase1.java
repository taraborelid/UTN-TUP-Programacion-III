package paquete1;

public class Clase1 {
    public String atributoPublico = "Valor atributo public";
    protected String atributoProtegido = "valor atributo protected";

    public Clase1(){
        System.out.println("Constructor public");
    }

    public void metodoPublico(){
        System.out.println("Metodo public");
    }

    protected Clase1(String atributo){
        System.out.println("Constructor protected");

    }

    protected void metodoProtegido(){
        System.out.println("Metodo protected");
    }

}
