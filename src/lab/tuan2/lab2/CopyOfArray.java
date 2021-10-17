package lab.tuan2.lab2;

public class CopyOfArray {
    public static int[] copyOf(int[] array) {

        if (array == null) {
            return new int[0];
        }

        int[] copy = new int[array.length];

        System.arraycopy(array, 0, copy, 0, copy.length);

        //or this
        /*for (int index = 0; index < copy.length; index++) {
            copy[index] = array[index];
        }*/

        return copy;
    }

    public static int[] copyOf(int[] array, int newLength) {

        if (array == null) {
            return new int[0];
        }

        int[] copy = new int[newLength];

        for (int index = 0; index < copy.length; index++) {
            try {
                copy[index] = array[index];
            } catch (IndexOutOfBoundsException e) {
                copy[index] = 0;
            }
        }

        return copy;

    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        int newLength = 4;

        int[] copy = copyOf(array);
        int[] copyTwo = copyOf(array, newLength);

        //Testes
        /*array[0] = 9;

        System.out.print("Array: ");
        for (Integer num : array) {
            System.out.print(num);
        }

        System.out.print("\nCopy: ");
        for (Integer num : copy) {
            System.out.print(num);
        }

        System.out.print("\nCopy two: ");
        for (Integer num : copyTwo) {
            System.out.print(num);
        }*/
    }
}
