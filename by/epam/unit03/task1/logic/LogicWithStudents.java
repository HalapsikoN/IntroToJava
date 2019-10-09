package by.epam.unit03.task1.logic;

import by.epam.unit03.task1.entity.Student;

public class LogicWithStudents {

    public static boolean isGoodStudent(Student student) {
        boolean result = true;
        for (int i = 0; i < student.getMarks().length; ++i) {
            if (student.getMarks()[i] < 9) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static Student[] chooseGoodStudents(Student[] students) {
        Student[] result;
        int numberOfGoodStudents = 0;

        for (int i = 0; i < students.length; ++i) {
            if (isGoodStudent(students[i])) {
                numberOfGoodStudents++;
            }
        }

        result = new Student[numberOfGoodStudents];
        for (int i = 0; i < students.length; ++i) {
            int j = 0;
            if (isGoodStudent(students[i])) {
                result[j++] = students[i];
            }
        }

        return result;
    }
}
