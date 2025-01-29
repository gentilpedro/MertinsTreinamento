public class Exercicio3 {
    public int processaValor(int val) {
        int temp1 = val + 20;
        int temp2 = temp1 * 9;
        int temp3 = temp2 + temp1 * 3;
        int temp4 = temp3 % temp2;
        return temp4; // Qual os valores de temp1, temp2, temp3 e temp4?
    }

    public static void main(String[] args) {
        int temp1 = 15;
        Exercicio3 exercicio = new Exercicio3();
        int temp2 = exercicio.processaValor(temp1);
        System.out.printf("Exercicio 3: %d\n ", temp2);/* Qual o valor de temp1 e temp2? */
    }
}

