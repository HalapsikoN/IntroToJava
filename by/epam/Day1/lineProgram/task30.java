package by.epam.Day1.lineProgram;

import by.epam.Day1.scanner.EnterFromConsole;

public class task30 {

    public static void main(String args[]) {
        double R1, R2, R3;

        System.out.println("Enter R1, R2, R3");
        R1 = EnterFromConsole.EnterDouble();
        R2 = EnterFromConsole.EnterDouble();
        R3 = EnterFromConsole.EnterDouble();

        double result = (R1 * R2 * R3) / (R1 * R2 + R1 * R3 + R2 * R3);
        System.out.println("the answer is " + result);
    }
}
