package by.epam.financer.service;

import by.epam.unit04.task3.entity.Account;

public interface AccountService {
    void addAccount(Account account) throws ServiceException;

    void getAccount(int numberOfAccount) throws ServiceException;

    void updateAccount(Account account) throws ServiceException;

    void deleteAccount(int numberOfAccount) throws ServiceException;

    void deleteAccount(Account account) throws ServiceException;
}
