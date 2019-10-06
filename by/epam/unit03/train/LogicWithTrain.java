package by.epam.unit03.train;

public class LogicWithTrain {

    public static void sortByTrainNumbers(Train[] trains) {
        for (int i = 0; i < trains.length - 1; ++i) {
            for (int j = i + 1; j < trains.length; ++j) {
                if (trains[i].getTrainNumber() > trains[j].getTrainNumber()) {
                    Train temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
        }
    }

    public static Train findByTrainNumber(Train[] trains, int trainNumber) {
        Train result = null;

        for (int i = 0; i < trains.length; ++i) {
            if (trainNumber == trains[i].getTrainNumber()) {
                result = trains[i];
                break;
            }
        }

        return result;
    }

    public static void sortByDestination(Train[] trains) {
        for (int i = 0; i < trains.length - 1; ++i) {
            for (int j = i + 1; j < trains.length; ++j) {
                if (trains[i].getDestination().compareTo(trains[j].getDestination()) > 0) {
                    Train temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
                if (trains[i].getDestination().compareTo(trains[j].getDestination()) == 0) {
                    if (trains[i].getTimeInHours() > trains[j].getTimeInHours()) {
                        Train temp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = temp;
                    }
                }
            }
        }
    }
}

