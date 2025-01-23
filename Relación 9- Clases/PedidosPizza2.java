public class PedidosPizza2 {
    public static void main(String[] args) {
        // Crear nuevas pizzas
        Pizza2 p1 = new Pizza2("mediana", "margarita");
        Pizza2 p2 = new Pizza2("familiar", "cuatro quesos");

        p2.sirve();

        Pizza2 p3 = new Pizza2("mediana", "funghi");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p2.sirve();

        // Mostrar el número total de pizzas pedidas y servidas
        System.out.println("Total de pizzas pedidas: " + Pizza2.getTotalPedidas());
        System.out.println("Total de pizzas servidas: " + Pizza2.getTotalServidas());
    }
}
