package by.epam.financer.controller.impl;

import by.epam.financer.bean.Account;
import by.epam.financer.controller.command.Command;
import by.epam.financer.service.AccountService;
import by.epam.financer.service.IncorrectDataException;
import by.epam.financer.service.ServiceException;
import by.epam.financer.service.ServiceFactory;

public class UpdateAccount implements Command {

    @Override
    public String execute(String request) {
        String response;
        String[] array = request.split(" ");
        if (array.length < 5) {
            response = "Not enough information in request(Need \"command login numberOfAccount amount isItBlocked\")...";
            return response;
        }
        String login = array[1];
        String numberOfAccountString = array[2];
        String amountString = array[3];
        String isItBlockedString = array[4];

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        AccountService accountService = serviceFactory.getAccountService();
        try {
            int numberOfAccount = Integer.valueOf(numberOfAccountString);
            double amount = Double.valueOf(amountString);
            isItBlockedString = isItBlockedString.toLowerCase();
            boolean isBocked = (isItBlockedString.equals("yes") || isItBlockedString.equals("true"));
            Account account = new Account(numberOfAccount, amount, isBocked);

            if (accountService.updateAccount(login, account)) {
                response = "Successfully updated! (" + numberOfAccount + ")";
            } else {
                response = "There is no account with such number.";
            }
        } catch (ServiceException e) {
            writeLog(e);
            response = "Something wrong...";
        } catch (IncorrectDataException e) {
            response = e.getMessage() + ".";
        } catch (NumberFormatException e) {
            response = "Not valid number of account or amount...";
        }
        return response;
    }
}
