package Arrays;

public class Alumno {
    private static int autonumerico;
    private int codigo;
    private String nombre;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.codigo = ++autonumerico;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
