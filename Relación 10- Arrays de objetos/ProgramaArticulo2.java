public class ProgramaArticulo2 {
    public static void main(String[] args) {
        Articulo[] arrayArticulo = new Articulo[3];

        // Crear los 3 artículos utilizando el constructor con código y descripción
        arrayArticulo[0] = new Articulo("A001", "Lapiz");
        arrayArticulo[0].setPrecioCompra(1.0);
        arrayArticulo[0].setPrecioVenta(2.0);
        arrayArticulo[0].setStock(100);

        arrayArticulo[1] = new Articulo("B002", "Goma");
        arrayArticulo[1].setPrecioCompra(1.5);
        arrayArticulo[1].setPrecioVenta(2.30);
        arrayArticulo[1].setStock(50);

        arrayArticulo[2] = new Articulo("C003", "Boli");
        arrayArticulo[2].setPrecioCompra(1.0);
        arrayArticulo[2].setPrecioVenta(2.5);
        arrayArticulo[2].setStock(30);

        // Mostrar la información de los artículos
        for (Articulo articulo : arrayArticulo) {
            System.out.println(articulo);
            System.out.println("--------------");
        }
    }
}
