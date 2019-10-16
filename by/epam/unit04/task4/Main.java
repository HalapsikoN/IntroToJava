package by.epam.unit04.task4;

import by.epam.unit04.task4.entity.TravelAgency;
import by.epam.unit04.task4.entity.Voucher;
import by.epam.unit04.task4.enums.Food;
import by.epam.unit04.task4.enums.Transport;
import by.epam.unit04.task4.enums.TypeOfTour;
import by.epam.unit04.task4.logic.TravelAgencyLogic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        List<Voucher> vouchers = new ArrayList<>();
        vouchers.add(new Voucher(TypeOfTour.EXCURSION, Transport.BUS, Food.FULL_BOARD, 5));
        vouchers.add(new Voucher(TypeOfTour.RECREATION, Transport.AIRPLANE, Food.BED_AND_BREAKFAST, 10));
        vouchers.add(new Voucher(TypeOfTour.SHOPPING, Transport.CAR, Food.ALL_INCLUSIVE, 3));
        vouchers.add(new Voucher(TypeOfTour.SHOPPING, Transport.AIRPLANE, Food.FULL_BOARD, 12));
        vouchers.add(new Voucher(TypeOfTour.SHOPPING, Transport.SHIP, Food.NO_FOOD, 22));
        vouchers.add(new Voucher(TypeOfTour.TREATMENT, Transport.SHIP, Food.ROOM_ONLY, 21));

        TravelAgency travelAgency = new TravelAgency("Best tour", vouchers);

        System.out.println(travelAgency);

        TravelAgencyLogic travelAgencyLogic = new TravelAgencyLogic();
        System.out.println();
        System.out.println("Choose shopping voucher: " + travelAgencyLogic.listOfVouchersByTypeOfTour(travelAgency, TypeOfTour.SHOPPING));
        System.out.println("Choose 21 day voucher: " + travelAgencyLogic.listOfVouchersByNumberOfDays(travelAgency, 21));
        System.out.println("Choose full board food voucher: " + travelAgencyLogic.listOfVouchersByFood(travelAgency, Food.FULL_BOARD));
        System.out.println("Choose ship voucher: " + travelAgencyLogic.listOfVouchersByTransport(travelAgency, Transport.SHIP));

        System.out.println("Sorted by days vouchers:");
        travelAgencyLogic.sortVoucherByDays(travelAgency);
        System.out.println(travelAgency);
    }
}
