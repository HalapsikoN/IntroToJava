package by.epam.financer.controller.impl;

import by.epam.financer.controller.command.Command;
import by.epam.financer.service.ServiceException;
import by.epam.financer.service.ServiceFactory;
import by.epam.financer.service.UserService;

public class SignIn implements Command {

    @Override
    public String execute(String request) {
        //распарсить реквест
        String login=null;
        String password=null;
        String response=null;

        ServiceFactory serviceFactory=ServiceFactory.getInstance();
        UserService userService=serviceFactory.getUserService();

        try {
            userService.signIn(login, password);
            response="Welcome!";
        } catch (ServiceException e) {
            //разобраться как хорошо написать log
            response="Something wrong...";
        }

        return response;
    }
}
