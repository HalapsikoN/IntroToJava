package by.epam.financer.service;

public interface UserService {
    void signIn(String login, String password) throws ServiceException;
}
