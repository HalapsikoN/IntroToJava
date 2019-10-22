package by.epam.financer.dao;

import by.epam.unit04.task3.entity.Account;

public interface AccountDAO {
    void addAccount(Account account) throws DAOException;

    void getAccount(int numberOfAccount) throws DAOException;

    void updateAccount(Account account) throws DAOException;

    void deleteAccount(int numberOfAccount) throws DAOException;

    void deleteAccount(Account account) throws DAOException;
}
