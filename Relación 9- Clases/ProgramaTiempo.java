public class ProgramaTiempo {
    public static void main(String[] args) {
        // Crear dos objetos Tiempo
        Tiempo t1 = new Tiempo(1, 30, 40); // 1h 30m 40s
        Tiempo t2 = new Tiempo(0, 25, 20); // 25m 20s

        // Sumar los tiempos
        Tiempo suma = t1.suma(t2);
        System.out.println("Suma: " + suma); // Debería imprimir: 1h 56m 0s

        // Restar los tiempos
        Tiempo resta = t1.resta(t2);
        System.out.println("Resta: " + resta); // Debería imprimir: 1h 5m 20s
    }
}
