package Modelo_de_Herencia_con_Sobreescritura;

public class CursoTeorico extends Curso {

    //atributos
    private String materialTeorico;

    //constructor
    public CursoTeorico(String nombreCurso, int duracion, String materialTeorico) {
        super(nombreCurso, duracion);

        this.materialTeorico = materialTeorico;
    }

    //getters
    public String getMaterialTeorico() {
        return materialTeorico;
    }

    //setters
    public void setMaterialTeorico(String materialTeorico) {
        this.materialTeorico = materialTeorico;
    }


    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();

        System.out.println("Material Teórico: " + materialTeorico);
    }
}
