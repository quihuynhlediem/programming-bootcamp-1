package Day8;

public class Calculator {
    private double value;
    public Calculator(){
        value = 0.0;
    }

    public void add(double val){
        value += val;
    }

    public void subtract(double val){
        value -= val;
    }

    public void multiply(double val){
        value *= 3;
    }

    public void divide(double val){
        value /= 2;
    }

    public void clear(){
        value = 0.0;
    }

    public double getValue( ){
        return value;
    }
}
