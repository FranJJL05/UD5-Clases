public class ProgramaArticulo {
    public static void main(String[] args) {
        // Crear tres artículos usando el constructor con código y descripción
        Articulo articulo1 = new Articulo("A001", "Lapiz");
        articulo1.setPrecioCompra(1.0);
        articulo1.setPrecioVenta(2.0);
        articulo1.setStock(100);

        Articulo articulo2 = new Articulo("B002", "Goma");
        articulo2.setPrecioCompra(1.50);
        articulo2.setPrecioVenta(2.30);
        articulo2.setStock(50);

        Articulo articulo3 = new Articulo("C003", "Boli");
        articulo3.setPrecioCompra(1.0);
        articulo3.setPrecioVenta(2.5);
        articulo3.setStock(30);

        // Almacenar los artículos en un array
        Articulo[] articulos = { articulo1, articulo2, articulo3 };

        // Mostrar la información de los artículos
        for (Articulo articulo : articulos) {
            System.out.println(articulo);
            System.out.println("--------------");
        }
    }

}
