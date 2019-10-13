package by.epam.unit04.task1;

import by.epam.unit04.task1.entity.City;
import by.epam.unit04.task1.entity.District;
import by.epam.unit04.task1.entity.Region;
import by.epam.unit04.task1.entity.State;
import by.epam.unit04.task1.logic.StateLogic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String args[]){

        City[][][] citiesGroup=new City[2][2][2];
        for(int i=0; i<citiesGroup.length; ++i){
            for (int j=0; j<citiesGroup[i].length;++j) {
                for(int k=0; k<citiesGroup[i][j].length;++k) {
                    String name = "City" + (int) (Math.random() * 100);
                    double area = Math.random() * 10;
                    citiesGroup[i][j][k] = new City(name, area);
                }
            }
        }

        Region[][] regions=new Region[2][2];
        for(int i=0; i<regions.length; ++i){
            for (int j=0; j<regions[i].length; ++j){
                String name = "Region" + (int) (Math.random() * 100);
                double area = Math.random() * 100;
                regions[i][j]=new Region(name, citiesGroup[i][j], area);
            }
        }

        District[] districts=new District[2];
        for(int i=0; i<districts.length;++i){
            String name = "District" + (int) (Math.random() * 100);
            String nameCity = "City" + (int) (Math.random() * 100);
            double area = Math.random() * 10;
            City city=new City(nameCity, area);
            districts[i]=new District(name, regions[i], city);
        }

        String name = "State" + (int) (Math.random() * 100);
        String nameCity = "City" + (int) (Math.random() * 100);
        double area = Math.random() * 10;
        City city=new City(nameCity, area);
        State state=new State(name, districts, city);

        System.out.println(state);
        System.out.println();

        System.out.println("Capital: "+ state.getCapital());
        System.out.println("Number of districts: "+ StateLogic.numberOfDistricts(state));
        System.out.println("Total area: "+state.getArea());
        System.out.println("District capitals: "+ Arrays.toString(StateLogic.arrayOfMainCitiesOfDistricts(state)));
    }
}
