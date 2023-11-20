package Day10;

import java.util.ArrayList;

public class StringArrListSwap {
    public static void StringSwap(ArrayList<String> inputArr, int a, int b){
        String temp = inputArr.get(a);
        inputArr.set(a, inputArr.get(b));
        inputArr.set(b, temp);
    }
    public static void main(String[] args){
        ArrayList<String> strArr = new ArrayList<String>();
        strArr.add("My");
        strArr.add("name");
        strArr.add("is");
        strArr.add("Qui");

        StringSwap(strArr, 0, 2);

        for (int i = 0; i < strArr.size(); i++) {
            System.out.print(strArr.get(i) + " ");
        }
    }
}
