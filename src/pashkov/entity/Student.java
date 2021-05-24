package pashkov.entity;

import java.time.LocalDate;

public class Student extends User {

    private static class Parent extends User{

        public Parent(int id, String name, String surname, String middleName, LocalDate birthDate) {
            super(id, name, surname, middleName, birthDate);
        }
    }

    private int courseNumber;
    private char courseIdentifier;

    public Student(int id, String name, String surname, String middleName,
                   LocalDate birthDate, int courseNumber, char courseIdentifier) {
        super(id, name, surname, middleName, birthDate);
        this.courseNumber = courseNumber;
        this.courseIdentifier = courseIdentifier;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public char getCourseIdentifier() {
        return courseIdentifier;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseIdentifier(char courseIdentifier) {
        this.courseIdentifier = courseIdentifier;
    }
}
