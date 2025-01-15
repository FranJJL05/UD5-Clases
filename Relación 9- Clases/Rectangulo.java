class Rectangulo {
    

    //Atributos de clase (static)
    private static int numRectangulo; //Numero de rectángulos creados
    public static final String nombreFigura = "Rectangulo"; //Nombre de la clase
    public static final double PI= 3,1416; //COntante PI

    //Atributos de objeto (sin static)
    private String nombre; //Nombre del rectángulo
    public double x1,y1; //Vértice inferior izquierdo
    public double x2,y2; //Vértice superior dereho

    //Métodos
    int getNumRectangulo(){
        return numRectangulo;
    }

    String getNombreFigura(){
        return nombreFigura;
    }

    double getPI(){
        return PI;
    }

    void setNombreFigura(String n){
        return nombreFigura;
    }
}
