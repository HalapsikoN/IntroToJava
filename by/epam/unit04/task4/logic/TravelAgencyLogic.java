package by.epam.unit04.task4.logic;

import by.epam.unit04.task4.entity.TravelAgency;
import by.epam.unit04.task4.entity.Voucher;
import by.epam.unit04.task4.enums.Food;
import by.epam.unit04.task4.enums.Transport;
import by.epam.unit04.task4.enums.TypeOfTour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TravelAgencyLogic {

    public List<Voucher> listOfVouchersByTypeOfTour(TravelAgency travelAgency, TypeOfTour typeOfTour) {

        List<Voucher> result = new ArrayList<>();
        for (Voucher voucher : travelAgency.getVouchers()) {
            if (voucher.getTypeOfTour() == typeOfTour) {
                result.add(voucher);
            }
        }
        return result;
    }

    public List<Voucher> listOfVouchersByTransport(TravelAgency travelAgency, Transport transport) {

        List<Voucher> result = new ArrayList<>();
        for (Voucher voucher : travelAgency.getVouchers()) {
            if (voucher.getTransport() == transport) {
                result.add(voucher);
            }
        }
        return result;
    }

    public List<Voucher> listOfVouchersByFood(TravelAgency travelAgency, Food food) {

        List<Voucher> result = new ArrayList<>();
        for (Voucher voucher : travelAgency.getVouchers()) {
            if (voucher.getFood() == food) {
                result.add(voucher);
            }
        }
        return result;
    }

    public List<Voucher> listOfVouchersByNumberOfDays(TravelAgency travelAgency, int numberOfDays) {
        List<Voucher> result = new ArrayList<>();
        for (Voucher voucher : travelAgency.getVouchers()) {
            if (voucher.getNumberOfDays() == numberOfDays) {
                result.add(voucher);
            }
        }
        return result;
    }

    public void sortVoucherByDays(TravelAgency travelAgency) {
        Collections.sort(travelAgency.getVouchers());
    }
}
