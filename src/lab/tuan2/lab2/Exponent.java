package lab.tuan2.lab2;

import java.util.Scanner;

public class Exponent {
    public static int exponent(int base, int exp) {

        int product = 1;

        for (int time = 1; time <= exp; time++) {
            product *= base;
        }

        return product;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int exp;
        int base;

        System.out.print("Enter the base: ");
        exp = scan.nextInt();
        System.out.print("Enter the exponent: ");
        base = scan.nextInt();

        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));

        scan.close();
    }
}
