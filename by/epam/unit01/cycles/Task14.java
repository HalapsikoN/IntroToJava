package by.epam.unit01.cycles;

import by.epam.unit01.scanner.EnterFromConsole;

public class Task14 {

    public static void main(String args[]) {

        System.out.println("Enter N:");
        int N = EnterFromConsole.EnterInteger();

        if (N < 0) {

            N *= -1;
        }

        double result = 0;
        for (double i = 1; i <= N; ++i) {

            result += 1 / i;
        }
        System.out.println("Result: " + result);
        return;
    }
}
