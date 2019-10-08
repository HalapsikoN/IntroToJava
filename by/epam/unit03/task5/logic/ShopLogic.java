package by.epam.unit03.task5.logic;

import by.epam.unit03.task5.entity.Customer;
import by.epam.unit03.task5.entity.Shop;

public class ShopLogic {

    public static Customer[] listOfCustomersByAlphabet(Shop shop) {
        Customer[] customers = shop.getCustomers();

        for (int i = 0; i < customers.length - 1; ++i) {
            for (int j = i + 1; j < customers.length; ++j) {
                if (customers[i].getSurname().compareTo(customers[j].getSurname()) > 0) {
                    Customer temp = customers[i];
                    customers[i] = customers[j];
                    customers[j] = temp;
                }
                if (customers[i].getSurname().compareTo(customers[j].getSurname()) == 0) {
                    if (customers[i].getName().compareTo(customers[j].getName()) > 0) {
                        Customer temp = customers[i];
                        customers[i] = customers[j];
                        customers[j] = temp;
                    }
                }
                if (customers[i].getSurname().compareTo(customers[j].getSurname()) == 0) {
                    if (customers[i].getName().compareTo(customers[j].getName()) == 0) {
                        if (customers[i].getPatronymic().compareTo(customers[j].getPatronymic()) > 0) {
                            Customer temp = customers[i];
                            customers[i] = customers[j];
                            customers[j] = temp;
                        }
                    }
                }
            }
        }

        return customers;
    }

    public static Customer[] listOfCustomersByCreditNumberFromInterval(Shop shop, int begin, int end) {
        Customer[] customers = shop.getCustomers();

        if (end < begin) {
            int temp = begin;
            begin = end;
            end = temp;
        }

        int numberOfSuchPeople = 0;
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber() > begin && customer.getCreditCardNumber() < end) {
                numberOfSuchPeople++;
            }
        }

        if (numberOfSuchPeople == 0) {
            return null;
        }

        Customer[] result = new Customer[numberOfSuchPeople];

        int j = 0;
        for (int i = 0; i < customers.length; ++i) {
            if (customers[i].getCreditCardNumber() > begin && customers[i].getCreditCardNumber() < end) {
                result[j++] = customers[i];
            }
        }

        return result;
    }
}
