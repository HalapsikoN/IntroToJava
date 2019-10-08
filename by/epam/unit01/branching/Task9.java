package by.epam.unit01.branching;

import by.epam.unit01.scanner.EnterFromConsole;

public class Task9 {

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
