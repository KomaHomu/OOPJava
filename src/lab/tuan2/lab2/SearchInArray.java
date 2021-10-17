package lab.tuan2.lab2;

public class SearchInArray {
    public static int search(int[] array, int key) {

        if (array == null) {
            return -1;
        }

        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = {4, 5, 6, 7};
        int keyOne = 4;
        int keyTwo = 8;

        System.out.println("(1) Found on index: " + search(array, keyOne));
        System.out.println("(2) Found on index: " + search(array, keyTwo));
    }
}
