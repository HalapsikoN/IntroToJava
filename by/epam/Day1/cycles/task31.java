package by.epam.Day1.cycles;

import by.epam.Day1.scanner.EnterFromConsole;

import java.util.Random;

public class task31 {

    private final static int arrMAXnumbers = 5;

    private static boolean isInArray(int number, int[] array) {

        boolean result = false;
        for (int i = 0; i < arrMAXnumbers; ++i) {

            if (array[i] == number) {

                result = true;
            }
        }
        return result;
    }

    public static void main(String args[]) {

        int max = 15;

        Random random = new Random();
        int[] arrComp = new int[arrMAXnumbers];
        for (int i = 0; i < arrMAXnumbers; ++i) {

            while (true) {

                int j, temp = random.nextInt(max) + 1;
                for (j = 0; j < i; ++j) {

                    if (arrComp[j] == temp) {
                        break;
                    }
                }
                if (i != j) {
                    continue;
                }
                arrComp[i] = temp;
                break;
            }
        }

        int[] arrHum = new int[arrMAXnumbers];
        for (int i = 0; i < arrMAXnumbers; ++i) {

            int n = 0;
            while (n < 1 || n > 15) {

                System.out.println("Enter n:");
                n = EnterFromConsole.EnterInteger();
            }

            arrHum[i] = n;

            if (isInArray(n, arrComp)) {
                System.out.println("There is such number");
            } else {
                System.out.println("There is NO such number");
            }
        }

        System.out.println("The computer's numbers:");
        for (int i = 0; i < arrMAXnumbers; ++i) {

            System.out.print(" " + arrComp[i] + " ");
        }
        System.out.println();
        System.out.println("The hooooman's numbers:");
        for (int i = 0; i < arrMAXnumbers; ++i) {

            System.out.print(" " + arrHum[i] + " ");
        }
    }
}
