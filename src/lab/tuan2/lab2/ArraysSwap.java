package lab.tuan2.lab2;

public class ArraysSwap {
    public static boolean swap(int[] array1, int[] array2) {

        if (array1 == null || array2 == null) {
            return false;
        }

        if (array1.length != array2.length) {
            return false;
        }

        int temp;

        for (int index = 0; index < array1.length; index++) {
            temp = array1[index];
            array1[index] = array2[index];
            array2[index] = temp;
        }

        //Test
        /*System.out.print("Array 1: ");
        for (Integer num : array1) {
            System.out.print(num);
        }

        System.out.print("\nArray 2: ");
        for (Integer num : array2) {
            System.out.print(num);
        }
        System.out.println();*/

        return true;
    }

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        System.out.println("Result: " + swap(array1, array2));
    }
}
