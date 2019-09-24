package by.epam.Day1.branching;

import by.epam.Day1.scanner.EnterFromConsole;

public class task24 {

    public static void main(String args[]) {

        System.out.println("Enter the number of petal:");
        int numberPetals = EnterFromConsole.EnterInteger();

        System.out.println("Result: " + ((numberPetals % 2 == 0) ? "Doesn't love" : "Loves"));
    }
}
