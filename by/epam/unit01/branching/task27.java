package by.epam.unit01.branching;

import by.epam.unit01.scanner.EnterFromConsole;

public class task27 {

    public static void main(String args[]) {

        System.out.println("Enter a:");
        double a = EnterFromConsole.EnterDouble();
        System.out.println("Enter b:");
        double b = EnterFromConsole.EnterDouble();
        System.out.println("Enter c:");
        double c = EnterFromConsole.EnterDouble();
        System.out.println("Enter d:");
        double d = EnterFromConsole.EnterDouble();

        double min1 = (a > b) ? b : a;
        double min2 = (c > d) ? d : c;

        System.out.println("Result: " + ((min2 > min1) ? min2 : min1));
    }
}
