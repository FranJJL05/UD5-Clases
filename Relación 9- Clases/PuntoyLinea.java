class Punto {
    int x;
    int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}

class Linea {
    Punto p1;
    Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return p1 + " y " + p2;
    }

}
