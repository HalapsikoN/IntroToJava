package by.epam.unit02.array;

import by.epam.unit02.arrayLogic.ArrayWithConsole;

public class Task12 {

    private static boolean isPrime(int number) {

        boolean result = true;

        for (int i = 2; i <= number / 2; ++i) {

            if (number % i == 0) {
                result = false;
                break;
            }
        }

        if (number < 2) {

            result = false;
        }
        return result;
    }

    public static void main(String args[]) {

        double[] array = ArrayWithConsole.EnterArrayFromConsoleDouble();

        double amount = 0;
        for (int i = 0; i < array.length; ++i) {

            if (isPrime(i)) {

                amount += array[i];
                System.out.println(array[i]);
            }
        }

        System.out.print("Result: " + amount);
    }
}
