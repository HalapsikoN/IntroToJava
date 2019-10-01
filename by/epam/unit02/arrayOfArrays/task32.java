package by.epam.unit02.arrayOfArrays;

import by.epam.unit02.arrayLogic.ArrayWithConsole;

public class task32 {

    public static void main(String argv[]) {

        int[][] array = ArrayWithConsole.EnterDoubleArrayFromConsoleInteger();

        ArrayWithConsole.printArray(array);
        System.out.println();

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                for (int k = j; k < array[i].length; ++k) {

                    if (array[i][j] > array[i][k]) {
                        int temp = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = temp;
                    }
                }
            }
        }

        ArrayWithConsole.printArray(array);
    }
}
