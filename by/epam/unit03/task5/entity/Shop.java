package by.epam.unit03.task5.entity;

import by.epam.unit03.task5.entity.Customer;

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
}
