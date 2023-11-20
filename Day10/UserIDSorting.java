package Day10;

import java.util.Scanner;
import java.util.ArrayList;

public class UserIDSorting {
    // TODO: Write the partitioning algorithm - pick the middle element as the
    //       pivot, compare the values using two index variables l and h (low and high),
    //       initialized to the left and right sides of the current elements being sorted,
    //       and determine if a swap is necessary

    //Swap function for Strings in ArrayList
    public static void StringSwap(ArrayList<String> inputArr, int a, int b){
        String temp = inputArr.get(a);
        inputArr.set(a, inputArr.get(b));
        inputArr.set(b, temp);
    }

    public static int partition(ArrayList<String> userIDs, int i, int k) {
        int mid = (i + k) / 2;
        String pivot = userIDs.get(mid);
        int l = i;
        int h = k;
        String lStr = userIDs.get(l);
        String hStr = userIDs.get(h);
        boolean done = false;
        while (!done) {
            while (lStr.compareTo(pivot) < 0) {
                ++l;
                lStr = userIDs.get(l);
            }
            while (hStr.compareTo(pivot) > 0) {
                --h;
                hStr = userIDs.get(h);
            }
            if (l >= h){
                done = true;
            } else {
                StringSwap(userIDs, l, h);
                --h;
                ++l;
                lStr = userIDs.get(l);
                hStr = userIDs.get(h);
            }
        }
        return h;
    }

    // TODO: Write the quicksort algorithm that recursively sorts the low and
    //       high partitions
    public static void quicksort(ArrayList<String> userIDs, int i, int k) {
        int pivotIndex;
        if (i >= k){
            return;
        }

        pivotIndex = partition(userIDs, i, k);
        quicksort(userIDs, i, pivotIndex);
        quicksort(userIDs, pivotIndex + 1, k);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        ArrayList<String> userIDList = new ArrayList<String>();

        String userID;

        userID = scnr.next();
        while (!userID.equals("-1")) {
            userIDList.add(userID);
            userID = scnr.next();
        }

        // Initial call to quicksort
        quicksort(userIDList, 0, userIDList.size() - 1);
        //System.out.println(partition(userIDList, 0, userIDList.size() - 1));

        for (int i = 0; i < userIDList.size(); ++i) {
            System.out.println(userIDList.get(i));
        }
    }
}
