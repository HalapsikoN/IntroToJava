package by.epam.unit04.task1.entity;

import java.util.HashSet;
import java.util.Set;

public class State {

    private String name;

    private Set<District> districts;

    private City capital;

    public State(String name, Set<District> districts, City capital) {
        this.name = name;
        this.districts = districts;
        this.setCapital(capital);
    }

    public State(String name, District district, City capital) {
        this.name = name;
        this.districts = new HashSet<>();
        this.districts.add(district);
        this.setCapital(capital);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<District> getDistricts() {
        return districts;
    }

    public void setDistricts(Set<District> districts) {
        this.districts = districts;
    }

    public void addDistirct(District district) {
        this.districts.add(district);
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        boolean isCity = false;
        for (District district : districts) {
            if (capital.equals(district.getMainCity())) {
                isCity = true;
            }
        }
        if (!isCity) {
            capital = districts.iterator().next().getMainCity();
        }
        this.capital = capital;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        State state = (State) o;

        if (!name.equals(state.name)) return false;
        if (!districts.equals(state.districts)) return false;
        return capital.equals(state.capital);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + districts.hashCode();
        result = 31 * result + capital.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", districts=" + districts +
                ", capital=" + capital +
                '}';
    }
}
