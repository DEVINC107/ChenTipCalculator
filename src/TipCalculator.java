import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hello, enter your name: ");
        String name = scan.nextLine();
        System.out.println("Welcome to the tip calculator, " + name);
        System.out.print("Enter how many people are in the group: ");
        int people = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the tip percentage (1 - 100): ");
        int tipPercent = scan.nextInt();
        scan.nextLine();

        double cost;

        while (cost != -1) {
            System.out.print("List an item cost in dollars and cents: $");

        }
    }
}
