package by.epam.Day1.lineProgram;

import by.epam.Day1.scanner.EnterFromConsole;

public class task21 {

    public static void main(String args[]) {

        System.out.println("Enter n:");
        double n = EnterFromConsole.EnterDouble();

        double tempInt = (int) n;
        double temp = n - tempInt;

        while (n >= 1) {

            tempInt /= 10;
            temp *= 10;
            n /= 10;
        }

        n = tempInt + temp;

        System.out.println("Result: " + n);

    }
}
