package by.epam.Day1.lineProgram;

import by.epam.Day1.scanner.EnterFromConsole;

public class task35 {

    public static void main(String args[]) {

        int n = 0, m = 0;

        while (m <= 0) {

            System.out.println("Enter m:");
            m = EnterFromConsole.EnterInteger();
        }
        while (n <= 0) {

            System.out.println("Enter n:");
            n = EnterFromConsole.EnterInteger();
        }

        double div = (double) m / (double) n;
        System.out.println("Div: " + div);

        int ml, st;
        ml = (int) div % 10;
        div *= 10;
        st = (int) div % 10;

        System.out.println("Result: " + ml + "." + st);
    }
}
