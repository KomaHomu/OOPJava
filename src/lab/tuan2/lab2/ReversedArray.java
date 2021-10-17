package lab.tuan2.lab2;

public class ReversedArray {
    public static void reverse(int[] array) {

        if (array == null) {
            return;
        }

        int temp;
        int fIdx = 0; //forward index, increase from 0
        int bIdx = array.length - 1; //backward index, decrease from the highest index

        while (fIdx <= bIdx) {
            temp = array[bIdx];
            array[bIdx] = array[fIdx];
            array[fIdx] = temp;

            fIdx++;
            bIdx--;
        }
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        reverse(array);

        //Test
        /*System.out.print("Mirrored array : ");
        for (Integer num : array) {
            System.out.print(num);
        }*/

    }
}
