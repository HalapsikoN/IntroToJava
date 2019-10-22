package by.epam.financer.controller;
//pattern "Command"

import by.epam.financer.controller.command.Command;
import by.epam.financer.controller.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandName.SIGN_IN, new SignIn());
        repository.put(CommandName.ADD_ACCOUNT, new AddAccount());
        repository.put(CommandName.DELETE_ACCOUNT, new DeleteAccount());
        repository.put(CommandName.READ_ACCOUNT, new ReadAccount());
        repository.put(CommandName.UPDATE_ACCOUNT, new UpdateAccount());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
    }

    Command getCommand(String name) {
        CommandName commandName = null;
        Command command = null;

        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {
            //log
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
