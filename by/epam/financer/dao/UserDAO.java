package by.epam.financer.dao;

import by.epam.financer.bean.User;

public interface UserDAO {
    User takeUser(String login) throws DAOException;

    void resetUser(User user) throws DAOException;
}
