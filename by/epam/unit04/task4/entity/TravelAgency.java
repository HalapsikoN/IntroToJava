package by.epam.unit04.task4.entity;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency {

    private String name;

    private List<Voucher> vouchers;

    public TravelAgency(String name, List<Voucher> vouchers) {
        this.name = name;
        this.vouchers = vouchers;
    }

    public TravelAgency(String name, Voucher voucher) {
        this.name = name;
        this.vouchers = new ArrayList<>();
        this.vouchers.add(voucher);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Voucher> getVouchers() {
        return vouchers;
    }

    public void setVouchers(List<Voucher> vouchers) {
        this.vouchers = vouchers;
    }

    public void addVoucher(Voucher voucher) {
        this.vouchers.add(voucher);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelAgency that = (TravelAgency) o;

        if (!name.equals(that.name)) return false;
        return vouchers.equals(that.vouchers);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + vouchers.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "TravelAgency{" +
                "name='" + name + '\'' +
                ", vouchers=" + vouchers +
                '}';
    }
}
