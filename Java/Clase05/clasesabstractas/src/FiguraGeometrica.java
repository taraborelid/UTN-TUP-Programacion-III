//Una clase abstracta es aquella que no se puede instanciar directamente; es decir,
// no puedes crear objetos de ella. Su objetivo es servir como una plantilla o modelo para que otras clases hereden de ella.
//es abstracta. Esto significa que la propia clase FiguraGeometrica no está completa: contiene un método abstracto llamado dibujar() sin implementación.
// Las clases que hereden de FiguraGeometrica deberán proporcionar la implementación concreta de este método.


public abstract class FiguraGeometrica {
    protected String tipoFigura;

    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    //Metodo abstracto
    public abstract void dibujar();


    public String getTipoFigura() {
        return tipoFigura;
    }
    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }   
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
}
