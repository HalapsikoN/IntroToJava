package by.epam.financer.controller.impl;

import by.epam.financer.controller.command.Command;
import by.epam.financer.service.IncorrectDataException;
import by.epam.financer.service.ServiceException;
import by.epam.financer.service.ServiceFactory;
import by.epam.financer.service.UserService;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SignIn implements Command {

    @Override
    public String execute(String request) {
        String response;
        String[] array = request.split(" ");
        if (array.length < 3) {
            response = "Not enough information in request(Need \"command login password\")...";
            return response;
        }
        String login = array[1];
        String password = array[2];

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();
        try {
            if (!userService.signIn(login, password)) {
                response = "Entered login or password is incorrect.";
            } else {
                response = "Welcome!";
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
            response = "Empty " + e.getMessage() + ".";
        }

        return response;
    }
}
