package by.epam.Day1.cycles;

public class task39 {

    public static void main(String args[]) {

        for (int i = 100; i < 1000; ++i) {

            int temp = i;
            temp %= 100;
            temp *= 7;

            if (temp == i) {

                System.out.println("Result:" + i);
            }
        }

    }
}
