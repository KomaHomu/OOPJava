package lab.tuan2.lab2;

import java.util.Scanner;

public class GradesHistogram {

    public static int[] grades;
    public static int[] histogram = new int[10]; // stores number of grades in each range, total of 11 ranges from 0 to 100

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

    public static void computeHistogram() {

        int rangeIdx;

        for (int grade : grades) {
            rangeIdx = (grade == 100) ? 9 : grade / 10;
            histogram[rangeIdx] += 1;
        }
    }

    public static void horizontalHistogram() {

        int lowerbound;
        int upperbound;

        System.out.println("\nHorizontal grades' histogram:");
        for (int rangeIdx = 0; rangeIdx < histogram.length; rangeIdx++) { // print name of ranges, ex: 0 - 9

            lowerbound = rangeIdx * 10;
            if (rangeIdx == 9) {
                upperbound = lowerbound + 10;
            } else {
                upperbound = lowerbound + 9;
            }

            System.out.printf("%2d - %3d: ", lowerbound, upperbound);

            for (int count = 0; count < histogram[rangeIdx]; count++) { // print stars (number of grades in that range)
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void verticalHistogram() {

        //find maximum number of rows
        int maxRow = histogram[0];
        for (int rangeIdx = 1; rangeIdx < histogram.length; rangeIdx++) {
            maxRow = Math.max(histogram[rangeIdx], maxRow);
        }

        int lowerbound;
        int upperbound;
        String space;

        System.out.println("\nVertical grades' histogram:");
        for (int row = maxRow; row >= 0; row--) {

            if (row == 0) { // print name of ranges, ex: 0 - 9
                for (int rangeIdx = 0; rangeIdx < histogram.length; rangeIdx++) {

                    lowerbound = rangeIdx * 10;
                    if (rangeIdx == 9) {
                        upperbound = lowerbound + 10;
                    } else {
                        upperbound = lowerbound + 9;
                    }

                    System.out.printf(" %2d-%2d ", lowerbound, upperbound);
                }
            } else {
                for (int count : histogram) { // print stars (number of grades in that range)
                    space = (count < row) ? " " : "*"; // whitespace to fill up empty rows
                    System.out.printf("%4s%2s ", space, " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        readGrades();
        computeHistogram();
        horizontalHistogram();
        verticalHistogram();
    }
}
