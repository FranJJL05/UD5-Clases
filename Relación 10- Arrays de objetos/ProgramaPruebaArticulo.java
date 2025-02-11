public class ProgramaPruebaArticulo {

    public static void main(String[] args) {
        pruebaArticulo prueba = new pruebaArticulo(3);

        Articulo articulo1 = new Articulo("A001", "Lapiz");
        articulo1.setPrecioCompra(1.0);
        articulo1.setPrecioVenta(2.0);
        articulo1.setStock(100);

        Articulo articulo2 = new Articulo("B002", "Goma");
        articulo2.setPrecioCompra(1.5);
        articulo2.setPrecioVenta(2.30);
        articulo2.setStock(50);

        Articulo articulo3 = new Articulo("C003", "Boli");
        articulo3.setPrecioCompra(1.0);
        articulo3.setPrecioVenta(2.5);
        articulo3.setStock(30);

        // Intentar almacenar los artículos en el array
        System.out.println("Almacenando el primer artículo: " + prueba.almacena(articulo1));
        System.out.println("Almacenando el segundo artículo: " + prueba.almacena(articulo2));
        System.out.println("Almacenando el tercer artículo: " + prueba.almacena(articulo3));

        // Intentar almacenar un cuarto artículo (que no cabrá en el array)
        Articulo articulo4 = new Articulo("A004", "Auriculares Sony WH-1000XM5");
        System.out.println("Intentando almacenar un cuarto artículo: " + prueba.almacena(articulo4));

        // Mostrar todos los artículos almacenados
        System.out.println("Listado de artículos almacenados:");
        System.out.println(prueba);
    }
}
