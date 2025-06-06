package domain;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }


    /*
    En la clase `Gerente`, el método `obtenerDetalles` ha sido sobreescrito,
    lo que implica que modifica o amplía el comportamiento del mismo método
    que se encuentra definido en la clase `Empleado`. Esto es posible gracias
    a la anotación `@Override`, que asegura que estamos redefiniendo un método existente de la clase base.
     */
    //@ es una anotacion que modifica el comportamiento del metodo que esta definido
    //en este caso le esta indicando al compilador que este metodo esta siendo escrito desde la clase padre
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", Departamento: " + departamento;
    }


}
