import java.util.Scanner;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class TipCalculator {
    public static String format(double price) {
        return String.format("%.2f", price);
    }
    public static void main(String[] args) {
        final double tipAverage = 20;
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
        double cost = scan.nextDouble();
        scan.nextLine();
        System.out.print("What is this item called? ");
        String itemName = scan.nextLine();
        Dictionary<String, Double> items = new Hashtable<>();
        items.put(itemName, cost);

        while (cost != -1) {
            System.out.print("List an item cost in dollars and cents (-1 to stop): $");
            cost = scan.nextDouble();
            if (cost != -1) {
                scan.nextLine();
                System.out.print("What is this item called? ");
                itemName = scan.nextLine();
                items.put(itemName, cost);
            }
        }

        System.out.println("Calculating result... ...");

        double total = 0;

        Enumeration<String> k = items.keys();
        while (k.hasMoreElements()) {
            String key = k.nextElement();
            double value = items.get(key);

            total += value;
        }

        double tip = total * tipPercent / 100;
        double totalAndTip = total + tip;
        double costPerPerson = total / people;
        double tipPerPerson = (tip / people);
        double costAndTipPerPerson = costPerPerson + tipPerPerson;

        System.out.println("Total bill before tip: $" + format(total));
        System.out.println("Total percentage: %" + tipPercent);
        System.out.println("Total tip: $" + format(tip));
        System.out.println("Total bill with tip: $" + format(totalAndTip));
        System.out.println("Per person cost before tip: $" + format(costPerPerson));
        System.out.println("Tip per person: $" + format(tipPerPerson));
        System.out.println("Per person total cost: $" + format(costAndTipPerPerson));

        System.out.println("Items ordered:");

        k = items.keys();
        while (k.hasMoreElements()) {
            System.out.println(k.nextElement());
        }

        if (tipPercent > tipAverage) {
            System.out.println("You tipped " + ((double) tipPercent/tipAverage) + "x more than the average.");
            System.out.println("The extra tipped amounts to $" + format(tip - total * (tipAverage/100)));
            System.out.println("How generous!");
        }
    }
}
