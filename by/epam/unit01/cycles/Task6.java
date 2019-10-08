package by.epam.unit01.cycles;

import by.epam.unit01.scanner.EnterFromConsole;

public class Task6 {

    public static void main(String args[]) {

        int n = 0;
        while (n <= 0) {
            System.out.println("Enter n:");
            n = EnterFromConsole.EnterInteger();
        }

        int result = 0;
        for (int i = 1; i <= n; ++i) {
            result += i;
        }

        System.out.println("Result: " + result);
    }
}
