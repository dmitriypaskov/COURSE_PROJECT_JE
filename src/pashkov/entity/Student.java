package pashkov.entity;

import java.time.LocalDate;

public class Student extends User {

    private static class Parent extends User {

        public Parent(Integer id, String name, String surname, String middleName, LocalDate birthDate) {
            super(id, name, surname, middleName, birthDate);
        }
    }

    private Integer courseNumber;
    private char courseIdentifier;

    public Student(Integer id, String name, String surname, String middleName,
                   LocalDate birthDate, Integer courseNumber, Character courseIdentifier) {
        super(id, name, surname, middleName, birthDate);
        this.courseNumber = courseNumber;
        this.courseIdentifier = courseIdentifier;
    }

    public Integer getCourseNumber() {
        return courseNumber;
    }

    public Character getCourseIdentifier() {
        return courseIdentifier;
    }

    public void setCourseNumber(Integer courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseIdentifier(Character courseIdentifier) {
        this.courseIdentifier = courseIdentifier;
    }
}
