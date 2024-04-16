package actividad3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre? ");
        String nombre = scanner.nextLine();

        System.out.println("¿Eres residente? (true/false) ");
        boolean esResidente = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("¿Cuál es tu género? (M/F) ");
        char genero = scanner.nextLine().charAt(0);

        System.out.println("¿Cuál es tu edad? ");
        byte edad = Byte.parseByte(scanner.nextLine());

        System.out.println("¿Cuál es tu fecha de nacimiento? ");
        short fechaNacimiento = Short.parseShort(scanner.nextLine());

        System.out.println("¿Cuál es tu número de teléfono? ");
        int numeroTelefono = Integer.parseInt(scanner.nextLine());

        System.out.println("¿Cuál es tu altura? ");
        float altura = Float.parseFloat(scanner.nextLine());

        System.out.println("¿Cuál es tu ID? ");
        long id = Long.parseLong(scanner.nextLine());

        // Imprimir la información ingresada
        System.out.println("\nInformación ingresada:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Residente: " + (esResidente ? "Sí" : "No"));
        System.out.println("Género: " + genero);
        System.out.println("Edad: " + edad);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Número de teléfono: " + numeroTelefono);
        System.out.println("Altura: " + altura);
        System.out.println("ID: " + id);
    }
}