package by.epam.unit01.lineProgram;

import by.epam.unit01.scanner.EnterFromConsole;

public class Task3 {

    public static void main(String args[]) {

        System.out.println("Enter x:");
        double x = EnterFromConsole.EnterDouble();
        System.out.println("Enter y:");
        double y = EnterFromConsole.EnterDouble();

        double result = 2 * x + (y - 2) * 5;
        System.out.println("Result: " + result);
    }
}
