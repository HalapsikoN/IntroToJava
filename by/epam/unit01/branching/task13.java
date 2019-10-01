package by.epam.unit01.branching;

import by.epam.unit01.scanner.EnterFromConsole;

public class task13 {

    private static double distanceFromTheBeginning(double x, double y) {

        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static void main(String args[]) {

        System.out.println("Enter x for A:");
        double x1 = EnterFromConsole.EnterDouble();
        System.out.println("Enter y for A:");
        double y1 = EnterFromConsole.EnterDouble();
        System.out.println("Enter x for B:");
        double x2 = EnterFromConsole.EnterDouble();
        System.out.println("Enter y for B:");
        double y2 = EnterFromConsole.EnterDouble();

        System.out.println(((distanceFromTheBeginning(x1, y1) > distanceFromTheBeginning(x2, y2)) ? ("B ") : ("A ")) + "is closer to the origin.");
    }
}
