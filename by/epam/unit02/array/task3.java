package by.epam.unit02.array;

import by.epam.unit02.arrayLogic.ArrayWithConsole;

public class task3 {

    public static void main(String args[]) {

        int[] array = ArrayWithConsole.EnterArrayFromConsoleInteger();

        ArrayWithConsole.printArray(array);

        int i;
        for (i = 0; i < array.length; ++i) {

            if (array[i] < 0) {
                System.out.println("Negative is earlier");
                return;
            } else if (array[i] > 0) {
                System.out.println("Positive is earlier");
                return;
            }
        }

        System.out.println("ALL IS 0");
    }
}