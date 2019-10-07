package by.epam.unit03.task3;

import by.epam.unit03.scnner.EnterFromConsole;

public class main {

    public static void main(String[] argv) {
        Counter usualCounter = new Counter();

        System.out.println("Enter max number of counter:");
        int max = EnterFromConsole.EnterInteger();
        System.out.println("Enter min number of counter:");
        int min = EnterFromConsole.EnterInteger();
        System.out.println("Enter start number of counter:");
        int start = EnterFromConsole.EnterInteger();

        Counter userCounter = new Counter(start, min, max);

        System.out.println("Entered data:");
        System.out.println("Usual counter: " + usualCounter);
        System.out.println("User counter: " + userCounter);

        userCounter.increment();
        usualCounter.increment();

        System.out.println("After increment:");
        System.out.println("Usual counter: " + usualCounter);
        System.out.println("User counter: " + userCounter);

        userCounter.decrement();
        usualCounter.decrement();

        System.out.println("After decrement:");
        System.out.println("Usual counter: " + usualCounter);
        System.out.println("User counter: " + userCounter);

    }
}
