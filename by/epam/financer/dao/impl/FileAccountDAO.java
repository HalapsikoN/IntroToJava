package by.epam.financer.dao.impl;

import by.epam.financer.bean.Account;
import by.epam.financer.dao.AccountDAO;
import by.epam.financer.dao.DAOException;
import by.epam.financer.dao.FileInformationReader;
import by.epam.financer.dao.FileInformationWriter;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileAccountDAO implements AccountDAO {

    private String FILE_PATH = "src/by/epam/financer/resource/userAccount.txt";

    @Override
    public boolean addAccount(Account account) throws DAOException {

        File file = new File(FILE_PATH);
        if (!file.exists()) {
            throw new DAOException("NoSuchFileException");
        }

        List<String> list;
        try {
            FileInformationReader reader = new FileInformationReader(file);
            list = reader.readAllFile();
            reader.close();
        } catch (IOException e) {
            throw new DAOException("DAO_addAccount", e);
        }

        Gson gson = new Gson();
        String newAccount = gson.toJson(account);
        list.add(newAccount);

        try {
            FileInformationWriter writer = new FileInformationWriter(file);
            writer.write(list);
            writer.close();
        } catch (IOException e) {
            throw new DAOException("DAO_addAccount", e);
        }
        return true;
    }

    @Override
    public Account getAccount(int numberOfAccount) throws DAOException {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            throw new DAOException("NoSuchFileException");
        }

        List<String> list;
        try {
            FileInformationReader reader = new FileInformationReader(file);
            list = reader.getAllLinesWithString(Account.class.getDeclaredFields()[0].getName());
            reader.close();
        } catch (IOException e) {
            throw new DAOException("DAO_getAccount", e);
        }

        Gson gson = new Gson();
        for (String string : list) {
            Account account = gson.fromJson(string, Account.class);
            if (account.getNumberOfAccount() == numberOfAccount) {
                return account;
            }
        }
        return null;
    }

    @Override
    public boolean updateAccount(Account account) throws DAOException {
        File file = new File(FILE_PATH);
        Account oldAccount = getAccount(account.getNumberOfAccount());
        if (oldAccount == null) {
            return false;
        }

        List<String> list;
        try {
            FileInformationReader reader = new FileInformationReader(file);
            list = reader.readAllFile();
            reader.close();
        } catch (IOException e) {
            throw new DAOException("DAO_updateAccount", e);
        }

        Gson gson = new Gson();
        String oldAccountInformation = gson.toJson(oldAccount);
        String newInformationAccount = gson.toJson(account);
        list.set(list.indexOf(oldAccountInformation), newInformationAccount);

        try {
            FileInformationWriter writer = new FileInformationWriter(file);
            writer.write(list);
            writer.close();
        } catch (IOException e) {
            throw new DAOException("DAO_updateAccount", e);
        }
        return true;
    }

    @Override
    public boolean deleteAccount(int numberOfAccount) throws DAOException {
        File file = new File(FILE_PATH);
        Account oldAccount = getAccount(numberOfAccount);
        if (oldAccount == null) {
            return false;
        }

        List<String> list;
        try {
            FileInformationReader reader = new FileInformationReader(file);
            list = reader.readAllFile();
            reader.close();
        } catch (IOException e) {
            throw new DAOException("DAO_deleteAccount", e);
        }

        Gson gson = new Gson();
        String oldAccountInformation = gson.toJson(oldAccount);
        list.remove(oldAccountInformation);

        try {
            FileInformationWriter writer = new FileInformationWriter(file);
            writer.write(list);
            writer.close();
        } catch (IOException e) {
            throw new DAOException("DAO_deleteAccount", e);
        }
        return true;
    }
}
