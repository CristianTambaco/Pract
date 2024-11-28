package Gestion_de_Personal_en_una_Empresa;

public class Administrativo extends Empleado {

    //Atributo
    private String nivel;

    //getters
    public String getNivel() {
        return nivel;
    }

    //Setters
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }


    @Override
    public void mostrarInfo() {
        super.mostrarInfo();

        //+ extras de Empleado
        System.out.println("Nivel: " + nivel);
    }
}
