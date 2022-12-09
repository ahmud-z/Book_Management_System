/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ahmudz.bookmanagementsystem;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Mahmud
 */
public class BookManager {

    static String[] searchByName(String name) {
        String books[][] = getBooks();
        String book[] = new String[3];

        for (int i = 0; i <= books.length; i++) {
            if (books[i][0].equals(name)) {
                book = books[i];
                break;
            }
        }
        return book;
    }

    static String[][] getBooks() {
        String[][] books = new String[20][3];

        try {
            File file = new File("books.db");

            Scanner readerScanner = new Scanner(file);

            int i = 0;

            while (readerScanner.hasNextLine()) {
                String book = readerScanner.nextLine();
                
                if(book.isBlank() || book.isEmpty()) {
                    continue;
                }
                
                String[] bookDataArr = book.split("_");

                books[i][0] = bookDataArr[0];
                books[i][1] = bookDataArr[1];
                books[i][2] = bookDataArr[2];

                i++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return books;

    }

    static void addBook(String name, String author, String stock) {
        try {
            FileWriter writer = new FileWriter("books.db", true);

            writer.write("\n" + name + "_" + stock + "_" + author);

            writer.close();

        } catch (Exception e) {
        }
    }

    static void updateBook(String name, String author, String stock) {
        try {
            String contents = "";
            
            String[][] books = getBooks();
            System.out.println("Total Books: " + books.length);
            
            for (int i = 0; i < books.length; i++) {
                if(books[i][0] == null) {
                    break;
                }
                
                if (books[i][0].equals(name)) { // Throws exception/error
                    books[i][0] = name;
                    books[i][1] = author;
                    books[i][2] = stock;
                }
                
                contents += books[i][0] + "_" + books[i][1] + "_" + books[i][2] + "\n";
                
                System.out.println(contents);
            }
            
            FileWriter writer = new FileWriter("books.db");
            writer.write(contents);
            writer.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
