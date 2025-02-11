public class Articulo {

    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    public Articulo(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public int getStock(int stock) {
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public double getPrecioCompra(double preciocompra) {
        return preciocompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta(double precioventa) {
        return precioventa;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getDescripcion(String descripcion) {
        return descripcion;
    }

    public String getCodigo(String codigo) {
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\n" +
                "Descripción: " + descripcion + "\n" +
                "Precio de Compra: " + precioCompra + "\n" +
                "Precio de Venta: " + precioVenta + "\n" +
                "Stock: " + stock;
    }

}
