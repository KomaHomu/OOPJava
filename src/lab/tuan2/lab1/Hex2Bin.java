package lab.tuan2.lab1;

import java.util.HashMap;
import java.util.Scanner;

public class Hex2Bin {
    public static void hexToBin(String hexStr) {

        char hexChar;
        String binary;

        hexStr = hexStr.toUpperCase();

        HashMap<Character, String> binMap = new HashMap<>();

        binMap.put('0', "0000");
        binMap.put('1', "0001");
        binMap.put('2', "0010");
        binMap.put('3', "0011");
        binMap.put('4', "0100");
        binMap.put('5', "0101");
        binMap.put('6', "0110");
        binMap.put('7', "0111");
        binMap.put('8', "1000");
        binMap.put('9', "1001");
        binMap.put('A', "1010");
        binMap.put('B', "1011");
        binMap.put('C', "1100");
        binMap.put('D', "1101");
        binMap.put('E', "1110");
        binMap.put('F', "1111");

        for (int index = 0; index < hexStr.length(); index++) {
            hexChar = hexStr.charAt(index);
            binary = binMap.getOrDefault(hexChar, "error");

            System.out.printf(" %s", binary);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String hexStr;

        System.out.print("Enter a Hexadecimal string: ");
        hexStr = scan.next();

        System.out.print("THe equivalent binary for hexadecimal \"" + hexStr + "\" is: ");
        hexToBin(hexStr);

        scan.close();

    }
}
