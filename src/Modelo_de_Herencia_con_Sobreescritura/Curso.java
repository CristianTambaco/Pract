package Modelo_de_Herencia_con_Sobreescritura;

public class Curso {

    //atributos
    private String nombreCurso;
    private int duracion;

    //constructor
    public Curso(String nombreCurso, int duracion) {
        this.nombreCurso = nombreCurso;
        this.duracion = duracion;
    }

    //getter
    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getDuracion() {
        return duracion;
    }

    //setters
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // Metodo sobrescribible
    public void mostrarDetalles() {
        System.out.println("Curso: " + nombreCurso + ", Duración: " + duracion + " horas.");
    }
}
