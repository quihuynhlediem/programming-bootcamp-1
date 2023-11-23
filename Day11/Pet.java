package Day11;

public /*abstract*/ class Pet {

    private String name;
    private int age;

    private final String type = "";

    Pet(String type, String name, int age){
        //Write the initialization code.
        this.name = name;
        this.age = age;
    }


    public final void printInfo() {
        System.out.println("Pet Details: ");
        System.out.println("   Name: " + name);
        System.out.println("   Age: " + age);
        System.out.println("   Animal: " + this.type );
    }

}

