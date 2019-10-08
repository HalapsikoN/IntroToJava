package by.epam.unit01.lineProgram;

import by.epam.unit01.scanner.EnterFromConsole;

public class Task38 {

    public static void main(String args[]) {

        System.out.println("Enter x:");
        double x = EnterFromConsole.EnterDouble();
        System.out.println("Enter y:");
        double y = EnterFromConsole.EnterDouble();

        boolean res1 = false, res2 = false, res3 = false;

        if ((y <= Math.abs(x + 4) && y >= 0) && (x >= -4 && x <= 4)) {
            res1 = true;
        }
        if (((x >= -2 && x <= 2) && (y >= 0 && y <= 2)) || ((x >= -4 && x <= 4) && (y >= -2 && y <= 0))) {
            res2 = true;
        }
        if (((x >= 0 && x <= 4) &&
                (y < Math.sqrt(16 - Math.pow(x, 2)) && y >= 0 && y <= 4)) ||
                ((x >= 0 && x <= 5) && (y > -Math.sqrt(25 - Math.pow(x, 2)) && y <= 0 && y >= -5))) {
            res3 = true;
        }

        System.out.println("a) " + res1);
        System.out.println("b) " + res2);
        System.out.println("c) " + res3);

    }
}
