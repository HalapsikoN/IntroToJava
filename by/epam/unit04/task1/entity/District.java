package by.epam.unit04.task1.entity;

import java.util.*;

public class District {

    private String name;

    private Set<Region> regions;

    private City mainCity;

    public District(String name, Set<Region> regions, City mainCity) {
        this.name = name;
        this.regions = regions;
        this.setMainCity(mainCity);
    }

    public District(String name, Region region, City mainCity) {
        this.name = name;
        this.regions = new HashSet<>();
        this.regions.add(region);
        this.setMainCity(mainCity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Region> getRegions() {
        return regions;
    }

    public void setRegions(Set<Region> regions) {
        this.regions = regions;
    }

    public void addRegion(Region region) {
        this.regions.add(region);
    }

    public City getMainCity() {
        return mainCity;
    }

    public void setMainCity(City mainCity) {
        boolean isCity = false;
        for (Region region : regions) {
            for (City city : region.getCities()) {
                if (city.equals(mainCity)) {
                    isCity = true;
                }
            }
        }
        if (!isCity) {
            mainCity = regions.iterator().next().getCities().iterator().next();
        }
        this.mainCity = mainCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        District district = (District) o;

        if (!name.equals(district.name)) return false;
        if (!regions.equals(district.regions)) return false;
        return mainCity.equals(district.mainCity);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + regions.hashCode();
        result = 31 * result + mainCity.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", regions=" + regions +
                ", mainCity=" + mainCity +
                '}';
    }
}
