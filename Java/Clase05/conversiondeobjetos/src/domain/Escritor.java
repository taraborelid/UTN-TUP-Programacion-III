package domain;

public class Escritor extends Empleado{

    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo,TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String toString() {
        return "Escritor{" +
                "tipoEscritura=" + tipoEscritura +
                '}'+ super.toString();
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura() {
        return this.tipoEscritura;
    }
}
