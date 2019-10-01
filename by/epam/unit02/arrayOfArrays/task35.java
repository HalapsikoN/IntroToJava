package by.epam.unit02.arrayOfArrays;

import by.epam.unit02.arrayLogic.ArrayWithConsole;

public class task35 {

    public static void main(String argv[]) {

        int[][] array = ArrayWithConsole.EnterDoubleArrayFromConsoleInteger();

        ArrayWithConsole.printArray(array);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {

                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("Max element: " + max);

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {

                if (array[i][j] % 2 == 1) {
                    array[i][j] = max;
                }
            }
        }

        ArrayWithConsole.printArray(array);
    }
}
