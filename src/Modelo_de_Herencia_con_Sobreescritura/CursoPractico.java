package Modelo_de_Herencia_con_Sobreescritura;

public class CursoPractico extends Curso {
    //atributos
    private String equipoPractico;

    //constructor
    public CursoPractico(String nombreCurso, int duracion, String equipoPractico) {
        super(nombreCurso, duracion);
        this.equipoPractico = equipoPractico;
    }

    //getters
    public String getEquipoPractico() {
        return equipoPractico;
    }

    //setters
    public void setEquipoPractico(String equipoPractico) {
        this.equipoPractico = equipoPractico;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Equipo Práctico: " + equipoPractico);
    }
}
