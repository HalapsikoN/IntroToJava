package by.epam.unit03.task2;

import by.epam.unit03.scnner.EnterFromConsole;
import by.epam.unit03.task2.entity.Train;
import by.epam.unit03.task2.logic.LogicWithTrain;

public class Main {

    public static void main(String[] argv) {
        Train[] trains = new Train[5];

        for (int i = 0; i < trains.length; ++i) {
            String destination = "PLACE TO MOVE" + ((int) (Math.random() * 100));
            int trainNumber = (int) (Math.random() * 100);
            double timeInHours = Math.random() * 24;
            trains[i] = new Train(destination, trainNumber, timeInHours);
        }

        System.out.println("Trains:");
        for (Train train : trains) {
            System.out.println(train);
        }

        LogicWithTrain.sortByTrainNumbers(trains);

        System.out.println("Trains:");
        for (Train train : trains) {
            System.out.println(train);
        }

        System.out.println("Enter the train to find:");
        int findTrain = EnterFromConsole.EnterInteger();
        Train temp = LogicWithTrain.findByTrainNumber(trains, findTrain);
        System.out.print("Result: ");
        if (temp == null) {
            System.out.println("NO such train");
        } else {
            System.out.println(temp);
        }

        LogicWithTrain.sortByDestination(trains);

        System.out.println("Trains:");
        for (Train train : trains) {
            System.out.println(train);
        }
    }
}
