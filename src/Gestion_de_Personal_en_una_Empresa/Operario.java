package Gestion_de_Personal_en_una_Empresa;

public class Operario extends Empleado {

    //Atributo
    private int horasTrabajadas;
    private double pagoPorHora;

    //Getters
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    //Setters
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }


    @Override
    public void mostrarInfo() {
        super.mostrarInfo();

        //+ Extras de Empleado
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Pago por hora: " + pagoPorHora);
    }
}
