public class Main {
    public static void main(String[] args) {

        Fraccion fraccion1 = new Fraccion();
        Fraccion fraccion2 = new Fraccion();
        Fraccion fraccion3 = new Fraccion();

        fraccion1.setFraccion(1, 2);
        fraccion2.setFraccion(2, 3);

        System.out.printf("La fracción 1 es %d/%d\n", fraccion1.getNumerador(),
                fraccion1.getDenominador());

        System.out.printf("La fracción 2 es %d/%d\n", fraccion2.getNumerador(), fraccion2.getDenominador());

        // resultado = resultado.multiplicaFraccion(fraccion1, fraccion2); // usando no
        // static, sería método de objeto

        // multiplicaFraccion es un método static de clase, puede llamarse usando la
        // clase
        fraccion3 = Fraccion.multiplica(fraccion1, fraccion2);

        System.out.printf("La multiplación de fraccion1 y fraccion2 es %d/%d", fraccion3.getNumerador(),
                fraccion3.getDenominador());

        //Simplificar 
        fraccion3.simplificar();

    }

}
