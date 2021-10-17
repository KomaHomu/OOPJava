package lab.tuan2.lab2;

import java.util.Scanner;

public class MagicSum {
    public static boolean hasEight(int number) {

        String numAsStr;

        numAsStr = Integer.toString(number);

        return numAsStr.matches("(?=.*8)[0-9]+");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final int SENTINEL = -1;
        int number;
        int magicSum = 0;

        do {
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = scan.nextInt();
            if (hasEight(number)) {
                magicSum += number;
            }
        } while (number != SENTINEL);

        System.out.println("The magic sum is: " + magicSum);

        scan.close();
    }
}
