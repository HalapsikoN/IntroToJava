package by.epam.Day1.lineProgram;

import by.epam.Day1.scanner.EnterFromConsole;

public class task17 {

    public static void main(String args[]) {

        System.out.println("Enter x:");
        double x = EnterFromConsole.EnterDouble();
        System.out.println("Enter y:");
        double y = EnterFromConsole.EnterDouble();

        double result1 = (Math.pow(x, 3) + Math.pow(y, 3)) / 2;
        double result2 = Math.sqrt(Math.abs(x) * Math.abs(y));

        System.out.println("Result: " + result1 + " and " + result2);
    }
}
