package by.epam.Day1.branching;

import by.epam.Day1.scanner.EnterFromConsole;

public class task9 {

    public static void main(String args[]) {

        System.out.println("Enter a:");
        double a = EnterFromConsole.EnterDouble();
        System.out.println("Enter b:");
        double b = EnterFromConsole.EnterDouble();
        System.out.println("Enter c:");
        double c = EnterFromConsole.EnterDouble();

        System.out.println("The triangle is" + ((a == b && b == c && a == c) ? " " : " NOT ") + "equilateral.");
    }
}
