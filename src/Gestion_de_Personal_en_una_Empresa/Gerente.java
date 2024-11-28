package Gestion_de_Personal_en_una_Empresa;

public class Gerente extends Empleado {

    //Atributo
    private String departamento;

    //Metodo getter
    public String getDepartamento() {
        return departamento;
    }

    //Metodo setter
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();

        //+ Extras de empleado
        System.out.println("Departamento: " + departamento);
    }
}
