package by.epam.unit03.task5.entity;

import by.epam.unit03.task5.entity.Customer;

import java.util.Arrays;

public class Shop {

    private Customer[] customers;

    public Shop(Customer[] customers) {
        this.customers = customers;
    }

    public Shop(int numberOfCustomers) {

        customers = new Customer[numberOfCustomers];
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Arrays.equals(customers, shop.customers);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(customers);
    }
}
