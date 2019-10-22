package by.epam.financer.dao;
//pattern "Factory"

import by.epam.financer.dao.impl.FileAccountDAO;
import by.epam.financer.dao.impl.FileUserDAO;

public class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();

    private final AccountDAO fileAccountImpl = new FileAccountDAO();
    private final UserDAO fileUserImpl = new FileUserDAO();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public AccountDAO getAccountDAO() {
        return fileAccountImpl;
    }

    public UserDAO getUserDAO() {
        return fileUserImpl;
    }

}
