package by.epam.unit02.array;

import by.epam.unit02.arrayLogic.ArrayWithConsole;

public class Task20 {

    public static void main(String args[]) {

        double[] array = ArrayWithConsole.EnterArrayFromConsoleDouble();

        ArrayWithConsole.printArray(array);

        for (int i = 1; i < array.length; i += 2) {

            array[i] = 0;
        }

        System.out.println("Result:");
        ArrayWithConsole.printArray(array);
    }
}
