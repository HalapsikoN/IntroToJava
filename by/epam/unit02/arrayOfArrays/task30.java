package by.epam.unit02.arrayOfArrays;

import by.epam.unit02.arrayLogic.ArrayWithConsole;

import java.util.Random;

public class task30 {

    public static void main(String argv[]) {

        int[][] array = new int[10][20];

        Random random = new Random();
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {

                array[i][j] = random.nextInt(16);
            }
        }

        ArrayWithConsole.printArray(array);

        System.out.println();
        System.out.println("Result:");
        for (int i = 0; i < array.length; ++i) {
            int counter = 0;
            for (int j = 0; j < array[i].length; ++j) {

                if (array[i][j] == 5) {
                    counter++;
                }
            }
            if (counter >= 3) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
