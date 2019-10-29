package by.epam.financer.dao.impl;

import by.epam.financer.bean.User;
import by.epam.financer.dao.DAOException;
import by.epam.financer.dao.FileInformationReader;
import by.epam.financer.dao.FileInformationWriter;
import by.epam.financer.dao.UserDAO;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileUserDAO implements UserDAO {

    private String FILE_PATH = "src/by/epam/financer/resource/userAccount.txt";

    @Override
    public User takeUser(String login) throws DAOException {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            throw new DAOException("NoSuchFileException");
        }

        List<String> list;
        try (FileInformationReader reader = new FileInformationReader(file)){
            list = reader.getAllLinesWithString(User.class.getDeclaredFields()[0].getName());
        } catch (IOException e) {
            throw new DAOException("DAO_takeUser", e);
        }finally {

        }

        Gson gson = new Gson();
        for (String string : list) {
            User user = gson.fromJson(string, User.class);
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void resetUser(User user) throws DAOException {
        File file = new File(FILE_PATH);

        if (!file.exists()) {
            throw new DAOException("NoSuchFileException");
        }

        List<String> list;
        String oldUserInformation;
        try (FileInformationReader reader = new FileInformationReader(file)){
            list = reader.readAllFile();
        } catch (IOException e) {
            throw new DAOException("DAO_signIn", e);
        }
        try (FileInformationReader reader = new FileInformationReader(file)){
            oldUserInformation = reader.getAllLinesWithString(user.getLogin()).get(0);
        } catch (IOException e) {
            throw new DAOException("DAO_signIn", e);
        }


        Gson gson = new Gson();
        String newUserInformation = gson.toJson(user);

        list.set(list.indexOf(oldUserInformation), newUserInformation);

        try (FileInformationWriter writer = new FileInformationWriter(file)){
            writer.write(list);
        } catch (IOException e) {
            throw new DAOException("DAO_signIn", e);
        }
    }

}
