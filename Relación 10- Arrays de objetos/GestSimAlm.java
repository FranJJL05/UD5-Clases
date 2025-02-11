import java.util.ArrayList;

public class GestSimAlm {
    
    private ArrayList<Articulo> almacén;

    public GestSimAlm() {
        almacén = new ArrayList<>();
        entradaAutomatizada();
    }

    // a. entradaAutomatizada: Crea 4 artículos de prueba
    public void entradaAutomatizada() {
        almacén.add(new Articulo("A001", "Artículo 1", 10.0, 15.0, 50));
        almacén.add(new Articulo("A002", "Artículo 2", 20.0, 30.0, 30));
        almacén.add(new Articulo("A003", "Artículo 3", 15.0, 25.0, 70));
        almacén.add(new Articulo("A004", "Artículo 4", 25.0, 40.0, 40));
    }

    // b. lista: Muestra todos los artículos del almacén
    public void lista() {
        if (almacén.isEmpty()) {
            System.out.println("El almacén está vacío.");
        } else {
            for (Articulo articulo : almacén) {
                System.out.println(articulo);
            }
        }
    }

    // c. alta: Crea un nuevo artículo en el almacén
    public void alta(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        Articulo nuevoArticulo = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
        almacén.add(nuevoArticulo);
        System.out.println("Artículo dado de alta: " + nuevoArticulo);
    }

    // d. baja: Da de baja un artículo en el almacén
    public void baja(String codigo) {
        for (int i = 0; i < almacén.size(); i++) {
            if (almacén.get(i).getCodigo(codigo).equals(codigo)) {
                almacén.remove(i);
                System.out.println("Artículo dado de baja: Código " + codigo);
                return;
            }
        }
        System.out.println("No se encontró el artículo con código: " + codigo);
    }

    // e. entradaMercancia: Aumenta el stock de un artículo
    public void entradaMercancia(String codigo, int cantidad) {
        for (Articulo articulo : almacén) {
            if (articulo.getCodigo(codigo).equals(codigo)) {
                articulo.setStock(articulo.getStock(cantidad) + cantidad);
                System.out.println("Stock actualizado para el artículo " + codigo + ": " + articulo.getStock(cantidad) + " unidades.");
                return;
            }
        }
        System.out.println("No se encontró el artículo con código: " + codigo);
    }

    // f. salidaMercancia: Disminuye el stock de un artículo
    public void salidaMercancia(String codigo, int cantidad) {
        for (Articulo articulo : almacén) {
            if (articulo.getCodigo(codigo).equals(codigo)) {
                if (articulo.getStock(cantidad) >= cantidad) {
                    articulo.setStock(articulo.getStock(cantidad) - cantidad);
                    System.out.println("Stock actualizado para el artículo " + codigo + ": " + articulo.getStock(cantidad) + " unidades.");
                } else {
                    System.out.println("No hay suficiente stock para realizar la salida.");
                }
                return;
            }
        }
        System.out.println("No se encontró el artículo con código: " + codigo);
    }
}
