package by.epam.Day1.lineProgram;

import by.epam.Day1.scanner.EnterFromConsole;

public class task12 {

    public static void main(String args[]) {

        System.out.println("Enter x1:");
        double x1 = EnterFromConsole.EnterDouble();
        System.out.println("Enter y1:");
        double y1 = EnterFromConsole.EnterDouble();
        System.out.println("Enter x2:");
        double x2 = EnterFromConsole.EnterDouble();
        System.out.println("Enter y2:");
        double y2 = EnterFromConsole.EnterDouble();

        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Result: " + result);
    }
}
