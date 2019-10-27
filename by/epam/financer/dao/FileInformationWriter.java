package by.epam.financer.dao;

import java.io.*;
import java.util.List;

public class FileInformationWriter implements Closeable {

    private BufferedWriter fileWriter;

    public FileInformationWriter(File file) throws IOException {
        fileWriter = new BufferedWriter(new FileWriter(file));
    }

    public void write(List<String> list) throws IOException {
        for (String string : list) {
            fileWriter.write(string);
            fileWriter.newLine();
        }
        fileWriter.flush();
    }

    public void close() throws IOException {
        fileWriter.close();
    }
}
