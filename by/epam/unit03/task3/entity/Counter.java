package by.epam.unit03.task3.entity;

public class Counter {

    private int number;

    private int max;

    private int min;

    public Counter(int number, int min, int max) {
        if (max < min) {
            int temp = max;
            max = min;
            min = temp;
        }
        this.min = min;
        this.max = max;
        this.setNumber(number);
    }

    public Counter() {
        this(0, 0, 100);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number < min) {
            number = min;
        }
        if (number > max) {
            number = max;
        }
        this.number = number;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public void increment() {
        if (++number > max) {
            number = min;
        }
    }

    public void decrement() {
        if (--number < min) {
            number = max;
        }
    }

    @Override
    public String toString() {
        return "{" +
                "State is " + number +
                '}';
    }
}
