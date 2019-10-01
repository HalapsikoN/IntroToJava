package by.epam.unit01.lineProgram;

import by.epam.unit01.scanner.EnterFromConsole;

public class task10 {

    public static void main(String args[]) {

        System.out.println("Enter x:");
        double x = EnterFromConsole.EnterDouble();
        System.out.println("Enter y:");
        double y = EnterFromConsole.EnterDouble();

        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(y) - Math.sin(y)) * (Math.tan(x * y));

        System.out.println("Result: " + result);
    }
}
