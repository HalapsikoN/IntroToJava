package by.epam.unit01.cycles;

public class Task39 {

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
