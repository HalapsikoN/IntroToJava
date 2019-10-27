package by.epam.financer;

import by.epam.financer.controller.Controller;

import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {

        Controller controller = new Controller();
        System.out.println(controller.executeTask("SIGN_IN Kirill Mifodiy"));
        System.out.println(controller.executeTask("ADD_ACCOUNT Kirill 300 310 no"));
        System.out.println(controller.executeTask("GET_ACCOUNT Kirill 555"));
        System.out.println(controller.executeTask("UPDATE_ACCOUNT Kirill 679 888 no"));
        System.out.println(controller.executeTask("DELETE_ACCOUNT Kirill 200"));
        System.out.println(controller.executeTask("check WRONG_REQUEST"));
        System.out.println(controller.executeTask("SIGN_OUT Kirill"));
    }
}
