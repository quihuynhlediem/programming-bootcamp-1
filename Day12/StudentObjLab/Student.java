package Day12.StudentObjLab;

// Simple class to hold student information
public class Student {
    private String name;
    private double gpa;

    // FIXME: define two private member fields
    public Student() {
        name  = "Louie";
        gpa = 1.0;
    }

    public void setName(String n) {
        name = n;
    }

    // FIXME: Add three more methods
    public void setGPA(double x) {
        gpa = x;
    }

    public String getName(){
        return name;
    }

    public double getGPA(){
        return gpa;
    }
}
