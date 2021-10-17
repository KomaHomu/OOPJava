package lab.tuan2.lab1;

import java.util.Scanner;

public class PrintArrayInStars {
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

        //print stars
        for (int index = 0; index < items.length; index++) {
            System.out.print(index + ": ");
            for (int starIdx = 0; starIdx < items[index]; starIdx++) {
                System.out.print("*");
            }
            System.out.printf("(%d)%n", items[index]);
        }

        scan.close();
    }
}
