package lab.tuan2.lab2;

public class ArraysEqual {
    public static boolean equals(int[] array1, int[] array2) {

        if (array1 == null || array2 == null) {
            return false;
        }

        if (array1.length != array2.length) {
            return false;
        }

        for (int index = 0; index < array1.length; index++) {
            if (array1[index] != array2[index]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {1, 2, 3};
        int[] arrayThree = {4, 5, 6};

        System.out.println("Comparing (1) and (3): " + equals(arrayOne, arrayThree));
        System.out.println("Comparing (1) and (2): " + equals(arrayOne, arrayTwo));
    }
}
