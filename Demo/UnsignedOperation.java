package Demo;

public class UnsignedOperation {
    public static void main(String[] args){
        var unsigned = Integer.parseUnsignedInt("3000"); //Why parameter is string?
        System.out.println("Unsigned value: " + unsigned);
        var result = Integer.divideUnsigned(unsigned, -2); //result = 0
        //var result = unsigned / -2; //result = -1500 Why???
        System.out.println("Result: " + result);
    }
}
