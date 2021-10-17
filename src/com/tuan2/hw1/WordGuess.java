package com.tuan2.hw1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Random;

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

        final String SECRET_WORD = args[0]; // set as args[0]

        StringBuilder temp;
        char[] arr = new char[SECRET_WORD.length()];
        int count = 0;

        System.out.println("The secret word is: " + SECRET_WORD);
    }

    public static void main(String[] args) {

        guessingGame();
    }
}
