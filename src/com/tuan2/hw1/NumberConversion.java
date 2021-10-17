package com.tuan2.hw1;

import java.util.Scanner;

public class NumberConversion {

    public static String toRadix(String in, int inRadix, int outRadix) {

        int value = Integer.parseInt(in.toUpperCase(), inRadix);

        return Integer.toString(value, outRadix);
    }

    public static void main(String[] args) {

        String str;
        String result;
        int inRadix;
        int outRadix;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = scan.next();
        System.out.print("Enter the input radix: ");
        inRadix = scan.nextInt();
        System.out.print("Enter the output radix: ");
        outRadix = scan.nextInt();

        result = toRadix(str, inRadix, outRadix);

        System.out.println(str + " in radix " + inRadix + " is " + result + " in radix " + outRadix);

        scan.close();
    }
}
