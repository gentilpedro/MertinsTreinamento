package Slide02;

public class Exercicio2 {
    public static void main(String[] args) {
        int x = 12;
        int i = 0;
        fim:
        while (i < 10) {
            i++;
            x--;
            if (i == 4) {
                break fim;
            }
        }
        switch (x) {// Qual o valor de x e de i? (Use o debug passo a passo)
            case 8:
                System.out.println("8");
            case 7:
                System.out.println("7"); /* Este comando será executado? */
                break;
            default:
                System.out.println("--DEFAULT--");
        }
    }// Qual foi o resultado na janela de Output?
}

