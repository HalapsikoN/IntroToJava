package by.epam.financer.service;

import by.epam.financer.service.impl.AccountServiceImpl;
import by.epam.financer.service.impl.UserServiceImpl;

public class ServiceFactory {

    private static ServiceFactory instance = new ServiceFactory();

    private AccountService accountServiceImpl = new AccountServiceImpl();
    private UserService userServiceImpl = new UserServiceImpl();

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public AccountService getAccountService() {
        return accountServiceImpl;
    }

    public UserService getUserService() {
        return userServiceImpl;
    }
}
