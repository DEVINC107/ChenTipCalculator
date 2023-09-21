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

        double total = 0;
        double cost = 0;

        while (cost != -1) {
            System.out.print("List an item cost in dollars and cents: $");
            cost = scan.nextDouble();
            total += cost;
            scan.nextLine();
        }

        System.out.println("Calculating result... ...");

        double tip = total * tipPercent / 100;
        double totalAndTip = total + tip;
        double costPerPerson = total / people;
        double tipPerPerson = (tip / people);
        double costAndTipPerPerson = costPerPerson + tipPerPerson;

        System.out.println("Total bill before tip: " + total);
        System.out.println("Total percentage: " + tipPercent);
        System.out.println("Total tip: " + tip);
        System.out.println("Total bill with tip: " + totalAndTip);
        System.out.println("Per person cost before tip: " + tipPerPerson);
        System.out.println("Per person total cost: " + costAndTipPerPerson);



    }
}
