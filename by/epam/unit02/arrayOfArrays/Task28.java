package by.epam.unit02.arrayOfArrays;

import by.epam.unit02.arrayLogic.ArrayWithConsole;

public class Task28 {

    public static void main(String argv[]) {

        int[][] array = ArrayWithConsole.EnterDoubleArrayFromConsoleInteger();
        int maxLength = Integer.MIN_VALUE;

        ArrayWithConsole.printArray(array);

        for (int i = 0; i < array.length; ++i) {

            if (array[i].length > maxLength) {
                maxLength = array[i].length;
            }
        }

        int[] tempArray = new int[maxLength];

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {

                tempArray[j] += array[i][j];
            }
        }

        int result = Integer.MIN_VALUE;
        for (int i = 0; i < tempArray.length; ++i) {

            if (result < tempArray[i]) {
                result = tempArray[i];
            }
        }

        System.out.println("Result: " + result);
    }
}
