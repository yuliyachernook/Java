package Models;

import java.util.HashMap;

public class Student {
    private int id;
    private String name;
    private Group group;
    private HashMap<String, Integer> marks;

    public Student(int id, String name, Group group) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.marks = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public HashMap<String, Integer> getMarks() { return marks; }

    public void setNotes(HashMap<String, Integer> marks) {
        this.marks = marks;
    }
}
