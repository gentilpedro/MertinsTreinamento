package Slide02;

public class Matematica {
    private int valor;

    // Método para obter o valor
    public int getValor() {
        return valor;
    }

    // Método para definir o valor
    public void setValor(int val) {
        this.valor = val;
    }

    // Método para dobrar o valor
    public void dobra() {
        this.valor *= 2;
    }

    // Método para quadruplicar o valor
    public void quadruplica() {
        this.valor *= 4;
    }

    // Método para somar um número ao valor atual
    public void soma(int numero) {
        this.valor += numero;
    }
}


