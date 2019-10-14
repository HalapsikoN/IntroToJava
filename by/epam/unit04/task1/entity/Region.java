package by.epam.unit04.task1.entity;

import java.util.Arrays;

public class Region {

    private String name;

    private City[] cities;

    private double area;

    public Region(String name, City[] cities, double area) {
        this.name = name;
        this.cities = cities;
        this.setArea(area);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        double areaOfCities = 0;
        for (City city : cities) {
            areaOfCities += city.getArea();
        }

        area = (areaOfCities > area) ? areaOfCities : area;

        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Region region = (Region) o;

        if (Double.compare(region.area, area) != 0) return false;
        if (!name.equals(region.name)) return false;
        return Arrays.equals(cities, region.cities);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + Arrays.hashCode(cities);
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", cities=" + Arrays.toString(cities) +
                ", area=" + area +
                "}";
    }
}
