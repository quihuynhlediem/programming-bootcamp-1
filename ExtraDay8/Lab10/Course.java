package ExtraDay8.Lab10;

import java.util.ArrayList;

public class Course {

    private ArrayList<Student> roster; //collection of Student objects

    public Course() {
        roster = new ArrayList<Student>();
    }

    public void dropStudent(String last) {
        /* Type your code here */
        for (int i = 0; i < roster.size(); ++i) {
            if (roster.get(i).getLast().equals(last)){
                roster.remove(roster.get(i));
            }
        }
    }

    public void addStudent(Student s) {
        roster.add(s);
    }

    public int countStudents() {
        return roster.size();
    }
}
// Giau studentList ben trong class Course