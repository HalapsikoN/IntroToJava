package by.epam.Day1.branching;

import by.epam.Day1.scanner.EnterFromConsole;

public class task34 {

    public static void main(String args[]) {

        System.out.println("Enter the book price:");
        double bookPrice = EnterFromConsole.EnterDouble();
        System.out.println("Enter amount deposited:");
        double amountDeposit = EnterFromConsole.EnterDouble();

        if (amountDeposit > bookPrice) {
            System.out.println("Thank you! Please take your surrender: " + (amountDeposit - bookPrice));
        } else if (amountDeposit == bookPrice) {
            System.out.println("Thank you!");
        } else {
            System.out.println("Sorry, your amount is not enough. Amount to pay: " + (bookPrice - amountDeposit));
        }
    }
}
