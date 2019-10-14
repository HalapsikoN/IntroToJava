package by.epam.unit04.task4;

import by.epam.unit04.task4.entity.TravelAgency;
import by.epam.unit04.task4.entity.Voucher;
import by.epam.unit04.task4.enums.Food;
import by.epam.unit04.task4.enums.Transport;
import by.epam.unit04.task4.enums.TypeOfTour;
import by.epam.unit04.task4.logic.TravelAgencyLogic;

public class Main {

    public static void main(String args[]) {

        Voucher[] vouchers = new Voucher[4];
        vouchers[0] = new Voucher(TypeOfTour.EXCURSION, Transport.BUS, Food.FULL_BOARD, 5);
        vouchers[1] = new Voucher(TypeOfTour.RECREATION, Transport.AIRPLANE, Food.BED_AND_BREAKFAST, 10);
        vouchers[2] = new Voucher(TypeOfTour.SHOPPING, Transport.CAR, Food.ALL_INCLUSIVE, 3);
        vouchers[3] = new Voucher(TypeOfTour.TREATMENT, Transport.SHIP, Food.ROOM_ONLY, 21);

        TravelAgency travelAgency = new TravelAgency("Best tour", vouchers);

        System.out.println(travelAgency);

        System.out.println();
        System.out.println("Choose shopping voucher: " + TravelAgencyLogic.giveVoucherByTypeOfTour(travelAgency, TypeOfTour.SHOPPING));
        System.out.println("Choose 21 day voucher: " + TravelAgencyLogic.giveVoucherByNumberOfDays(travelAgency, 21));
        System.out.println("Choose 1(from list of vouchers) voucher: " + TravelAgencyLogic.giveVoucherByNumber(travelAgency, 1));

        System.out.println("Sorted by days vouchers:");
        TravelAgencyLogic.sortVoucherByDays(travelAgency);
        System.out.println(travelAgency);
    }
}
