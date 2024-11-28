package Modelo_de_Herencia_con_Sobreescritura;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de cada clase
        CursoTeorico cursoTeorico = new CursoTeorico("Historia de la Matemática", 40, "Libros, Notas de clase");

        CursoPractico cursoPractico = new CursoPractico("Taller de Carpintería", 30, "Sierra, Martillo");

        CursoPrimeraAyuda cursoPrimeraAyuda = new CursoPrimeraAyuda("Primeros Auxilios", 20, "Manuales", "Botiquín de Emergencias");

        CursoNatacionBasica cursoNatacionBasica = new CursoNatacionBasica("Natación Básica", 25, "Flotadores, Gafas", 5);

        CursoNatacionAvanzada cursoNatacionAvanzada = new CursoNatacionAvanzada("Natación Avanzada", 30, "Flotadores, Gafas", 3, "Competiciones de Estilo Libre");

        // Configurar atributos usando set
        cursoTeorico.setMaterialTeorico("Nuevo material de lectura");
        cursoPractico.setEquipoPractico("Nuevo equipo de carpintería");

        // Mostrar detalles de los cursos
        cursoTeorico.mostrarDetalles();
        System.out.println("--------------------------");
        cursoPractico.mostrarDetalles();
        System.out.println("--------------------------");
        cursoPrimeraAyuda.mostrarDetalles();
        System.out.println("--------------------------");
        cursoNatacionBasica.mostrarDetalles();
        System.out.println("--------------------------");
        cursoNatacionAvanzada.mostrarDetalles();
    }
}
