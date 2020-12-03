package Models;

import Models.Faculty;

public class Group {
    private int id;
    private Faculty faculty;

    public Group(int id, Faculty faculty) {
        this.id = id;
        this.faculty = faculty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
