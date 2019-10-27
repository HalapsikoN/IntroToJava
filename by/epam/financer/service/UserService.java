package by.epam.financer.service;

public interface UserService {
    boolean signIn(String login, String password) throws ServiceException, IncorrectDataException;

    boolean signOut(String login) throws ServiceException, IncorrectDataException;
}
