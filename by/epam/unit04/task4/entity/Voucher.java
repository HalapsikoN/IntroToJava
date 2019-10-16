package by.epam.unit04.task4.entity;

import by.epam.unit04.task4.enums.Food;
import by.epam.unit04.task4.enums.Transport;
import by.epam.unit04.task4.enums.TypeOfTour;

public class Voucher implements Comparable<Voucher> {

    private TypeOfTour typeOfTour;

    private Transport transport;

    private Food food;

    private int numberOfDays;

    public Voucher(TypeOfTour typeOfTour, Transport transport, Food food, int numberOfDays) {
        this.typeOfTour = typeOfTour;
        this.transport = transport;
        this.food = food;
        this.numberOfDays = numberOfDays;
    }

    public Voucher() {
        this(TypeOfTour.NO_TOUR, Transport.NO_TRANSPORT, Food.NO_FOOD, 0);
    }

    public TypeOfTour getTypeOfTour() {
        return typeOfTour;
    }

    public void setTypeOfTour(TypeOfTour typeOfTour) {
        this.typeOfTour = typeOfTour;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Voucher voucher = (Voucher) o;

        if (numberOfDays != voucher.numberOfDays) return false;
        if (typeOfTour != voucher.typeOfTour) return false;
        if (transport != voucher.transport) return false;
        return food == voucher.food;
    }

    @Override
    public int hashCode() {
        int result = typeOfTour.hashCode();
        result = 31 * result + transport.hashCode();
        result = 31 * result + food.hashCode();
        result = 31 * result + numberOfDays;
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "typeOfTour=" + typeOfTour +
                ", transport=" + transport +
                ", food=" + food +
                ", numberOfDays=" + numberOfDays +
                "}\n";
    }

    @Override
    public int compareTo(Voucher o) {
        return this.numberOfDays - o.numberOfDays;
    }
}
