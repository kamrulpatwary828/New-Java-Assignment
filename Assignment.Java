import java.util.Scanner;

public class Printer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of pages:");
        int pages = scanner.nextInt();
        System.out.println("Printing " + pages + " pages...");
    }
}
