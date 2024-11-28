package Gestion_de_Personal_en_una_Empresa;

public class Empresa {

    //Atributos generales
    private String nombreEmpresa;
    private String direccion;
    private String telefono;

    //Metodos getters
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }


    //Metodos setters
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
