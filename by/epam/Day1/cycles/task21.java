package by.epam.Day1.cycles;

import by.epam.Day1.scanner.EnterFromConsole;

public class task21 {

    public static void main(String args[]) {

        double a, b, h;
        System.out.println("Enter a");
        a = EnterFromConsole.EnterDouble();
        System.out.println("Enter b");
        b = EnterFromConsole.EnterDouble();
        System.out.println("Enter h");
        h = EnterFromConsole.EnterDouble();

        if (b < a) {

            double temp = a;
            a = b;
            b = temp;
        }

        if (h < 0) {

            h *= -1;
        }

        for (double x = a; x <= b; x += h) {

            double fun = x - Math.sin(x);
            System.out.println(x + " - " + fun);
        }
        return;
    }
}
