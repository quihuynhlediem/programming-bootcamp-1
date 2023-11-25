package RMITAssessment2.Task2;

public class SortedTheatreShowCollection {
    /** DECLARE YOUR ATTRIBUTES HERE */
    private TheatreShow [] theatreShow;

    /** CONSTRUCTOR */
    public SortedTheatreShowCollection() {
        /**
         * IMPLEMENT YOUR CODE HERE
         */

    }

    public static void ascendingSelectionSort(TheatreShow[] array) {
        int i;
        int j;
        int indexSmallest;
        TheatreShow temp;      // Temporary variable for swap

        for (i = 0; i < array.length - 1; ++i) {

            // Find index of smallest remaining element
            indexSmallest = i;
            for (j = i + 1; j <array.length; ++j) {

                if (array[j].getRunningTime() < array[indexSmallest].getRunningTime()) {
                    indexSmallest = j;
                }
            }

            // Swap numbers[i] and numbers[indexSmallest]
            temp = array[i];
            array[i] = array[indexSmallest];
            array[indexSmallest] = temp;
        }
    }

    public static void descendingSelectionSort(TheatreShow[] array) {
        int i;
        int j;
        int indexLargest;
        TheatreShow temp;      // Temporary variable for swap

        for (i = 0; i < array.length - 1; ++i) {

            // Find index of smallest remaining element
            indexLargest = i;
            for (j = i + 1; j < array.length; ++j) {

                if (array[j].getRunningTime() > array[indexLargest].getRunningTime()) {
                    indexLargest = j;
                }
            }

            // Swap numbers[i] and numbers[indexSmallest]
            temp = array[i];
            array[i] = array[indexLargest];
            array[indexLargest] = temp;
        }
    }


    public TheatreShow[] sortByRunningTime(TheatreShow[] array, Order sortOrder) {
        TheatreShow [] outputArray = new TheatreShow[array.length];
        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = array[i];
        }
        if (sortOrder == Order.ASCENDING){
            ascendingSelectionSort(outputArray);
        }

        if (sortOrder == Order.DESCENDING){
            descendingSelectionSort(outputArray);
        }
        return outputArray;
    }


}
