package Day5;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class ChangeFileName {
    public static void main(String[] args) throws IOException{
        Scanner scnr = new Scanner(System.in);
        String fileName = scnr.nextLine();
        FileInputStream fileByteStream = new FileInputStream("./Day5/" + fileName);
        Scanner inSS = new Scanner(fileByteStream);

        while (inSS.hasNextLine()){
            String file = inSS.nextLine();
            file = file.replace("_photo.jpg", "_info.txt");
            System.out.println(file);
        }
    }
}
