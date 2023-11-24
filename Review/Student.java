package Review;

public abstract class Student {
    private String name;
    private int sID;
    private String birthday;
    private double GPA;
    private int intake;

    Student(String _name, int _sID, String _birthday, double _GPA, int _intake){
        name = _name;
        sID = _sID;
        birthday = _birthday;
        GPA = _GPA;
        intake = _intake;
    }

    public void printHello(){
        System.out.println("I am a RMIT student");
    }

    public void printInfo(){
        System.out.printf("name:%s\n", name);
        System.out.printf("sID:%d\n", sID);
        System.out.printf("birthday:%s\n", birthday);
        System.out.printf("GPA:%.2f\n", GPA);
        System.out.printf("intake:%d\n", intake);
    }

    //Setter and setter for name
    public void setName(String _name){
        name = _name;
    }

    public String getName(){
        return name;
    }

    //Setter and setter for sID
    public void setsID(int _sID){
        sID = _sID;
    }

    public int getsID(){
        return sID;
    }

    //Setter and setter for birthday
    public void setBirthday(String _birthday){
        name = _birthday;
    }

    public String getBirthday(){
        return birthday;
    }

    //Setter and setter for GPA
    public void setGPA(int _GPA){
        GPA = _GPA;
    }

    public double getGPA(){
        return GPA;
    }

    //Setter and setter for intake
    public void setIntake(int _intake){
        intake = _intake;
    }

    public int getIntake(){
        return intake;
    }
}
