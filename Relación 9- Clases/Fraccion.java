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


}