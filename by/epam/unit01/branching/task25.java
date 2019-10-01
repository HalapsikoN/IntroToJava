package by.epam.unit01.branching;

import by.epam.unit01.scanner.EnterFromConsole;

public class task25 {

    public static void main(String args[]) {

        System.out.println("Enter the temperature:");
        double x = EnterFromConsole.EnterDouble();

        if (x > 60) {
            System.out.println("Fire situation!!!");
        }
    }
}
