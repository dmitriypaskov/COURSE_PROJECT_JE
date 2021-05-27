package pashkov.entity;

import java.util.ArrayList;
import java.util.List;

public class Timetable extends Lesson {

    private final List<Lesson> lessons = new ArrayList<>();

    public List<Lesson> getLessons() {
        return lessons;
    }
}
