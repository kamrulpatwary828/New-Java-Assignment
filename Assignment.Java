import java.util.Scanner;

public class Printer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of pages:");
        int pages = scanner.nextInt();

        if (pages > 0) {
            System.out.println("Printing " + pages + " pages successfully.");
        } else {
            System.out.println("Invalid page count.");
        }

        scanner.close();
    }
}
