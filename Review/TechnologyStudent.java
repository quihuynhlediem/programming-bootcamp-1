package Review;

public class TechnologyStudent extends Student{
    private String technologyMajor;
    TechnologyStudent(String _name, int _sID, String _birthday, double _GPA, int _intake, String _technologyMajor){
        super(_name, _sID, _birthday, _GPA, _intake);
        technologyMajor = _technologyMajor;
    }

    public void printHelloTechnology(){
        System.out.println("I am a RMIT Technology student");
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.printf("major:%s\n\n", technologyMajor);
    }
}
