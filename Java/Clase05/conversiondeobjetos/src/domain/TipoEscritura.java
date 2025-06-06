package domain;

public enum TipoEscritura {

    //CLASICO y MODERNO son constantes publicas y estaticas predefinidas de ese tipo TipoEscritura.
    //Internamente son objetos estáticos de la clase TipoEscritura, por eso
    // puedes acceder a ellos como TipoEscritura.CLASICO.
    CLASICO("Escritura a Mano"),
    MODERNO("Escritura Digital");

    private final String descripcion;

    private TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
