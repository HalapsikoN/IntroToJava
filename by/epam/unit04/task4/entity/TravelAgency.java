package by.epam.unit04.task4.entity;

import java.util.Arrays;

public class TravelAgency {

    private String name;

    private Voucher[] vouchers;

    public TravelAgency(String name, Voucher[] vouchers) {
        this.name = name;
        this.vouchers = vouchers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Voucher[] getVouchers() {
        return vouchers;
    }

    public void setVouchers(Voucher[] vouchers) {
        this.vouchers = vouchers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelAgency that = (TravelAgency) o;

        if (!name.equals(that.name)) return false;
        return Arrays.equals(vouchers, that.vouchers);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + Arrays.hashCode(vouchers);
        return result;
    }

    @Override
    public String toString() {
        return "TravelAgency{" +
                "name='" + name + '\'' +
                ", vouchers=" + Arrays.toString(vouchers) +
                '}';
    }
}
