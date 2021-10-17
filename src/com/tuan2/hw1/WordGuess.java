package com.tuan2.hw1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordGuess {

    private static final Random rand = new Random();
    private static List<String> lines = null;

    static {
        try {
            lines = Files.readAllLines(new File("src/com/tuan2/hw1/random.txt").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getSecretWord() {

        String selLine = lines.get(rand.nextInt(lines.size()));
        String[] arrOfLine = selLine.split(" ");

        return arrOfLine[rand.nextInt(arrOfLine.length)].toLowerCase();
    }

    public static void guessingGame() {

        Scanner scan = new Scanner(System.in);

        final String SECRET_WORD = getSecretWord(); // set as args[0] if you want to get the word using command-line

        String guess;
        int turn = 1;
        StringBuilder temp;
        char test;
        char[] arr = new char[SECRET_WORD.length()];

        Arrays.fill(arr, '-');
        temp = new StringBuilder(new String(arr));

        System.out.println("The secret word is: " + SECRET_WORD);

        System.out.print("Key in one character or your guess word: ");
        guess = scan.next();

        while (true) {
            if (guess.length() == SECRET_WORD.length()) {
                if (guess.equals(SECRET_WORD)) {
                    break;
                } else {
                    System.out.println("Incorrect word.");
                }
            }

            if (guess.length() == 1) {
                test = guess.charAt(0);
                for (int i = 0; i < SECRET_WORD.length(); i++) {
                    if (test == SECRET_WORD.charAt(i)) {

                        temp.setCharAt(i, test);
                    }
                }

                if (temp.toString().equals(SECRET_WORD)) {
                    break;
                }
            }
            System.out.println("Trial " + turn + ": " + temp);

            turn++;

            System.out.print("Key in one character or your guess word: ");
            guess = scan.next();
        }

        System.out.println("Congratulation!");
        if (turn == 1) {
            System.out.println("You got it in 1 trial!");
        } else {
            System.out.println("You got it in " + turn + " trials!");
        }
    }

    public static void main(String[] args) {

        guessingGame();
    }
}
