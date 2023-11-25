package RMITAssessment2.Task1;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {

    // This function returns all books in the input file
    public Book[] readBooks(String fileName) throws IOException {
        /** Implement your code here*/
        String filename = "RMITAssessment2/Task1/" + fileName;
        FileInputStream fileByteStream = new FileInputStream(filename);
        Scanner inSS = new Scanner(fileByteStream);
        int booksNum = inSS.nextInt();
        String temp = inSS.nextLine();
        Book []booksList = new Book[booksNum];

        String title;
        String author;
        int pages;
        double price;
        Book bookItem;

        for (int i = 0; i < booksNum; i++) {
            title = inSS.nextLine();
            author = inSS.nextLine();
            pages = inSS.nextInt();
            price = inSS.nextDouble();
            bookItem = new Book(title, author, pages, price);
            booksList[i] = bookItem;
            temp = inSS.nextLine();
        }
        return booksList;
    }

    // This function returns all books that have the seach term in their title in the input file
    public Book[] readBooks(String fileName, String searchTerm) throws IOException {
        /** Implement your code here*/
        String filename = "RMITAssessment2/Task1/" + fileName;
        FileInputStream fileByteStream = new FileInputStream(filename);
        Scanner inSS = new Scanner(fileByteStream);
        int booksNum = inSS.nextInt();
        String temp = inSS.nextLine();
        Book []booksList = new Book[booksNum];

        String title;
        String author;
        int pages;
        double price;
        Book bookItem;
        int outputBooksNum = 0;

        for (int i = 0; i < booksNum; i++) {
            title = inSS.nextLine();
            author = inSS.nextLine();
            pages = inSS.nextInt();
            price = inSS.nextDouble();
            bookItem = new Book(title, author, pages, price);
            booksList[i] = bookItem;
            if (title.indexOf(searchTerm) > 0){
                ++outputBooksNum;
            }
            temp = inSS.nextLine();
        }

        Book []bookListOuput = new Book[outputBooksNum];
        int countOutput = 0;
        for (int i = 0; i < booksNum; i++) {
            if (booksList[i].getTitle().indexOf(searchTerm) > 0){
                bookListOuput[countOutput] = booksList[i];
                ++countOutput;
            }
        }
        return bookListOuput;
    }
}
