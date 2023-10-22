package CalcAndArrays;

public class Program {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(13, 5L));
        System.out.println(Calculator.multiply(5, 4.0));
        System.out.println(Calculator.subtract(13, 5L));
        System.out.println(Calculator.divide(10, 5L));

        String[] array1 = {"a", "3", "h"};
        String[] array2 = {"a", "h", "h"};
        String[] array3 = {"a", "3", "h"};

        System.out.println(compareArrays(array1, array2));
        System.out.println(compareArrays(array1, array3));
        System.out.println(compareArrays(array2, array3));

    }

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (!array1[i].equals(array2[i])) {
                    return false;
                }
            }
            return true;
        } else {
            throw new RuntimeException("Вы передали массивы разной длины");
        }
    }
}
