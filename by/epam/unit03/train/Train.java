package by.epam.unit03.train;

public class Train {

    private String destination;

    private int trainNumber;

    private double timeInHours;

    public Train(String destination, int trainNumber, double timeInHours) {
        this.destination = destination;
        this.setTimeInHours(timeInHours);
        this.setTrainNumber(trainNumber);
    }

    public Train() {
        this("Hogvarts", 322, 10);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        if (trainNumber < 0) {
            trainNumber *= -1;
        }
        this.trainNumber = trainNumber;
    }

    public double getTimeInHours() {
        return timeInHours;
    }

    public void setTimeInHours(double timeInHours) {
        if (timeInHours < 0) {
            timeInHours = 0;
        }
        if (timeInHours > 24) {
            timeInHours = 24;
        }
        this.timeInHours = timeInHours;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", timeInHours=" + timeInHours +
                '}';
    }
}
