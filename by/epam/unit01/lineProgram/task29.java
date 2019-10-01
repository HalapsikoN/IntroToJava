package by.epam.unit01.lineProgram;

import by.epam.unit01.scanner.EnterFromConsole;

public class task29 {

    public static void main(String args[]) {


        System.out.println("Enter a:");
        double a = EnterFromConsole.EnterDouble();
        System.out.println("Enter b:");
        double b = EnterFromConsole.EnterDouble();
        System.out.println("Enter c:");
        double c = EnterFromConsole.EnterDouble();

        double aa = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);
        double bb = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);
        double cc = (Math.pow(b, 2) + Math.pow(a, 2) - Math.pow(c, 2)) / (2 * b * a);

        System.out.println("Result in radians: " + Math.acos(aa) + " " + Math.acos(bb) + " " + Math.acos(cc));
        System.out.println("Result in degree: " + (Math.acos(aa) * 180 / Math.PI) + " " + (Math.acos(bb) * 180 / Math.PI) + " " + (Math.acos(cc) * 180 / Math.PI));
    }
}
