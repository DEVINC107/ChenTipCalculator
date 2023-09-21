import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class TipCalculator {
    public static String format(double price) {
        return String.format("%.2f", price);
    }
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

        System.out.print("List an item cost in dollars and cents (-1 to stop): $");
        double lastCost = scan.nextDouble();
        ArrayList<double> costs = new ArrayList<double>();

        while (lastCost != -1) {

            System.out.print("List an item cost in dollars and cents (-1 to stop): $");
            lastCost = scan.nextDouble();
            scan.nextLine();
        }

        System.out.println("Calculating result... ...");

        double tip = total * tipPercent / 100;
        double totalAndTip = total + tip;
        double costPerPerson = total / people;
        double tipPerPerson = (tip / people);
        double costAndTipPerPerson = costPerPerson + tipPerPerson;

        System.out.println("Total bill before tip: " + format(total));
        System.out.println("Total percentage: " + format(tipPercent));
        System.out.println("Total tip: " + format(tip));
        System.out.println("Total bill with tip: " + format(totalAndTip));
        System.out.println("Per person cost before tip: " + format(costPerPerson));
        System.out.println("Tip per person: " + format(tipPerPerson));
        System.out.println("Per person total cost: " + format(costAndTipPerPerson));



    }
}
