package by.epam.unit04.task1.entity;

import java.util.Arrays;

public class State {

    private String name;

    private District[] districts;

    private City capital;

    private double area;

    public State(String name, District[] districts, City capital) {
        this.name = name;
        this.districts = districts;

        boolean isCity = false;
        for (District district : districts) {
            if (capital.equals(district.getMainCity())) {
                isCity = true;
            }
        }
        if (!isCity) {
            capital = districts[0].getMainCity();
        }
        this.capital = capital;

        double allArea = 0;
        for (District district : districts) {
            allArea += district.getArea();
        }
        this.area = allArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public double getArea() {
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        State state = (State) o;

        if (Double.compare(state.area, area) != 0) return false;
        if (!name.equals(state.name)) return false;
        if (!Arrays.equals(districts, state.districts)) return false;
        return capital.equals(state.capital);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + Arrays.hashCode(districts);
        result = 31 * result + capital.hashCode();
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", districts=" + Arrays.toString(districts) +
                ", capital=" + capital +
                ", area=" + area +
                '}';
    }
}
