public class Main1 {
    public static void main(String[] args) {
        String nome = null;
        {
            try {
                System.out.println("O nome é " + nome.length());
            } catch (NullPointerException e) {
                System.out.println("O nome está nulo.");
            }
        }
    }
}