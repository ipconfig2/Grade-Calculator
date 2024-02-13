import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // prompt user for number of grades (make sure they enter at least 3)
        int numGrades;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of grades:"); // asks the user for grades
        numGrades = reader.nextInt(); // reads in grades
        while (numGrades < 3) {
            System.out.println("Must enter at least 3 grades. Try again:");
            numGrades = reader.nextInt();
        }

        // construct an int array to hold numGrades elements
        int[] grades = new int[numGrades];

        // prompt user for each grade & store it in grades array
        System.out.println("Enter each grade now:");
        for (int i = 0; i < grades.length; i++)
            grades[i] = reader.nextInt();

        // pass grades to calcMax function & print info
        System.out.println("Highest grade: " + calcMax(grades));

        // pass grades to calcMin function & print info
        System.out.println("Lowest grade: " + calcMin(grades));

        // pass grades to calcAverage & print info
        System.out.println("Average grade: " + calcAdv(grades));
    }

    // calculate the maximum element value in any int array
    public static int calcMax(int[] anyArray) {
        // start by assuming the first element is max
        int max = anyArray[0];

        // check other elements & update if larger
        for (int i = 1; i < anyArray.length; i++) {
            if (anyArray[i] > max) {
                max = anyArray[i];
            }
        }
        return max;
    }

    // calculate the minimum element value in any int array
    public static int calcMin(int[] anyArray) {
        // start by assuming the first element is min
        int min = anyArray[0];

        // check other elements & update if smaller
        for (int i = 1; i < anyArray.length; i++) {
            if (anyArray[i] < min) {
                min = anyArray[i];
            }
        }
        return min;
    }

    // calculate the average element value in any int array
    // make sure to return a double
    public static double calcAdv(int[] anyArray) {
        // start by assuming first element is max
        int add = 0;

        // check other elements & update if larger
        for (int i = 0; i < anyArray.length; i++) {
            add = anyArray[i] + add;
        }

        return (double) add / anyArray.length;
    }
}
