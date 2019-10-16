package by.epam.unit04.task1.logic;

import by.epam.unit04.task1.entity.District;
import by.epam.unit04.task1.entity.Region;

public class DistrictLogic {

    public double getAreaOfDistrict(District district) {
        double result = 0;
        for (Region region : district.getRegions()) {
            result += region.getArea();
        }
        return result;
    }
}
