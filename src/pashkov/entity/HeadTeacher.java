package pashkov.entity;

import java.time.LocalDate;

public class HeadTeacher extends Teacher{

    public HeadTeacher(int id, String name, String surname, String middleName, LocalDate birthDate,
                       TeachingSubject teachingSubject, Timetable timetable, TeachingProgram teachingProgram) {
        super(id, name, surname, middleName, birthDate, teachingSubject, timetable, teachingProgram);
    }
}
