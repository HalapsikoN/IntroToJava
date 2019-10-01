package by.epam.unit01.branching;

import by.epam.unit01.scanner.EnterFromConsole;

public class task38 {

    public static void main(String args[]) {

        System.out.println("Enter x:");
        double x = EnterFromConsole.EnterDouble();

        double result = (x >= 0 && x <= 3) ? (Math.pow(x, 2)) : (4);
        System.out.println("Result: " + result);
    }
}
