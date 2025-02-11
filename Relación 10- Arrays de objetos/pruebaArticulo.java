public class pruebaArticulo {
    
    Articulo[] articulos;

    int tamaño;

    public pruebaArticulo(int tamaño){
        articulos = new Articulo[tamaño];
    }

    //Método
    public boolean almacena(Articulo articulo){
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i] == null) {
                articulos[i] = articulo;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        String result = "";
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i] == null) {
                result += "Articulo " + (i + 1) + ":\n" +
                            articulos[i].toString() + ":\n" +
                            "--------------------------\n";
            }
        }
        return result;
    }

}
