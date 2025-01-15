class Jugador {
    private String nombre;
    private int edad;
    private String posicion;

    // Constructor, getters y setters
    public Jugador(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }
}

class Equipo {
    private String nombre;
    private Jugador[] jugadores;

    // Constructor, getters y setters
    public Equipo(String nombre, Jugador[] jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }
}

class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;

    // Constructor, getters y setters
    public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }
}

class Arbitro {
    private String nombre;
    private int edad;

    // Constructor, getters y setters
    public Arbitro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

class Estadio {
    private String nombre;
    private String ciudad;

    // Constructor, getters y setters
    public Estadio(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
}
