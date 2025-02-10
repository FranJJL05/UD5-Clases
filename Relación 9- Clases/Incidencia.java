public class Incidencia {

    private static int contadorIncidencias = 0;
    private static int pendientes = 0;
    private int codigo;
    private int puesto;
    private String descripcion;
    private String estado;

    // Constructor de la clase
    public Incidencia(int puesto, String descripcion) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.codigo = ++contadorIncidencias;
        this.estado = "pendiente";
        pendientes++; // Incrementa el contador de incidencias pendientes
    }

    // Método para resolver la incidencia
    public void resuelve(String solucion) {
        this.estado = "resuelta";
        this.descripcion += " Solución: " + solucion;
        pendientes--; // Decrementa el contador de incidencias pendientes
    }

    // Método para obtener el número de incidencias pendientes
    public static int getPendientes() {
        return pendientes;
    }

    // Método toString para mostrar la incidencia
    @Override
    public String toString() {
        return "Incidencia " + codigo + " (Puesto " + puesto + "): " + descripcion + " - Estado: " + estado;
    }
}
