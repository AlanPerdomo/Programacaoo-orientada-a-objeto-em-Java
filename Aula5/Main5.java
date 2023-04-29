package Aula5;

public class Main5 {
    public static void main(String[] args) {
        String[] array = { "alan", "pedro", "asdf", "asahasdf" };
        int index = 8;
        String result = getStringAtIndex(array, index);
        System.out.println(result);
    }

    public static String getStringAtIndex(String[] array, int index) {
        if (index < 0 || index >= array.length) {
            return "";
        }
        return array[index];
    }
}
