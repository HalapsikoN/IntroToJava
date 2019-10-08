package by.epam.unit03.task5;

import by.epam.unit03.scnner.EnterFromConsole;
import by.epam.unit03.task5.entity.Customer;
import by.epam.unit03.task5.entity.Shop;
import by.epam.unit03.task5.logic.ShopLogic;

public class Main {

    public static void main(String[] argv) {

        Customer[] customers = new Customer[6];

        for (int i = 0; i < customers.length; ++i) {
            int id = (int) (Math.random() * 1000);
            String surname = "Ivanov" + ((int) (Math.random() * 10));
            String name = "Ivan" + ((int) (Math.random() * 100));
            String patronymic = "Ivanovich" + ((int) (Math.random() * 100));
            String address = "Ivanovskaya " + ((int) (Math.random() * 100));
            int creditCard = ((int) (Math.random() * 100000));
            int bank = ((int) (Math.random() * 100000));
            customers[i] = new Customer(id, surname, name, patronymic, address, creditCard, bank);
        }

        Shop shop = new Shop(customers);

        System.out.println("List of customers:");
        for (Customer customer : shop.getCustomers()) {
            System.out.println(customer);
        }

        System.out.println("List of customers (sorted):");
        for (Customer customer : ShopLogic.listOfCustomersByAlphabet(shop)) {
            System.out.println(customer);
        }


        System.out.println("Enter the begin to interval:");
        int begin = EnterFromConsole.EnterInteger();
        System.out.println("Enter the end to interval:");
        int end = EnterFromConsole.EnterInteger();
        System.out.println("List of customers who is in [" + begin + "][" + end + "]:");
        if (ShopLogic.listOfCustomersByCreditNumberFromInterval(shop, begin, end) == null) {
            System.out.println("NO such customers");
        } else {
            for (Customer customer : ShopLogic.listOfCustomersByCreditNumberFromInterval(shop, begin, end)) {
                System.out.println(customer);
            }
        }
    }
}
