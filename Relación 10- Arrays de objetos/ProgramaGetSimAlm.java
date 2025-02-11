import java.util.*;

public class ProgramaGetSimAlm {
    public static void main(String[] args) {
        GestSimAlm sistema = new GestSimAlm();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Mostrar lista de artículos");
            System.out.println("2. Alta de nuevo artículo");
            System.out.println("3. Baja de artículo");
            System.out.println("4. Entrada de mercancía");
            System.out.println("5. Salida de mercancía");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    sistema.lista();
                    break;
                case 2:
                    System.out.print("Ingrese código: ");
                    String codigoAlta = scanner.nextLine();
                    System.out.print("Ingrese descripción: ");
                    String descripcionAlta = scanner.nextLine();
                    System.out.print("Ingrese precio de compra: ");
                    double precioCompraAlta = scanner.nextDouble();
                    System.out.print("Ingrese precio de venta: ");
                    double precioVentaAlta = scanner.nextDouble();
                    System.out.print("Ingrese stock: ");
                    int stockAlta = scanner.nextInt();
                    sistema.alta(codigoAlta, descripcionAlta, precioCompraAlta, precioVentaAlta, stockAlta);
                    break;
                case 3:
                    System.out.print("Ingrese código del artículo a dar de baja: ");
                    String codigoBaja = scanner.nextLine();
                    sistema.baja(codigoBaja);
                    break;
                case 4:
                    System.out.print("Ingrese código del artículo para entrada: ");
                    String codigoEntrada = scanner.nextLine();
                    System.out.print("Ingrese cantidad a añadir: ");
                    int cantidadEntrada = scanner.nextInt();
                    sistema.entradaMercancia(codigoEntrada, cantidadEntrada);
                    break;
                case 5:
                    System.out.print("Ingrese código del artículo para salida: ");
                    String codigoSalida = scanner.nextLine();
                    System.out.print("Ingrese cantidad a retirar: ");
                    int cantidadSalida = scanner.nextInt();
                    sistema.salidaMercancia(codigoSalida, cantidadSalida);
                    break;
                case 6:
                    System.out.println("Saliendo del sistema.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida.");

            }
        }
    }
}