package by.epam.unit03.task4;

import by.epam.unit03.scnner.EnterFromConsole;

public class main {

    public static void main(String[] argv) {

        System.out.println("Enter hour:");
        int hour = EnterFromConsole.EnterInteger();
        System.out.println("Enter minute:");
        int minute = EnterFromConsole.EnterInteger();
        System.out.println("Enter second:");
        int second = EnterFromConsole.EnterInteger();

        Clock clock = new Clock(hour, minute, second);

        System.out.println();
        System.out.println(clock);
        System.out.println();

        System.out.println("Change seconds: ");
        second = EnterFromConsole.EnterInteger();
        second = (second < 0) ? second * -1 : second;
        clock.changeSecond(second);
        System.out.println(clock);

        System.out.println("Change minute:");
        minute = EnterFromConsole.EnterInteger();
        minute = (minute < 0) ? minute * -1 : minute;
        clock.changeMinute(minute);
        System.out.println(clock);

        System.out.println("Change hour:");
        hour = EnterFromConsole.EnterInteger();
        hour = (hour < 0) ? hour * -1 : hour;
        clock.changeHour(hour);
        System.out.println(clock);
    }
}
