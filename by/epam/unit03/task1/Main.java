package by.epam.unit03.task1;

import by.epam.unit03.task1.entity.Student;
import by.epam.unit03.task1.logic.LogicWithStudents;

public class Main {

    public static void main(String[] argv) {

        Student[] students = new Student[10];

        for (int i = 0; i < students.length; ++i) {
            String surname = "Ivanov" + i;
            String initials = "I.K." + i;
            int groupNumber = (int) (Math.random() * 100);
            int[] marks = new int[5];
            for (int j = 0; j < marks.length; ++j) {
                marks[j] = (int) (Math.random() * 10);
            }
            students[i] = new Student(surname, initials, groupNumber, marks);
        }

        int[] marks = new int[5];
        for (int j = 0; j < marks.length; ++j) {
            marks[j] = 10;
        }
        students[5].setMarks(marks);

        Student[] goodStudents = LogicWithStudents.chooseGoodStudents(students);

        System.out.println("Good students:");
        if (goodStudents == null) {
            System.out.println("NO.");
        } else {
            for (Student student : goodStudents) {
                System.out.println(student);
            }
        }
    }
}
