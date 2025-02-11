public class Autobus {
    private String modelo;
    private int capacidad;
    private boolean enCirculacion;

    // Constructor
    public Autobus(String modelo, int capacidad, boolean enCirculacion) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.enCirculacion = enCirculacion;
    }

    // Métodos
    public void iniciarViaje() {
        if (enCirculacion) {
            System.out.println("El autobús está en circulación.");
        } else {
            System.out.println("El autobús no está en circulación.");
        }
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "modelo='" + modelo + '\'' +
                ", capacidad=" + capacidad +
                ", enCirculacion=" + enCirculacion +
                '}';
    }

}

