package pashkov.entity;

import java.util.ArrayList;
import java.util.List;

public class Timetable extends Lesson {

    private final List<Lesson> lessons = new ArrayList<>();

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    public List<Lesson> getLessons() {
        return lessons;
    }
}
