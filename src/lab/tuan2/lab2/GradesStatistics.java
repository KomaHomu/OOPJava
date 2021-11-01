package lab.tuan2.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {

    public static int[] grades;

    public static void readGrades() {

        Scanner scan = new Scanner(System.in);

        int numberOfStudent;

        do {
            System.out.print("Enter the number of students : ");
            numberOfStudent = scan.nextInt();
        } while (numberOfStudent <= 0);

        grades = new int[numberOfStudent];

        //read array
        for (int index = 1; index <= grades.length; index++) {

            do {
                System.out.printf("Enter the grade for student %d : ", index);
                grades[index - 1] = scan.nextInt();
            } while (grades[index - 1] <= 0);
        }

        scan.close();
    }

    public static void print(int[] array) {

        if (array == null) {
            return;
        }

        System.out.print("[" + array[0]);
        for (int index = 1; index < array.length; index++) {
            System.out.printf(", %d", array[index]);
        }
        System.out.print("]\n");
    }

    public static double average(int[] array) {

        if (array == null) {
            return -1;
        } else if (array.length == 1) {
            return array[0];
        }

        int sumOfGrades = 0;

        for (Integer grade : array) {
            sumOfGrades += grade;
        }

        return (sumOfGrades * 100.00 / 100.00) / array.length;
    }

    public static double median(int[] array) {

        if (array == null) {
            return -1;
        } else if (array.length == 1) {
            return array[0];
        }

        int numberOfStudent = array.length;

        double median;

        Arrays.sort(array);

        if (numberOfStudent % 2 == 0) {
            median = (array[numberOfStudent / 2 - 1] + array[numberOfStudent / 2]) * 100.00 / 100.00 / 2;
        } else {
            median = array[numberOfStudent / 2 + 1];
        }

        return median;
    }

    public static int max(int[] array) {

        if (array == null) {
            return -1;
        } else if (array.length == 1) {
            return array[0];
        }

        int max = array[0];

        for (Integer grade : array) {
            if (grade > max) {
                max = grade;
            }
        }

        return max;
    }

    public static int min(int[] array) {

        if (array == null) {
            return -1;
        } else if (array.length == 1) {
            return array[0];
        }

        int min = array[0];

        for (Integer grade : array) {
            if (grade < min) {
                min = grade;
            }
        }

        return min;
    }

    public static double stdDev(int[] array) {

        if (array == null) {
            return -1;
        } else if (array.length == 1) {
            return 0;
        }

        double stdDev = 0.0;

        double avgGrades = average(array);

        for (Integer grade : array) {
            stdDev += Math.pow(grade - avgGrades, 2);
        }
        stdDev = Math.sqrt(stdDev / array.length);

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
