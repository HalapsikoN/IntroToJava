package by.epam.financer.controller.impl;

import by.epam.financer.bean.Account;
import by.epam.financer.controller.command.Command;
import by.epam.financer.service.AccountService;
import by.epam.financer.service.IncorrectDataException;
import by.epam.financer.service.ServiceException;
import by.epam.financer.service.ServiceFactory;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetAccount implements Command {

    @Override
    public String execute(String request) {
        String response;
        String[] array = request.split(" ");
        if (array.length < 3) {
            response = "Not enough information in request(Need \"command login numberOfAccount\")...";
            return response;
        }
        String login = array[1];
        String numberOfAccountString = array[2];

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        AccountService accountService = serviceFactory.getAccountService();
        try {
            int numberOfAccount = Integer.valueOf(numberOfAccountString);
            Account account = accountService.getAccount(login, numberOfAccount);
            if (account != null) {
                response = "Account (" + account.getNumberOfAccount() + ") with the amount (" + account.getAmount()
                        + ") now is " + (account.isBlocked() ? "blocked." : "active.");
            } else {
                response = "There is no such account.";
            }
        } catch (ServiceException e) {
            try {
                Handler handler = new FileHandler(LOG_PATH);
                Logger logger = Logger.getGlobal();
                logger.addHandler(handler);
                logger.setUseParentHandlers(false);
                logger.log(Level.INFO, e.getMessage(), e);
            } catch (IOException e1) {
            }
            response = "Something wrong...";
        } catch (IncorrectDataException e) {
            response = e.getMessage() + ".";
        } catch (NumberFormatException e) {
            response = "Not valid number of account or amount...";
        }
        return response;
    }
}
