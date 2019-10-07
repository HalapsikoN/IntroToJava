package by.epam.unit03.task4;

public class Clock {

    private int second;

    private int minute;

    private int hour;

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            second = 0;
        }
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            minute = 0;
        }
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            hour = 0;
        }
        this.hour = hour;
    }

    public Clock(int hour, int minute, int second) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    public Clock() {
        this(0, 0, 0);
    }

    public void changeHour(int add) {
        hour = (hour + add) % 24;
    }

    public void changeMinute(int add) {
        changeHour((minute + add) / 60);
        minute = (minute + add) % 60;
    }

    public void changeSecond(int add) {
        changeMinute((second + add) / 60);
        changeHour((second + add) / 3600);
        second = (second + add) % 60;
    }

    @Override
    public String toString() {
        return "Clock{" +
                +hour + ":"
                + minute + ":" +
                +second +
                '}';
    }
}
