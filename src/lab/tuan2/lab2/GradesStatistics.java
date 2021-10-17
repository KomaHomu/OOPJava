package lab.tuan2.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {

    public static int[] grades;

    public static void readGrades() {

        Scanner scan = new Scanner(System.in);

        final int NUM_STUDENTS;

        System.out.print("Enter the number of students : ");
        NUM_STUDENTS = scan.nextInt();
        grades = new int[NUM_STUDENTS];

        //read array
        for (int index = 1; index <= grades.length; index++) {
            System.out.printf("Enter the grade for student %d : ", index);
            grades[index - 1] = scan.nextInt();
        }

        scan.close();
    }

    public static void print(int[] array) {

        System.out.print("[" + array[0]);
        for (int index = 1; index < array.length; index++) {
            System.out.printf(", %d", array[index]);
        }
        System.out.print("]\n");
    }

    public static double average(int[] array) {

        final int NUM_STUDENTS = array.length;

        int sumOfGrades = 0;
        double avgGrade;

        for (Integer grade : array) {
            sumOfGrades += grade;
        }

        avgGrade = (sumOfGrades * 100.00 / 100.00) / NUM_STUDENTS;

        return avgGrade;
    }

    public static double median(int[] array) {

        final int NUM_STUDENTS = array.length;

        double median;

        Arrays.sort(array);

        if (NUM_STUDENTS % 2 == 0) {
            median = (array[NUM_STUDENTS / 2 - 1] + array[NUM_STUDENTS / 2]) * 100.00 / 100.00 / 2;
        } else {
            median = array[NUM_STUDENTS / 2 + 1];
        }

        return median;
    }

    public static int max(int[] array) {

        int max;

        max = array[0];

        for (Integer grade : array) {
            if (grade > max) {
                max = grade;
            }
        }

        return max;
    }

    public static int min(int[] array) {

        int min;

        min = array[0];

        for (Integer grade : array) {
            if (grade < min) {
                min = grade;
            }
        }

        return min;
    }

    public static double stdDev(int[] array) {

        final int NUM_STUDENTS = array.length;

        double stdDev = 0.0;
        double avgGrades;

        avgGrades = average(array);

        for (Integer grade : array) {
            stdDev += Math.pow(grade - avgGrades, 2);
        }
        stdDev = Math.sqrt(stdDev / NUM_STUDENTS) * 100.00 / 100.00;

        return stdDev;
    }

    public static void main(String[] args) {

        readGrades();
        System.out.print("The grades are: ");
        print(grades);
        System.out.printf("The average is %.2f", average(grades));
        System.out.printf("%nThe median is %.2f", median(grades));
        System.out.println("\nThe minimum is " + min(grades));
        System.out.println("The maximum is " + max(grades));
        System.out.printf("The standard deviation is %.2f", stdDev(grades));
    }
}
