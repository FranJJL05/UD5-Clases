class Animal {
    public void comer() {
        System.out.println("El animal está comiendo.");
    }
}

class Mamifero extends Animal {
    public void amamantar() {
        System.out.println("El mamífero está amamantando.");
    }
}

class Ave extends Animal {
    public void volar() {
        System.out.println("El ave está volando.");
    }
}

class Gato extends Mamifero {
    public void maullar() {
        System.out.println("El gato está maullando.");
    }
}

class Perro extends Mamifero {
    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }
}

public class Animales {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Perro perro = new Perro();
        Ave ave = new Ave();

        gato.comer();
        gato.amamantar();
        gato.maullar();

        perro.comer();
        perro.amamantar();
        perro.ladrar();

        ave.comer();
        ave.volar();
    }
}
