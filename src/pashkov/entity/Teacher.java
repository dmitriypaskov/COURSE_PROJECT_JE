package pashkov.entity;

import java.time.LocalDate;

public class Teacher extends User {

    private TeachingSubject teachingSubject;
    private Timetable timetable;

    public Teacher(Integer id, String name, String surname, String middleName, LocalDate birthDate,
                   TeachingSubject teachingSubject, Timetable timetable) {
        super(id, name, surname, middleName, birthDate);
        this.teachingSubject = teachingSubject;
        this.timetable = timetable;
    }

    public TeachingSubject getTeachingSubject() {
        return teachingSubject;
    }

    public Timetable getTimetable() {
        return timetable;
    }

    public void setTeachingSubject(TeachingSubject teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }

}
