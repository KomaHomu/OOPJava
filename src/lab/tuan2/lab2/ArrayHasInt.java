package lab.tuan2.lab2;

public class ArrayHasInt {
    public static boolean contains(int[] array, int key) {

        if (array == null) {
            return false;
        }

        for (Integer num : array) {
            if (num == key) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] array = {4, 5, 6, 7};
        int keyOne = 4;
        int keyTwo = 8;

        System.out.println("Result 1: " + contains(array, keyOne));
        System.out.println("Result 2: " + contains(array, keyTwo));
    }
}
