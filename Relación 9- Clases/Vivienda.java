public class Vivienda {
    private String direccion;
    private int numeroHabitaciones;
    private double superficie;
    private boolean tieneJardin;

    // Constructor
    public Vivienda(String direccion, int numeroHabitaciones, double superficie, boolean tieneJardin) {
        this.direccion = direccion;
        this.numeroHabitaciones = numeroHabitaciones;
        this.superficie = superficie;
        this.tieneJardin = tieneJardin;
    }

    // Métodos Getters y Setters
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public boolean isTieneJardin() {
        return tieneJardin;
    }

    public void setTieneJardin(boolean tieneJardin) {
        this.tieneJardin = tieneJardin;
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "direccion='" + direccion + '\'' +
                ", numeroHabitaciones=" + numeroHabitaciones +
                ", superficie=" + superficie +
                ", tieneJardin=" + tieneJardin +
                '}';
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Vivienda vivienda1 = new Vivienda("Avda. Andalucía, 123", 3, 120.5, true);
        System.out.println(vivienda1);
    }
}
