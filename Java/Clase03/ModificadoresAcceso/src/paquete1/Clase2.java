package paquete1;

public class Clase2 extends Clase1 {
    String atributoDefault = "Valor atributo por defecto";
    
    //Clase2(){
    //    System.out.println("Contructor Default");
    //}

    public Clase2(){
        super();
        this.atributoDefault = "Modificacion del atributo default";
        System.out.println("atributoDefault = " + atributoDefault);
        this.metodoDefault();
    }

    void metodoDefault(){
        System.out.println("Metodo Default");;
    }

}
