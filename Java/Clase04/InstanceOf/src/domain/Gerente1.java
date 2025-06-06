package domain;

public class Gerente1 extends Empleado1 {

    private String departamento;

    public Gerente1(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", Departamento: " + departamento;
    }
}
