package by.epam.financer.controller.impl;

import by.epam.financer.controller.command.Command;
import by.epam.financer.service.AccountService;
import by.epam.financer.service.IncorrectDataException;
import by.epam.financer.service.ServiceException;
import by.epam.financer.service.ServiceFactory;

public class DeleteAccount implements Command {

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

            if (accountService.deleteAccount(login, numberOfAccount)) {
                response = "Successfully deleted! (" + numberOfAccount + ")";
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
