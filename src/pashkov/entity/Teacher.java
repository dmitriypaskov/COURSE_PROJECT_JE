package pashkov.entity;

import java.time.LocalDate;

public class Teacher extends User{

    private TeachingSubject teachingSubject;
    private Timetable timetable;
    private TeachingProgram teachingProgram;

    public Teacher(int id, String name, String surname, String middleName, LocalDate birthDate,
                   TeachingSubject teachingSubject, Timetable timetable, TeachingProgram teachingProgram) {
        super(id, name, surname, middleName, birthDate);
        this.teachingSubject = teachingSubject;
        this.timetable = timetable;
        this.teachingProgram = teachingProgram;
    }

    public TeachingSubject getTeachingSubject() {
        return teachingSubject;
    }

    public Timetable getTimetable() {
        return timetable;
    }

    public TeachingProgram getTeachingProgram() {
        return teachingProgram;
    }

    public void setTeachingSubject(TeachingSubject teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }

    public void setTeachingProgram(TeachingProgram teachingProgram) {
        this.teachingProgram = teachingProgram;
    }
}
