package by.epam.unit02.arrayOfArrays;

import by.epam.unit02.arrayLogic.ArrayWithConsole;
import by.epam.unit02.scanner.EnterFromConsole;

public class task17 {

    public static void main(String argv[]) {

        int numberLines = 0;
        while (numberLines <= 0) {

            System.out.print("Enter number of lines:");
            numberLines = EnterFromConsole.EnterInteger();
        }

        int[][] array = new int[numberLines][numberLines];


        for (int i = 0; i < array.length; ++i) {
            array[i][0] = 1;
        }

        for (int i = 0; i < array.length; ++i) {
            array[0][i] = 1;
        }

        for (int i = 0; i < array.length; ++i) {
            array[i][array.length - 1] = 1;
        }

        for (int i = 0; i < array.length; ++i) {
            array[array.length - 1][i] = 1;
        }

        ArrayWithConsole.printArray(array);
    }
}
