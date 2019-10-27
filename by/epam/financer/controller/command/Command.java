package by.epam.financer.controller.command;

public interface Command {
    String LOG_PATH = "src/by/epam/financer/log/log";

    //можно ли тут определить функцию для логгирования во избежание повтора кода?

    String execute(String request);
}
