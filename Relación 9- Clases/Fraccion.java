public class Fraccion{


    //Atributos de objeto
    int numerador;
    int denominador;


    //Metodos de objeto
    void invierte(){
        int temp;

        temp = numerador;
        numerador = denominador;
        denominador = temp;
    }

    void setFraccion(int num, int den){
        numerador = num;
        denominador = den; 
    }

    int getNumerador(){
        return numerador;
    }

    int getDenominador(){
        return denominador;
    }

    //Multiplica dos fracciones
    static Fraccion multiplica(Fraccion fraccion1,Fraccion fraccion2){
        Fraccion fraccion3 = new Fraccion();


        fraccion3.setFraccion(fraccion1.getNumerador()*fraccion2.getNumerador(),fraccion1.getDenominador()*fraccion2.getDenominador());
        
        return fraccion3;
    }

    //Division de dos fracciones
    static Fraccion division(Fraccion fraccion1,Fraccion fraccion2){
        Fraccion fraccion3 = new Fraccion();

        fraccion3.setFraccion(fraccion1.getNumerador()*fraccion2.getDenominador(), fraccion1.getDenominador()*fraccion2.getNumerador());
        return fraccion3;
    }

    //Simplificar dos fracciones
    public void simplificar (){
        //encontrar mayor y menor (divisor y dividendo)
        int dividendo;
        int divisor;
        int maxDivisor;
        int resto;
        if (numerador>denominador) {
            dividendo = numerador;
            divisor = denominador;
        } else {
            dividendo = denominador;
            divisor = numerador;
        }
        if (dividendo%divisor ==0) {
            maxDivisor = divisor;
        } else {
            while (divisor != 0) {
                resto = dividendo % divisor;
                dividendo = divisor;
                divisor = resto;
            }
            maxDivisor = dividendo;
        }
        System.out.println("\nEl máximo divisor común es " + maxDivisor);
        //simplificar
        int newNumerador = numerador / maxDivisor;
        int newDenominador = denominador / maxDivisor;
        System.out.printf("La fracción simplificada es %d/%d", newNumerador, newDenominador );
        System.out.println();
}

}
