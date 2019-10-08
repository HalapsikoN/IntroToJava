package by.epam.unit01.cycles;

import by.epam.unit01.scanner.EnterFromConsole;

public class Task24 {

    public static void main(String args[]) {

        int n = 0;
        while (n <= 0) {

            System.out.println("Enter n:");
            n = EnterFromConsole.EnterInteger();
        }

        int result = 0, sum = 0;
        while (n > 0) {

            int temp = n % 10;
            n /= 10;
            if (temp % 2 == 0) {

                result += temp;
            }
            sum = sum * 10 + temp;
        }

        System.out.println("Result: " + result + " sum of even: " + sum);
    }
}
