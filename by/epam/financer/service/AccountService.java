package by.epam.financer.service;

import by.epam.financer.bean.Account;


public interface AccountService {
    boolean addAccount(String userLogin, Account account) throws ServiceException, IncorrectDataException;

    Account getAccount(String userLogin, int numberOfAccount) throws ServiceException, IncorrectDataException;

    boolean updateAccount(String userLogin, Account account) throws ServiceException, IncorrectDataException;

    boolean deleteAccount(String userLogin, int numberOfAccount) throws ServiceException, IncorrectDataException;
}
