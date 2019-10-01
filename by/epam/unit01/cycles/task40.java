package by.epam.unit01.cycles;

import by.epam.unit01.scanner.EnterFromConsole;

public class task40 {

    public static void main(String args[]) {

        System.out.println("Enter N:");
        int N = EnterFromConsole.EnterInteger();

        System.out.println();
        for (int i = 1; i <= N; ++i) {

            boolean mistake = false;
            int temp = i;
            while (temp > 0) {

                int lastNumber = temp % 10;
                temp /= 10;
                if (lastNumber == 0 || i % lastNumber != 0)
                    mistake = true;
            }
            if (mistake) {
                continue;
            }
            System.out.print(i + " ");
        }
        return;
    }
}
