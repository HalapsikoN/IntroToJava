package by.epam.unit01.branching;

import by.epam.unit01.scanner.EnterFromConsole;

public class Task39 {

    public static void main(String args[]) {

        System.out.println("Enter x:");
        double x = EnterFromConsole.EnterDouble();

        double result = (x >= 8) ? (-Math.pow(x, 2) + x - 9) : (1 / (Math.pow(x, 4) - 6));
        System.out.println("Result: " + result);
    }
}
