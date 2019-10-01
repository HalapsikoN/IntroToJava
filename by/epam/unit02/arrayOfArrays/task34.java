package by.epam.unit02.arrayOfArrays;

import by.epam.unit02.arrayLogic.ArrayWithConsole;
import by.epam.unit02.scanner.EnterFromConsole;

import java.util.Random;

public class task34 {

    public static void main(String argv[]) {

        int numberLines = 0;
        while (numberLines <= 0) {

            System.out.print("Enter number of lines:");
            numberLines = EnterFromConsole.EnterInteger();
        }
        int numberColumns = 0;
        while (numberColumns <= 0) {

            System.out.print("Enter number of columns:");
            numberColumns = EnterFromConsole.EnterInteger();
        }

        int[][] array = new int[numberLines][numberColumns];

        Random random = new Random();
        for (int i = 0; i < array[0].length; ++i) {

            int numberOfOne = i;
            while (numberOfOne > 0) {

                int place = random.nextInt(array.length);
                if (array[place][i] == 0) {
                    array[place][i] = 1;
                    numberOfOne--;
                } else {
                    int j;
                    for (j = 0; j < array.length; j++) {
                        if (array[j][i] == 0) {
                            break;
                        }
                    }
                    if (j == array.length) {
                        break;
                    }
                }
            }
        }

        ArrayWithConsole.printArray(array);
    }
}
