package lab.tuan2.lab1;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int dec;
        String hex;

        System.out.print("Enter a decimal number: ");
        dec = scan.nextInt();

        hex = Integer.toHexString(dec);

        System.out.println("The equivalent hexadecimal number is " + hex);

        scan.close();
    }
}
