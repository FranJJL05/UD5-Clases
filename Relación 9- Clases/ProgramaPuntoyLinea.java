public class ProgramaPuntoyLinea {
    public static void main(String[] args) {
        Punto p1 = new Punto(4,7);
        Punto p2 = new Punto(2,1);
        Linea l = new Linea(p1, p2);
        System.out.println("Línea formada por los puntos " + l);
    }
}
