package by.epam.financer.service.impl;

import by.epam.financer.bean.Account;
import by.epam.financer.bean.User;
import by.epam.financer.dao.AccountDAO;
import by.epam.financer.dao.DAOException;
import by.epam.financer.dao.DAOFactory;
import by.epam.financer.dao.UserDAO;
import by.epam.financer.service.AccountService;
import by.epam.financer.service.IncorrectDataException;
import by.epam.financer.service.ServiceException;

public class AccountServiceImpl implements AccountService {

    private boolean checkUser(String userLogin) throws ServiceException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoFactory.getUserDAO();
        User user;
        try {
            user = userDAO.takeUser(userLogin);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        if (user == null || !user.isAuthorized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean addAccount(String userLogin, Account account) throws ServiceException, IncorrectDataException {
        if (account == null) {
            throw new ServiceException("no account");
        }
        if (account.getNumberOfAccount() < 0) {
            throw new IncorrectDataException("Number of account can not be negative");
        }
        if (!checkUser(userLogin)) {
            throw new IncorrectDataException("User is not authorized");
        }

        DAOFactory daoFactory = DAOFactory.getInstance();
        AccountDAO accountDAO = daoFactory.getAccountDAO();
        try {
            if (accountDAO.getAccount(account.getNumberOfAccount()) != null) {
                return false;
            }
            return accountDAO.addAccount(account);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public Account getAccount(String userLogin, int numberOfAccount) throws ServiceException, IncorrectDataException {
        if (numberOfAccount < 0) {
            throw new IncorrectDataException("number of account can not be negative");
        }
        if (!checkUser(userLogin)) {
            throw new IncorrectDataException("user is not authorized");
        }

        DAOFactory daoFactory = DAOFactory.getInstance();
        AccountDAO accountDAO = daoFactory.getAccountDAO();
        try {
            Account account = accountDAO.getAccount(numberOfAccount);
            return account;
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

    }

    @Override
    public boolean updateAccount(String userLogin, Account account) throws ServiceException, IncorrectDataException {
        if (account == null) {
            throw new IncorrectDataException("no account");
        }
        if (account.getNumberOfAccount() < 0) {
            throw new IncorrectDataException("number of account can not be negative");
        }
        if (!checkUser(userLogin)) {
            throw new IncorrectDataException("user is not authorized");
        }

        DAOFactory daoFactory = DAOFactory.getInstance();
        AccountDAO accountDAO = daoFactory.getAccountDAO();
        try {
            return accountDAO.updateAccount(account);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public boolean deleteAccount(String userLogin, int numberOfAccount) throws ServiceException, IncorrectDataException {
        if (numberOfAccount < 0) {
            throw new IncorrectDataException("number of account can not be negative");
        }
        if (!checkUser(userLogin)) {
            throw new IncorrectDataException("user is not authorized");
        }

        DAOFactory daoFactory = DAOFactory.getInstance();
        AccountDAO accountDAO = daoFactory.getAccountDAO();
        try {
            return accountDAO.deleteAccount(numberOfAccount);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
