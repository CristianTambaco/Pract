package Modelo_de_Herencia_con_Sobreescritura;

public class CursoNatacionBasica extends CursoPractico {

    //atributos
    private int flotadores;

    //constructor
    public CursoNatacionBasica(String nombreCurso, int duracion, String equipoPractico, int flotadores) {
        super(nombreCurso, duracion, equipoPractico);
        this.flotadores = flotadores;
    }

    //getters
    public int getFlotadores() {
        return flotadores;
    }

    //setters
    public void setFlotadores(int flotadores) {
        this.flotadores = flotadores;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de Flotadores: " + flotadores);
    }
}
