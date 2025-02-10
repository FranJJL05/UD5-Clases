public class Tiempo {

    // Atributos
    int horas;
    int minutos;
    int segundos;

    // Constructor
    Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    // Métodos
    void NormalizarTiempo() {
        while (segundos >= 60) {
            segundos -= 60;
            minutos++;
        }
        while (minutos >= 60) {
            minutos -= 60;
            horas++;
        }
    }

    public Tiempo suma(Tiempo otro) {
        int TotalSegundo = this.segundos + otro.segundos;
        int TotalMinutos = this.minutos + otro.minutos;
        int TotalHoras = this.horas + otro.horas;

        Tiempo resultado = new Tiempo(0, 0, TotalSegundo);
        resultado.minutos += TotalMinutos;
        resultado.horas += TotalHoras;
        resultado.NormalizarTiempo();

        return resultado;
    }

    public Tiempo resta(Tiempo otro) {
        int TotalSegundo = this.segundos - otro.segundos;
        int TotalMinutos = this.minutos - otro.minutos;
        int TotalHoras = this.horas - otro.horas;

        if (TotalSegundo < 0) {
            TotalSegundo += 60;
            TotalMinutos--;
        }

        if (TotalMinutos < 0) {
            TotalMinutos += 60;
            TotalHoras--;
        }

        Tiempo resultado = new Tiempo(0, 0, TotalSegundo);
        resultado.minutos += TotalMinutos;
        resultado.horas += TotalHoras;
        resultado.NormalizarTiempo();

        return resultado;
    }

    @Override
    public String toString() {
        return horas + "h " + minutos + "m " + segundos + "s";
    }

}
