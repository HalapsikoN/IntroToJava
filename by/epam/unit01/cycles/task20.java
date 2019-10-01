package by.epam.unit01.cycles;
//??????????????????????????????????????

import by.epam.unit01.scanner.EnterFromConsole;

public class task20 {

    public static void main(String args[]) {

        System.out.println("Enter e:");
        double e = EnterFromConsole.EnterInteger();

        if (e < 0) {

            e *= -1;
        }

        double result = 0;
        for (int i = 1; ; ++i) {

            double a = 1 / ((3 * i - 2) * (3 * i + 1));
            if (Math.abs(a) >= e) {

                result += a;
            } else {

                break;
            }
        }

        System.out.println("Result: " + result);
    }
}
