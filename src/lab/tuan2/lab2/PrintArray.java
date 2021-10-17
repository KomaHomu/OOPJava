package lab.tuan2.lab2;

public class PrintArray {
    public static void print(int[] array) {

        if (array == null) {
            System.out.print("null\n");
            return;
        }

        if (array.length - 1 == -1) {
            System.out.print("Array: []\n");
            return;
        }

        System.out.print("Integer array: [" + array[0]);
        for (int index = 1; index < array.length; index++) {
            System.out.printf(", %d", array[index]);
        }
        System.out.print("]\n");
    }

    public static void print(double[] array) {

        if (array == null) {
            System.out.print("null\n");
            return;
        }

        if (array.length - 1 == -1) {
            System.out.print("Array: []\n");
            return;
        }

        System.out.print("Double array: [" + array[0]);
        for (int index = 1; index < array.length; index++) {
            System.out.printf(", %.1f", array[index]);
        }
        System.out.print("]\n");
    }

    public static void print(float[] array) {

        if (array == null) {
            System.out.print("null\n");
            return;
        }

        if (array.length - 1 == -1) {
            System.out.print("Array: []\n");
            return;
        }

        System.out.print("Float array: [" + array[0]);
        for (int index = 1; index < array.length; index++) {
            System.out.printf(", %.1f", array[index]);
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {

        int[] emptyIntArr = {};
        int[] oneElementIntArr = {4};
        int[] fullIntArr = {4, 5, 6};

        double[] doubleArr = {8.2, 4.5, 6.9};
        float[] floatArr = {5.9f, 4.5f};

        print(emptyIntArr);
        print(oneElementIntArr);
        print(fullIntArr);

        print(doubleArr);
        print(floatArr);

    }
}
