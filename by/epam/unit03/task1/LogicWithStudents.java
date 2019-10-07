package by.epam.unit03.task1;

public class LogicWithStudents {

    public static Student[] chooseGoodStudents(Student[] students) {
        Student[] result;
        int numberOfGoodStudents = 0;

        for (int i = 0; i < students.length; ++i) {
            if (students[i].isGoodStudent()) {
                numberOfGoodStudents++;
            }
        }

        if (numberOfGoodStudents == 0) {
            return null;
        }

        result = new Student[numberOfGoodStudents];
        for (int i = 0; i < students.length; ++i) {
            int j = 0;
            if (students[i].isGoodStudent()) {
                result[j++] = students[i];
            }
        }

        return result;
    }
}
