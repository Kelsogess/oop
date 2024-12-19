import java.util.Scanner;

public class Shapes2 {

    private static double length;
    private static double width;

    // Method to get dimensions from the user
    public static void getDimensions() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length: ");
        length = sc.nextInt();

        System.out.println("Enter the width : ");
        width = sc.nextInt();
  }

    // Method to compute the area of the rectangle
    public static double computeArea(double length, double width) {
        return length * width;
    }

    // Method to display the computed area
    public static void displayArea(double area) {
        System.out.println("The area of the rectangle is: " + area);
    }

    public static void main(String[] args) {
        // Get dimensions from the user
        getDimensions();

        // Compute the area
        double area = computeArea(length, width);

        // Display the area
        displayArea(area);
    }
}