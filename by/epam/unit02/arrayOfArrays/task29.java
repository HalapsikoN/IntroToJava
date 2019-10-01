package by.epam.unit02.arrayOfArrays;

import by.epam.unit02.arrayLogic.ArrayWithConsole;

public class task29 {

    public static void main(String argv[]) {

        int[][] array = ArrayWithConsole.EnterSquareArrayFromConsoleInteger();

        ArrayWithConsole.printArray(array);

        System.out.println("Result: ");
        for (int i = 0; i < array.length; ++i) {

            if (array[i][i] > 0) {
                System.out.print(array[i][i] + " ");
            }
        }
        System.out.println();
    }
}
