package Modelo_de_Herencia_con_Sobreescritura;

public class CursoNatacionAvanzada extends CursoNatacionBasica {
    //atributos
    private String competencias;

    //constructor
    public CursoNatacionAvanzada(String nombreCurso, int duracion, String equipoPractico, int flotadores, String competencias) {
        super(nombreCurso, duracion, equipoPractico, flotadores);
        this.competencias = competencias;
    }

    //getters
    public String getCompetencias() {
        return competencias;
    }

    //setters
    public void setCompetencias(String competencias) {
        this.competencias = competencias;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Competencias: " + competencias);
    }
}
