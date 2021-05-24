package pashkov.entity;

public class Group {

    private Integer id;
    private Curator curator;
    private Student student;
    private Integer courseNumber;
    private Character courseIndex;
    private Timetable timetable;

    public Group(Integer id, Curator curator, Student student, Integer courseNumber, Character courseIndex, Timetable timetable) {
        this.id = id;
        this.curator = curator;
        this.student = student;
        this.courseNumber = courseNumber;
        this.courseIndex = courseIndex;
        this.timetable = timetable;
    }

    public Integer getId() {
        return id;
    }

    public Curator getCurator() {
        return curator;
    }

    public Student getStudent() {
        return student;
    }

    public Integer getCourseNumber() {
        return courseNumber;
    }

    public Character getCourseIndex() {
        return courseIndex;
    }

    public Timetable getTimetable() {
        return timetable;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCurator(Curator curator) {
        this.curator = curator;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourseNumber(Integer courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseIndex(Character courseIndex) {
        this.courseIndex = courseIndex;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }
}
