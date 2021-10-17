package lab.tuan2.lab1;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final int NUM_ITEMS;
        int[] items;

        System.out.print("Enter the number of items : ");
        NUM_ITEMS = scan.nextInt();
        items = new int[NUM_ITEMS];

        //read array
        System.out.print("Enter the value of all items (separated by space) : ");
        for (int i = 0; i < items.length; i++) {
            items[i] = scan.nextInt();
        }

        //print array contents
        System.out.print("The values are : [" + items[0]);
        for (int i = 1; i < items.length; i++) {
            System.out.printf(", %d", items[i]);
        }
        System.out.print("]");

        scan.close();
    }
}
