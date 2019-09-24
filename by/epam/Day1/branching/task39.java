package by.epam.Day1.branching;

import by.epam.Day1.scanner.EnterFromConsole;

public class task39 {

    public static void main(String args[]) {

        System.out.println("Enter x:");
        double x = EnterFromConsole.EnterDouble();

        double result = (x >= 8) ? (-Math.pow(x, 2) + x - 9) : (1 / (Math.pow(x, 4) - 6));
        System.out.println("Result: " + result);
    }
}
