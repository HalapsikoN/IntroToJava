package by.epam.unit03.task1.entity;

//вынести проверку isGoodStudent из Student в StudentLogic

public class Student {

    private String surname;

    private String initials;

    private int groupNumber;

    private int[] marks;

    public Student(String surname, String initials, int groupNumber, int[] marks) {
        this.surname = surname;
        this.initials = initials;
        this.setGroupNumber(groupNumber);
        this.setMarks(marks);
    }

    public Student() {
        this("no_surname", "no_initials", 0, new int[]{0, 0, 0, 0, 0});
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber < 0) {
            groupNumber *= -1;
        }
        this.groupNumber = groupNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        for (int i = 0; i < marks.length; ++i) {
            if (marks[i] < 0) {
                marks[i] = 0;
            }
            if (marks[i] > 10) {
                marks[i] = 10;
            }
        }
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
