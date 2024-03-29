package by.epam.unit01.cycles;

import by.epam.unit01.scanner.EnterFromConsole;

public class Task17 {

    public static void main(String args[]) {

        int n = 0;
        while (n == 0) {
            System.out.println("Enter n:");
            n = EnterFromConsole.EnterInteger();
        }
        System.out.println("Enter a:");
        double a = EnterFromConsole.EnterDouble();

        if (n < 0) {

            n *= -1;
        }

        double result = 1;
        for (int i = 1; i <= n; ++i) {

            result *= a + n - 1;
        }

        System.out.println("Result: " + result);
    }
}
