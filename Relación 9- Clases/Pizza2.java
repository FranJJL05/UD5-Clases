public class Pizza2 {
    // Atributos de la clase (pizza)
    String tamaño;
    String tipo;
    String estado; // estado puede ser "pedida" o "servida"
    static int numPedidas = 0;
    static int numServidas = 0;

    // método constructor
    Pizza2(String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = "pedida";
        this.numPedidas++;
    }

    // métodos del objeto
    void sirve(){
        if (this.estado.equals("servida")) {
            System.out.println("Esa pizza ya se ha servido");
        }else{
            this.estado = "servida";
            this.numServidas++;
        }
    }

    static int getTotalPedidas(){
        return numPedidas;
    }

    static int getTotalServidas(){
        return numServidas;
    }

    @Override //sirve para poder modificar el toString que viene predefinido por java
    public String toString(){
        return "pizza " + this.tipo + " " + this.tamaño + "," + this.estado;
    }

}
