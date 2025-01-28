import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        Zona salaPrincipal = new Zona(1000);
        Zona zonaCompraVenta = new Zona(200);
        Zona zonaVIP = new Zona(25);
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Menú de venta de entradas:");
            System.out.println("1. Consultar entradas disponibles");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Entradas disponibles:");
                    System.out.println("Sala Principal: " + salaPrincipal.getEntradasPorVender());
                    System.out.println("Zona de Compra-Venta: " + zonaCompraVenta.getEntradasPorVender());
                    System.out.println("Zona VIP: " + zonaVIP.getEntradasPorVender());
                    break;

                case 2:
                    System.out.println("Seleccione la zona:");
                    System.out.println("1. Sala Principal");
                    System.out.println("2. Zona de Compra-Venta");
                    System.out.println("3. Zona VIP");
                    System.out.print("Opción: ");
                    int zonaSeleccionada = scanner.nextInt();

                    System.out.print("¿Cuántas entradas desea comprar? ");
                    int cantidadEntradas = scanner.nextInt();

                    switch (zonaSeleccionada) {
                        case 1:
                            salaPrincipal.vender(cantidadEntradas);
                            break;
                        case 2:
                            zonaCompraVenta.vender(cantidadEntradas);
                            break;
                        case 3:
                            zonaVIP.vender(cantidadEntradas);
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                    break;

                case 3:
                    System.out.println("Gracias por su visita.");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }

            System.out.println(); // Línea en blanco para mayor claridad
        } while (opcion != 3);

        scanner.close();
    }
}
