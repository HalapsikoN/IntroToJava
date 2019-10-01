package by.epam.unit02.array;

import by.epam.unit02.scanner.EnterFromConsole;

public class task13 {

    public static void main(String args[]) {

        int L = 0, M = 0, N = 0;
        while (L <= 0) {

            System.out.print("Enter the L: ");
            L = EnterFromConsole.EnterInteger();
        }
        while (M <= 0) {

            System.out.print("Enter the M: ");
            M = EnterFromConsole.EnterInteger();
        }
        while (N <= 0) {

            System.out.print("Enter the N: ");
            N = EnterFromConsole.EnterInteger();
        }

        if (N < L) {

            int temp = L;
            L = N;
            N = temp;
        }

        int result = 0;
        for (int i = L; i <= N; ++i) {

            if (i % M == 0) {
                result++;
            }
        }

        System.out.println("Result: " + result);
    }
}
