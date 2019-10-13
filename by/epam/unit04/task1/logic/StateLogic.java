package by.epam.unit04.task1.logic;

import by.epam.unit04.task1.entity.City;
import by.epam.unit04.task1.entity.District;
import by.epam.unit04.task1.entity.State;

public class StateLogic {

    public static int numberOfDistricts(State state) {
        return state.getDistricts().length;
    }

    public static City[] arrayOfMainCitiesOfDistricts(State state) {
        City[] cities = new City[numberOfDistricts(state)];
        int i = 0;
        for (District district : state.getDistricts()) {
            cities[i++] = district.getMainCity();
        }
        return cities;
    }
}
