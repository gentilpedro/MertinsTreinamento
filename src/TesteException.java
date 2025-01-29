public class TesteException {
    public static void main(String[] args) {
        int c = 1;
        try {
            c = c + 1;
            while (c < 14) {
                if (c == 13) {
                    throw new Exception();
                }
                c = c + 3;
            }
        } catch (Exception e) {
            c = c + 5;
        } finally {
            c = c + 6;
        }
        System.out.println("Valor= " + c);
    }
}

