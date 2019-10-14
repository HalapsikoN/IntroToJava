package by.epam.unit04.task1.entity;

import java.util.Arrays;

public class District {

    private String name;

    private Region[] regions;

    private City mainCity;

    private double area;

    public District(String name, Region[] regions, City mainCity) {
        this.name = name;
        this.regions = regions;

        boolean isCity = false;
        for (Region region : regions) {
            for (City city : region.getCities()) {
                if (city.equals(mainCity)) {
                    isCity = true;
                }
            }
        }
        if (!isCity) {
            mainCity = regions[0].getCities()[0];
        }
        this.mainCity = mainCity;

        double allArea = 0;
        for (Region region : regions) {
            allArea += region.getArea();
        }
        this.area = allArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public City getMainCity() {
        return mainCity;
    }

    public void setMainCity(City mainCity) {
        this.mainCity = mainCity;
    }

    public double getArea() {
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        District district = (District) o;

        if (Double.compare(district.area, area) != 0) return false;
        if (!name.equals(district.name)) return false;
        if (!Arrays.equals(regions, district.regions)) return false;
        return mainCity.equals(district.mainCity);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + Arrays.hashCode(regions);
        result = 31 * result + mainCity.hashCode();
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", regions=" + Arrays.toString(regions) +
                ", mainCity=" + mainCity +
                ", area=" + area +
                "}\n";
    }
}
