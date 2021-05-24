package pashkov.entity;

public class Lesson {
    private Integer id;
    private TeachingSubject teachingSubject;
    private Teacher teacher;

    public Lesson(Integer id, TeachingSubject teachingSubject, Teacher teacher) {
        this.id = id;
        this.teachingSubject = teachingSubject;
        this.teacher = teacher;
    }

    public Lesson() {
    }

    public Integer getId() {
        return id;
    }

    public TeachingSubject getTeachingSubject() {
        return teachingSubject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTeachingSubject(TeachingSubject teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
