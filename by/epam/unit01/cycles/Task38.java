package by.epam.unit01.cycles;

import by.epam.unit01.scanner.EnterFromConsole;

public class Task38 {

    public static void main(String args[]) {

        int n = 0;
        while (n < 100) {
            System.out.println("Enter n:");
            n = EnterFromConsole.EnterInteger();
        }

        int step, last, previous;
        last = n % 10;
        n /= 10;
        previous = n % 10;
        n /= 10;
        step = previous - last;

        while (n > 0) {

            int temp = n % 10;
            if (step == temp - previous) {

                previous = temp;
            } else {
                break;
            }
            n /= 10;
        }

        System.out.println("Result: " + ((n == 0) ? ("yes") : ("no")));
    }
}
