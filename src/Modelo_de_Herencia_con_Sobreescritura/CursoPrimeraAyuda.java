package Modelo_de_Herencia_con_Sobreescritura;

public class CursoPrimeraAyuda extends CursoTeorico {
    //atributos
    private String kitEmergencia;

    //constructor
    public CursoPrimeraAyuda(String nombreCurso, int duracion, String materialTeorico, String kitEmergencia) {
        super(nombreCurso, duracion, materialTeorico);
        this.kitEmergencia = kitEmergencia;
    }

    //getters
    public String getKitEmergencia() {
        return kitEmergencia;
    }

    //setters
    public void setKitEmergencia(String kitEmergencia) {
        this.kitEmergencia = kitEmergencia;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Kit de Emergencia: " + kitEmergencia);
    }
}
