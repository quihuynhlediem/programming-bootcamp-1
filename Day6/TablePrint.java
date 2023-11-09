package Day6;

public class TablePrint {
    public static void main(String[] args){
        int [][]table = new int[12][12];
        for (int i = 0; i < 12; ++i){
            for (int j = 0; j < 12; j++){
                table[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 12; ++i){
            for (int j = 0; j < i + 1; j++){
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 12; ++i){
            for (int j = 0; j < (12 - i); j++){
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        //Reverse table
        for (int i = 0; i < 12; ++i){
            for (int j = 0; j < 6; j++){
                int temp = table[i][j];
                table[i][j] = table[i][12 - j - 1];
                table[i][12 - j - 1] = temp;
            }
        }

        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < (12 - i); j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
    }
}
