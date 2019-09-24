package by.epam.Day1.branching;

import by.epam.Day1.scanner.EnterFromConsole;

public class task35 {

    public static void main(String args[]) {

        int day = 0;
        while (day < 1 || day > 365) {
            System.out.println("Enter the day:");
            day = EnterFromConsole.EnterInteger();
        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sumDays = 0;
        for (int i = 0; i < 12; i++) {
            if (sumDays <= day && day <= sumDays + daysInMonth[i]) {
                System.out.println("Day: " + (day - sumDays) + "; month: " + (i + 1) + ".");
                return;
            }
            sumDays += daysInMonth[i];
        }
    }
}
