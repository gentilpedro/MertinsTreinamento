public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("\n-------\n");
        int x = 9;
        int y = 26;
        label:
        for (int z = 0; z < 6; z++, y--){
            if (x > 2){
                x--;
            }
            if (x> 5 ){
                System.out.printf("%d", x);
                --x;
                continue label;
            }
            x--;
        }
        System.out.println();
    }
}
