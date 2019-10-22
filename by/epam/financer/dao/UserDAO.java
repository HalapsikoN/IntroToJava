package by.epam.financer.dao;

public interface UserDAO {
    void signIn(String login, String password) throws DAOException;
}
