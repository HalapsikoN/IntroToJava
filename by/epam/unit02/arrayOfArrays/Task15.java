package by.epam.unit02.arrayOfArrays;

import by.epam.unit02.arrayLogic.ArrayWithConsole;
import by.epam.unit02.scanner.EnterFromConsole;

public class Task15 {

    public static void main(String args[]) {

        int numberLines = 0;
        while (numberLines <= 0) {

            System.out.print("Enter number of lines:");
            numberLines = EnterFromConsole.EnterInteger();
        }

        int[][] array = new int[numberLines][numberLines];

        for (int i = 0; i < array.length; ++i) {

            array[i][i] = numberLines--;
        }

        ArrayWithConsole.printArray(array);
    }
}
