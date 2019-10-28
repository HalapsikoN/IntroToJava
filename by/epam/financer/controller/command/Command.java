package by.epam.financer.controller.command;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public interface Command {
    String LOG_PATH = "src/by/epam/financer/log/log";

    //можно ли так во избежание повтора кода?
    default void writeLog(Throwable e){
        try {
            Handler handler = new FileHandler(LOG_PATH);
            Logger logger = Logger.getGlobal();
            logger.addHandler(handler);
            logger.setUseParentHandlers(false);
            logger.log(Level.INFO, e.getMessage(), e);
        } catch (IOException e1) {
        }
    }

    String execute(String request);
}
