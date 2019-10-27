package by.epam.financer.dao;

import by.epam.financer.bean.Account;

public interface AccountDAO {
    boolean addAccount(Account account) throws DAOException;

    Account getAccount(int numberOfAccount) throws DAOException;

    boolean updateAccount(Account account) throws DAOException;

    boolean deleteAccount(int numberOfAccount) throws DAOException;
}
