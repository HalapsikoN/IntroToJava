package by.epam.unit02.array;

import by.epam.unit02.arrayLogic.ArrayWithConsole;
import by.epam.unit02.scanner.EnterFromConsole;

public class task15 {

    public static void main(String args[]) {

        double[] array = ArrayWithConsole.EnterArrayFromConsoleDouble();

        System.out.println("Enter c");
        double c = EnterFromConsole.EnterDouble();
        System.out.println("Enter d");
        double d = EnterFromConsole.EnterDouble();
        if (c > d) {
            double temp = d;
            d = c;
            c = temp;
        }

        ArrayWithConsole.printArray(array);
        int numberOfSegment = 0;
        for (int i = 0; i < array.length; ++i) {

            if (array[i] >= c && array[i] <= d) {
                numberOfSegment++;
            }
        }

        if (numberOfSegment == 0) {

            System.out.println("No elements");
            return;
        }

        double[] resultArray = new double[numberOfSegment];

        int j = 0;
        for (int i = 0; i < array.length; ++i) {

            if (array[i] >= c && array[i] <= d) {
                resultArray[j++] = array[i];
            }
        }

        System.out.println("Result:");
        ArrayWithConsole.printArray(resultArray);
    }
}
