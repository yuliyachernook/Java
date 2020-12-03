import Exceptions.*;
import Models.Faculty;
import Models.Group;
import Models.Student;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Faculty informationTechnologiesFaculty = new Faculty( 1, "Faculty of Information Technologies");
        Faculty economicEngineeringFaculty = new Faculty( 2, "Economic Engineering Models.Faculty");

        Group secondGroup = new Group( 2, informationTechnologiesFaculty);
        Group sixthGroup = new Group( 6, informationTechnologiesFaculty);
        Group seventhGroup = new Group( 7, economicEngineeringFaculty);

        Student vikaGramovich = new Student(1, "Vika Gramovich", secondGroup);
        Student alinaRadionova = new Student(2, "Alina Radionova", seventhGroup);
        Student serezhaPiskun = new Student(3, "Sergey Piskun", sixthGroup);

        Faculty[] faculties = new Faculty[]{informationTechnologiesFaculty, economicEngineeringFaculty};
        Group[] groups = new Group[]{secondGroup, sixthGroup, seventhGroup};
        Student[] students = new Student[]{vikaGramovich, alinaRadionova, serezhaPiskun};

        students[0].getMarks().put("Maths", 9);
        students[0].getMarks().put("Physics", 8);
        students[0].getMarks().put("English", 9);
        students[1].getMarks().put("Economics", 7);
        students[1].getMarks().put("Maths", 6);
        students[2].getMarks().put("Programming", 9);
        students[2].getMarks().put("Maths", 9);

        //1
        double averageMark = 0;
        int countOfMarks = 0;
        int studentId = 1;
;
        for (Student currentStudent: students) {
            if(currentStudent.getId() == studentId){
                for (HashMap.Entry<String, Integer> entry : currentStudent.getMarks().entrySet()) {
                    averageMark += entry.getValue();
                    countOfMarks++;
                }
                averageMark = averageMark / countOfMarks;

                System.out.println("The average grade of student with id " + studentId + "is " + averageMark);
            }
        }

        if(faculties.length == 0)
            try {
                throw new NoFacultiesException("University has no faculties");
            } catch (NoFacultiesException e) {
                System.out.println(e.getMessage());
                return;
            }

        for(int i = 0; i < students.length; i++){
            if(students[i].getMarks().entrySet().size() == 0)
                try {
                    throw new NoDisciplinesException("Student has no disciplines");
                } catch (NoDisciplinesException e) {
                    System.out.println(e.getMessage());
                    return;
                }
        }

        //2
        averageMark = 0;
        countOfMarks = 0;
        Group group = secondGroup;
        Faculty faculty = informationTechnologiesFaculty;
        try {
            for (int i = 0; i < groups.length; i++) {
                if (groups[i].getFaculty() == faculty)
                    break;
                if (i == groups.length - 1)
                    throw new NoGroupsException("Faculty has no groups");
            }
            for (int i = 0; i < students.length; i++) {
                if (students[i].getGroup() == group)
                    break;
                if (i == students.length - 1)
                    throw new NoStudentsException("Group has no students");
            }
            for (int i = 0; i < students.length; i++) {
                if (students[i].getGroup().getId() == group.getId() && group.getFaculty() == faculty) {
                    if (students[i].getMarks().get("Maths") < 0 || students[i].getMarks().get("Maths") > 10)
                        throw new IncorrectMarkValueException("Incorrect mark value", students[i].getMarks().get("Maths"));
                    averageMark += students[i].getMarks().get("Maths");
                    countOfMarks++;
                }
            }
        } catch (IncorrectMarkValueException e) {
            System.out.println(e.getMessage());
        } catch (NoStudentsException e){
            System.out.println(e.getMessage());
        } catch (NoGroupsException e) {
            System.out.println(e.getMessage());
        }

        averageMark = averageMark/ countOfMarks;

        System.out.println("The average grade of students of " + group.getId() + " group of " +
                faculty.getName() + " is " + averageMark);

        averageMark = 0;
        countOfMarks = 0;

        try {
            for (int i = 0; i < students.length; i++) {
                if (students[i].getMarks().get("Maths") != null) {
                    if (students[i].getMarks().get("Maths") < 0 || students[i].getMarks().get("Maths") > 10)
                        throw new IncorrectMarkValueException("Incorrect grade", students[i].getMarks().get("Maths"));
                    averageMark += students[i].getMarks().get("Maths");
                    countOfMarks++;
                }
            }
            averageMark = averageMark / countOfMarks;
        } catch (IncorrectMarkValueException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Maths average mark: " + averageMark);
    }
}
