package by.epam.unit02.arrayOfArrays;

import by.epam.unit02.arrayLogic.ArrayWithConsole;
import by.epam.unit02.scanner.EnterFromConsole;

public class Task20 {

    public static void main(String argv[]) {

        int numberLines = 0;
        while (numberLines <= 0) {

            System.out.print("Enter number of lines:");
            numberLines = EnterFromConsole.EnterInteger();
        }

        int[][] array = new int[numberLines][numberLines];


        for (int i = 0; i < array.length / 2; ++i) {
            for (int j = 0; j < i + 1; ++j) {

                array[i][j] = 1;
                array[i][array[i].length - j - 1] = 1;
            }
        }

        for (int i = 0; i < array.length / 2; ++i) {
            for (int j = 0; j < i + 1; ++j) {

                array[array.length - i - 1][j] = 1;
                array[array.length - i - 1][array[i].length - j - 1] = 1;
            }
        }

        ArrayWithConsole.printArray(array);
    }
}
