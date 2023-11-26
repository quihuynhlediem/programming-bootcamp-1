package Demo;

public class demo {
    public static void main(String[] args){
        String doubleValue = "139.59";
        Double doubleObj = Double.parseDouble(doubleValue);

        var intValue = doubleObj.intValue();
        var floatValue = doubleObj.floatValue();
        var stringValue = doubleObj.toString();
    }
}
