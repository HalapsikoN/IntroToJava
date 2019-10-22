package by.epam.financer.controller.impl;

import by.epam.financer.controller.command.Command;

public class WrongRequest implements Command {

    @Override
    public String execute(String request) {
        return null;
    }
}
