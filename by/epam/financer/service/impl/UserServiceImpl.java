package by.epam.financer.service.impl;

import by.epam.financer.bean.User;
import by.epam.financer.dao.DAOException;
import by.epam.financer.dao.DAOFactory;
import by.epam.financer.dao.UserDAO;
import by.epam.financer.service.IncorrectDataException;
import by.epam.financer.service.ServiceException;
import by.epam.financer.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public boolean signIn(String login, String password) throws ServiceException, IncorrectDataException {
        if (login == null || login.isEmpty()) {
            throw new IncorrectDataException("login");
        }
        if (password == null || password.isEmpty()) {
            throw new IncorrectDataException("password");
        }

        DAOFactory daoFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoFactory.getUserDAO();
        User user;
        try {
            user = userDAO.takeUser(login);
            if (user == null) {
                return false;
            }
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

        if (!password.equals(user.getPassword())) {
            return false;
        }

        user.setAuthorized(true);
        try {
            userDAO.resetUser(user);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        return true;
    }

    @Override
    public boolean signOut(String login) throws ServiceException, IncorrectDataException {
        if (login == null || login.isEmpty()) {
            throw new IncorrectDataException("login");
        }

        DAOFactory daoFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoFactory.getUserDAO();
        User user;
        try {
            user = userDAO.takeUser(login);
            if (user == null) {
                return false;
            }
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

        if (!user.isAuthorized()) {
            return false;
        }

        user.setAuthorized(false);
        try {
            userDAO.resetUser(user);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        return true;
    }
}