package Aula5;
public class Main3 {
    public static void main(String[] args) {
        int x = 0;
        try {
            int y = 10 / x;
            System.out.println(y);
        } catch (ArithmeticException e) {
            System.out.println("O numero não pode ser dividido por 0.");
        }
    }
}
