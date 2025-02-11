import java.util.Scanner;

public class ProgramaAutobus {
     // Método principal
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Autobus[] autobuses = new Autobus[4]; // Array de cuatro autobuses

        // Bucle para introducir los datos de cada autobús
        for (int i = 0; i < autobuses.length; i++) {
            System.out.println("Introduzca los datos del autobús " + (i + 1));

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Capacidad: ");
            int capacidad = scanner.nextInt();

            System.out.print("¿Está en circulación? (true/false): ");
            boolean enCirculacion = scanner.nextBoolean();

            scanner.nextLine(); // Limpiar el buffer del scanner

            autobuses[i] = new Autobus(modelo, capacidad, enCirculacion);
        }

        // Bucle para mostrar los datos de todos los autobuses
        System.out.println("\nDatos de todos los autobuses:");
        for (int i = 0; i < autobuses.length; i++) {
            System.out.println(autobuses[i]);
            autobuses[i].iniciarViaje();
        }

        scanner.close();
    }
}
