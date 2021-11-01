package lab.tuan2.lab2;

import java.util.Scanner;

public class MagicSum {

    public static boolean validateInput(String text) {

        if (text.equals("-1")) {
            return true;
        } else return text.matches("[0-9]+");
    }

    public static boolean hasEight(int number) {

        return Integer.toString(number).matches("(?=.*8)[0-9]+");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final int SENTINEL = -1;
        int number;
        int magicSum = 0;

        do {
            System.out.print("Enter a positive integer (or -1 to end): ");
            String input = scan.next();

            if (validateInput(input)) {
                number = Integer.parseInt(input);
            } else {
                System.out.println("Invalid input. Please re-enter.");
                number = 0;
                continue;
            }

            if (hasEight(number)) {
                magicSum += number;
            }
        } while (number != SENTINEL);

        System.out.println("The magic sum is: " + magicSum);

        scan.close();
    }
}
