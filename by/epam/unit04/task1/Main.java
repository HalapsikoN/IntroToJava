package by.epam.unit04.task1;

import by.epam.unit04.task1.entity.City;
import by.epam.unit04.task1.entity.District;
import by.epam.unit04.task1.entity.Region;
import by.epam.unit04.task1.entity.State;
import by.epam.unit04.task1.logic.StateLogic;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String args[]) {

        Set<City> cities1 = new HashSet<>();
        for (int i = 0; i < 2; ++i) {
            String name = "City" + (int) (Math.random() * 100);
            double area = Math.random() * 10;
            cities1.add(new City(name, area));
        }
        Set<City> cities2 = new HashSet<>();
        for (int i = 0; i < 2; ++i) {
            String name = "City" + (int) (Math.random() * 100);
            double area = Math.random() * 10;
            cities2.add(new City(name, area));
        }
        Set<City> cities3 = new HashSet<>();
        for (int i = 0; i < 2; ++i) {
            String name = "City" + (int) (Math.random() * 100);
            double area = Math.random() * 10;
            cities3.add(new City(name, area));
        }
        Set<City> cities4 = new HashSet<>();
        for (int i = 0; i < 2; ++i) {
            String name = "City" + (int) (Math.random() * 100);
            double area = Math.random() * 10;
            cities4.add(new City(name, area));
        }

        Region region1 = new Region("Regi1", cities1, Math.random() * 1000);
        Region region2 = new Region("Regi2", cities2, Math.random() * 1000);
        Region region3 = new Region("Regi3", cities3, Math.random() * 1000);
        Region region4 = new Region("Regi4", cities4, Math.random() * 1000);

        District district1 = new District("Distir1", region1, new City());
        district1.addRegion(region2);
        District district2 = new District("Disti2", region3, new City());
        district2.addRegion(region4);

        State state = new State("Strana", district1, new City());
        state.addDistirct(district2);

        System.out.println(state);

        System.out.println();
        StateLogic stateLogic = new StateLogic();
        System.out.println("Capital: " + state.getCapital());
        System.out.println("Number of districts: " + stateLogic.numberOfDistricts(state));
        System.out.println("Total area: " + stateLogic.getAreaOfState(state));
        System.out.println("District capitals: " + stateLogic.setOfMainCitiesOfDistricts(state));
    }
}
