package Review;

public class FinanceStudent extends Student {
    private String financeMajor;
    FinanceStudent(String _name, int _sID, String _birthday, double _GPA, int _intake, String _financeMajor){
        super(_name, _sID, _birthday, _GPA, _intake);
        financeMajor = _financeMajor;
    }

    public void printHelloFinance(){
        System.out.println("I am a RMIT Finance student");
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.printf("major:%s\n\n", financeMajor);
    }
}
