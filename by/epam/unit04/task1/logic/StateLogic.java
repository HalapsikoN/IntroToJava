package by.epam.unit04.task1.logic;

import by.epam.unit04.task1.entity.City;
import by.epam.unit04.task1.entity.District;
import by.epam.unit04.task1.entity.Region;
import by.epam.unit04.task1.entity.State;

import java.util.HashSet;
import java.util.Set;

public class StateLogic {

    public int numberOfDistricts(State state) {
        return state.getDistricts().size();
    }

    public double getAreaOfState(State state) {
        double result = 0;
        for (District district : state.getDistricts()) {
            for (Region region : district.getRegions()) {
                result += region.getArea();
            }
        }
        return result;
    }

    public Set<City> setOfMainCitiesOfDistricts(State state) {
        Set<City> result = new HashSet<>();
        for (District district : state.getDistricts()) {
            result.add(district.getMainCity());
        }
        return result;
    }

}
