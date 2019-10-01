package by.epam.unit01.branching;

import by.epam.unit01.scanner.EnterFromConsole;

public class task22 {

    public static void main(String args[]) {

        System.out.println("Enter x:");
        double x = EnterFromConsole.EnterDouble();
        System.out.println("Enter y:");
        double y = EnterFromConsole.EnterDouble();

        System.out.println("x=" + x + "; y=" + y);

        if (x < y) {
            double temp = x;
            x = y;
            y = temp;
        }

        System.out.println("x=" + x + "; y=" + y);
    }
}
