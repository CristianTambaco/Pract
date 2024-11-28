package Gestion_de_Personal_en_una_Empresa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear un Gerente
        Gerente gerente = new Gerente();

        System.out.print("Ingrese el ID del empleado (Gerente): ");
        gerente.setIdEmpleado(sc.nextInt());
        sc.nextLine();

        System.out.print("Ingrese el nombre del empleado (Gerente): ");
        gerente.setNombre(sc.nextLine());

        System.out.print("Ingrese la edad del empleado (Gerente): ");
        gerente.setEdad(sc.nextInt());

        System.out.print("Ingrese el salario del empleado (Gerente): ");
        gerente.setSalario(sc.nextDouble());

        sc.nextLine();  // Limpiar el buffer

        System.out.print("Ingrese el departamento del gerente: ");
        gerente.setDepartamento(sc.nextLine());

        // Mostrar información del Gerente
        System.out.println("\nInformación del Gerente:");
        gerente.mostrarInfo();

        // Crear un Operario
        Operario operario = new Operario();

        System.out.print("Ingrese el ID del empleado (Operario): ");
        operario.setIdEmpleado(sc.nextInt());
        sc.nextLine();  // Limpiar el buffer

        System.out.print("Ingrese el nombre del empleado (Operario): ");
        operario.setNombre(sc.nextLine());

        System.out.print("Ingrese la edad del empleado (Operario): ");
        operario.setEdad(sc.nextInt());

        System.out.print("Ingrese el salario del empleado (Operario): ");
        operario.setSalario(sc.nextDouble());

        System.out.print("Ingrese las horas trabajadas del operario: ");
        operario.setHorasTrabajadas(sc.nextInt());

        System.out.print("Ingrese el pago por hora del operario: ");
        operario.setPagoPorHora(sc.nextDouble());

        // Mostrar información del Operario
        System.out.println("\nInformación del Operario:");
        operario.mostrarInfo();

        // Crear un Administrativo
        Administrativo administrativo = new Administrativo();

        System.out.print("Ingrese el ID del empleado (Administrativo): ");
        administrativo.setIdEmpleado(sc.nextInt());
        sc.nextLine();  // Limpiar el buffer

        System.out.print("Ingrese el nombre del empleado (Administrativo): ");
        administrativo.setNombre(sc.nextLine());

        System.out.print("Ingrese la edad del empleado (Administrativo): ");
        administrativo.setEdad(sc.nextInt());

        System.out.print("Ingrese el salario del empleado (Administrativo): ");
        administrativo.setSalario(sc.nextDouble());

        sc.nextLine();  // Limpiar el buffer

        System.out.print("Ingrese el nivel del administrativo (e.g., Junior, Senior): ");
        administrativo.setNivel(sc.nextLine());

        // Mostrar información del Administrativo
        System.out.println("\nInformación del Administrativo:");
        administrativo.mostrarInfo();

        sc.close();
    }
}
