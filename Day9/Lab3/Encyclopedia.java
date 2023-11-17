package Day9.Lab3;

public class Encyclopedia extends Book {
    // TODO: Declare private fields
    private String edition;
    private int numPages;


    // TODO: Define mutator methods -
    //       setEdition(), setNumPages()
    public void setEdition(String edition){
        this.edition = edition;
    }

    public void setNumPages(int numPages){
        this.numPages = numPages;
    }

    // TODO: Define accessor methods -
    //       getEdition(), getNumPages()
    public String getEdition(){
        return edition;
    }

    public int getNumPages(){
        return numPages;
    }

    // TODO: Define a printInfo() method that overrides
    //       the printInfo in Book class
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("   Edition: " + edition);
        System.out.println("   Number of Pages: " + numPages);
    }
}
