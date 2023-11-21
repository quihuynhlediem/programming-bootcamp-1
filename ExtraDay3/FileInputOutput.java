package ExtraDay3;

// For input
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

// For output
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        FileInputStream fileByteStream = new FileInputStream("ExtraDay3/data.txt");
        Scanner scnr = new Scanner(fileByteStream);
        String output = scnr.nextLine();
        System.out.println(output);

        FileOutputStream oFileByteStream = new FileOutputStream("ExtraDay3/output.txt");
        //StringWriter charByteStream = new StringWriter();
        // Print by call charByteStream.toString();
        PrintWriter outFS = new PrintWriter(oFileByteStream);
        outFS.println("Hello Anh Khoi");
        outFS.close();
    }
}
