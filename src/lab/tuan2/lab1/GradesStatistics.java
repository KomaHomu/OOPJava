package lab.tuan2.lab1;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final int NUM_STUDENTS;
        int[] grades;
        int minGrade;
        int maxGrade;
        int sumOfGrades = 0;
        double avgGrade;

        System.out.print("Enter the number of students : ");
        NUM_STUDENTS = scan.nextInt();
        grades = new int[NUM_STUDENTS];

        //read array
        for (int index = 1; index <= grades.length; index++) {
            System.out.printf("Enter the grade for student %d : ", index);
            grades[index - 1] = scan.nextInt();
            sumOfGrades += grades[index - 1];
        }

        //print avg grade
        avgGrade = (double) sumOfGrades / (grades.length);
        System.out.printf("The average is: %.2f%n", avgGrade);

        //print min grade
        minGrade = grades[0];
        for (int index = 1; index < grades.length; index++) {
            if (grades[index] < minGrade) {
                minGrade = grades[index];
            }
        }
        System.out.println("The minimum is: " + minGrade);

        //print max grade
        maxGrade = grades[0];
        for (int index = 1; index < grades.length; index++) {
            if (grades[index] > maxGrade) {
                maxGrade = grades[index];
            }
        }
        System.out.println("The maximum is: " + maxGrade);

        scan.close();
    }
}
