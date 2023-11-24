package Review;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

//Library for counting txt files
import java.io.File;

import java.util.ArrayList;


public class StudentInfo {
    public static Student readStudent(Scanner scanner){
        String input;
        input = scanner.nextLine();
        String name = input.substring(input.indexOf(":") + 1).toUpperCase();
        input = scanner.nextLine();
        int sID = Integer.parseInt(input.substring(input.indexOf(":") + 1));
        input = scanner.nextLine();
        String major = input.substring(input.indexOf(":") + 1);
        input = scanner.nextLine();
        String birthday = input.substring(input.indexOf(":") + 1);
        input = scanner.nextLine();
        double GPA = Double.parseDouble(input.substring(input.indexOf(":") + 1));
        input = scanner.nextLine();
        int intake = Integer.parseInt(input.substring(input.indexOf(":") + 1));

        Student student;
        if (major.equals("IT (technology)")){
            student = new TechnologyStudent(name, sID, birthday, GPA, intake, major);
        }
        else {
            student = new FinanceStudent(name, sID, birthday, GPA, intake, major);
        }

        return student;
    }

    public static int countFilesInDirectory(File directory){
        int filesCount = 0;
        for (File file: directory.listFiles()) {
            if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")){
                ++filesCount;
            }
        }
        return filesCount;
    }

    public static void printInfoList(ArrayList<Student> studentArrayList){
        for (int i = 0; i < studentArrayList.size(); i++) {
            studentArrayList.get(i).printInfo();
        }
    }

    public static void selectionSort(ArrayList<Student> studentArrayList){
        for (int i = 0; i < studentArrayList.size() - 1; ++i) {
            // Find index of smallest remaining element
            int indexSmallest = i;
            for (int j = i + 1; j < studentArrayList.size(); ++j) {

                if (studentArrayList.get(j).getGPA() < studentArrayList.get(indexSmallest).getGPA()) {
                    indexSmallest = j;
                }
            }

            // Swap numbers[i] and numbers[indexSmallest]
            Student temp;
            temp = studentArrayList.get(i);
            studentArrayList.set(i, studentArrayList.get(indexSmallest));
            studentArrayList.set(indexSmallest, temp);
        }
    }

    public static int sIDSearch(ArrayList<Student> studentArrayList, int sIDSearch){
        int foundIndex = -1;
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getsID() == sIDSearch){
                foundIndex = i;
                break;
            }
        }
        return foundIndex;
    }

    public static void main(String[] args) throws IOException{
        Student currStudent;

        //Scanner for read from keyboard
        Scanner scnr = new Scanner(System.in);
        /*
        currStudent = readStudent(scnr);
        currStudent.printInfo();
        currStudent = readStudent(scnr);
        currStudent.printInfo();
         */

        //Scanner for file input
        String filename;
        FileInputStream fileByteStream;
        Scanner inSS;

        // Read the files and create list of students

        //Counting files
        File directory = new File("Review");
        int filesCount = countFilesInDirectory(directory);
        //System.out.print(filesCount);

        ArrayList<Student> studentsList = new ArrayList<>();

        for (int i = 0; i < filesCount; i++) {
            filename = "student" + (i + 1) + ".txt";
            fileByteStream = new FileInputStream("Review/" + filename);
            inSS = new Scanner(fileByteStream);
            currStudent = readStudent(inSS);
            studentsList.add(currStudent);
            //currStudent.printInfo();
        }
        printInfoList(studentsList);

        //Sort base on GPA
        selectionSort(studentsList);
        printInfoList(studentsList);

        //Search student
        int sIDForQuery = scnr.nextInt();
        if (sIDSearch(studentsList, sIDForQuery) > 0){
            int foundIndex = sIDSearch(studentsList, sIDForQuery);
            studentsList.get(foundIndex).printInfo();
        }
        else {
            System.out.println("Cannot find this student.");
        }

    }
}

/*
INPUT:
name:nguyen van tuan
sid:4023710
major:IT (technology)
birthday:15/02/2005
GPA:3.25
intake:2023

name:nguyen nhu an
sid:4023719
major:finance
birthday:11/12/2005
GPA:3.6
intake:2023
 */
