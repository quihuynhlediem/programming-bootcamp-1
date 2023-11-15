package Day8;

public class Address {
    private int number;
    private String street;
    private Suburb suburb;

    public Address(int _number, String _street, Suburb _suburb){
        number = _number;
        street = _street;
        suburb = _suburb;
    }

    public String getStreetNumber(){
        if (numberCheck()) {
            Integer num = number;
            return num.toString();
        }
        else{
            return "ERROR";
        }
    }

    private boolean numberCheck(){
        if (number < 1){
            return false;
        }
        return true;
    }

    public String getStreetName(){
        if (streetNameCheck()) {
            return street;
        }
        else {
            return "ERROR";
        }
    }

    private boolean streetNameCheck(){
        if (street.length() < 1 || street.length() > 26){
            return false;
        }
        return true;
    }

    private String getSuburb(){
        String suburbPrint = suburb.toString();
        return suburbPrint;
    }

    public String toString(){
        return getStreetNumber() + ":" + getStreetName() + ":" + getSuburb();
    }
}
