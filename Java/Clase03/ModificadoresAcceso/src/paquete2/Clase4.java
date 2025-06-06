package paquete2;

public class Clase4 {
    private String atributoPrivado = "atributo Privado";

    private Clase4(){
        System.out.println("constructor privado");
    }

    //getter and setter para atributo privado
    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }

    //creamos un constructor public para poder crear objetos
    public Clase4(String atributoPrivado){
        this.atributoPrivado = atributoPrivado;
        System.out.println("constructor publico");
    }

    //metodo private
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }
}
