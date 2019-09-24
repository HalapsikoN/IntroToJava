package by.epam.Day1.lineProgram;

import by.epam.Day1.scanner.EnterFromConsole;

public class task3 {

    public static void main(String args[]) {

        System.out.println("Enter x:");
        double x = EnterFromConsole.EnterDouble();
        System.out.println("Enter y:");
        double y = EnterFromConsole.EnterDouble();

        double result = 2 * x + (y - 2) * 5;
        System.out.println("Result: " + result);
    }
}
