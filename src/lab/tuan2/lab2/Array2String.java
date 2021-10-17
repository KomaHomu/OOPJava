package lab.tuan2.lab2;

public class Array2String {
    public static String arrayToString(int[] array) {

        if (array == null) {
            return "null";
        }

        if (array.length - 1 == -1) {
            return "[]";
        }

        StringBuilder arrStr = new StringBuilder("[" + array[0]);

        for (int index = 1; index < array.length; index++) {
            arrStr.append(", ").append(array[index]);
        }
        arrStr.append("]");

        return arrStr.toString();
    }

    public static void main(String[] args) {

        int[] emptyIntArr = {};
        int[] oneElementIntArr = {4};
        int[] fullIntArr = {4, 5, 6};

        System.out.println("Array: " + arrayToString(emptyIntArr));
        System.out.println("Array: " + arrayToString(oneElementIntArr));
        System.out.println("Array: " + arrayToString(fullIntArr));

    }
}
