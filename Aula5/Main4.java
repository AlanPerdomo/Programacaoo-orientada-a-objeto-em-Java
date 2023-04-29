package Aula5;
public class Main4 {
    public static void main(String[] args) {
        Object obj = "String";
        try {
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException capturada");
        }
    }
}
