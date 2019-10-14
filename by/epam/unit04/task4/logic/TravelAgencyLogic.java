package by.epam.unit04.task4.logic;

import by.epam.unit04.task4.entity.TravelAgency;
import by.epam.unit04.task4.entity.Voucher;
import by.epam.unit04.task4.enums.TypeOfTour;

public class TravelAgencyLogic {

    public static Voucher giveVoucherByTypeOfTour(TravelAgency travelAgency, TypeOfTour typeOfTour) {

        Voucher searchVoucher = new Voucher();
        Voucher[] vouchers = travelAgency.getVouchers();
        for (Voucher voucher : vouchers) {
            if (voucher.getTypeOfTour() == typeOfTour) {
                searchVoucher = voucher;
                break;
            }
        }
        return searchVoucher;
    }

    public static Voucher giveVoucherByNumberOfDays(TravelAgency travelAgency, int numberOfDays) {
        Voucher searchVoucher = new Voucher();
        Voucher[] vouchers = travelAgency.getVouchers();
        for (Voucher voucher : vouchers) {
            if (voucher.getNumberOfDays() == numberOfDays) {
                searchVoucher = voucher;
                break;
            }
        }
        return searchVoucher;
    }

    public static Voucher giveVoucherByNumber(TravelAgency travelAgency, int number) {
        Voucher[] vouchers = travelAgency.getVouchers();
        return (vouchers.length >= number && number >= 0) ? vouchers[number] : new Voucher();
    }

    public static void sortVoucherByDays(TravelAgency travelAgency) {
        Voucher[] vouchers = travelAgency.getVouchers();
        for (int i = 0; i < vouchers.length - 1; ++i) {
            for (int j = i + 1; j < vouchers.length; ++j) {
                if (vouchers[i].getNumberOfDays() > vouchers[j].getNumberOfDays()) {
                    Voucher temp = vouchers[i];
                    vouchers[i] = vouchers[j];
                    vouchers[j] = temp;
                }
            }
        }
    }
}
