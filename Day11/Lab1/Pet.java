package Day11.Lab1;

public abstract class Pet {

    private String name;
    private int age;

    private final String type;


    Pet(String type, String name, int age){
        //Write the initialization code.
        this.type = type;
        this.name = name;
        this.age = age;
    }


    public final void printInfo() {
        System.out.println("Pet Details: ");
        if (name.equals(null) || name.length() < 2){
            System.out.println("   Name: ERROR");
        }
        else {
            System.out.println("   Name: " + name);
        }
        if (age >= 100 || age < 0){
            System.out.println("   Age: -1");
        }
        else {
            System.out.println("   Age: " + age);
        }
        System.out.println("   Animal: " + this.type );
    }

}
