/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ahmudz.bookmanagementsystem;

import java.sql.*;

/**
 *
 * @author Mahmud
 */
public class DatabaseManager {

    Connection connection;

    public DatabaseManager() {
        try {
            Class.forName("org.sqlite.JDBC");

            connection = DriverManager.getConnection("jdbc:sqlite:database.db");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }

        System.out.println("Opened database successfully");
    }

    void initDatabase() {
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            String sql = "CREATE TABLE 'books' (\n"
                    + "	'id' INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n"
                    + "	'name' VARCHAR(50) NULL,\n"
                    + "	'author' VARCHAR(50) NULL,\n"
                    + "	'stock' INTEGER NULL\n"
                    + ");";

            stmt.executeUpdate(sql);

            stmt.close();

            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    void seed() {
        String sql = "INSERT INTO books (name, author, stock) values('history IV', 'HASAN', '12');\n"
                + "INSERT INTO books (name, author, stock) values('History III', 'HASAN', '25');\n"
                + "INSERT INTO books (name, author, stock) values('History II', 'HASAN', '15');\n"
                + "INSERT INTO books (name, author, stock) values('History', 'HASAN', '2');\n"
                + "INSERT INTO books (name, author, stock) values('Physics Lab', 'HASAN', '13');\n"
                + "INSERT INTO books (name, author, stock) values('Physics II', 'HASAN', '12');\n"
                + "INSERT INTO books (name, author, stock) values('Ordinary and Partial Differential Equations and Coordinate Geometry', 'HASAN', '3');\n"
                + "INSERT INTO books (name, author, stock) values('English for Academic Purpose I', 'HASAN', '1');\n"
                + "INSERT INTO books (name, author, stock) values('Structured Programming Lab', 'HASAN', '19');\n"
                + "INSERT INTO books (name, author, stock) values('Structured Programming', 'HASAN', '19');\n"
                + "INSERT INTO books (name, author, stock) values('Physics I', 'HASAN', '3');\n"
                + "INSERT INTO books (name, author, stock) values('Differential and Integral Calculus', 'HASAN', '11');\n"
                + "INSERT INTO books (name, author, stock) values('Discrete Mathematics', 'HASAN', '20');";

        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            stmt.executeUpdate(sql);

            stmt.close();

            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    void insertBook(String name, String author, String stock) {
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            String sql = "INSERT INTO books ";

            stmt.executeUpdate(sql);

            stmt.close();

            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    void getBooks() {
        Statement stmt = null;
        
        try {
            System.out.println("Opened database successfully");

            stmt = connection.createStatement();
            
            ResultSet results = stmt.executeQuery("SELECT * FROM books;");

            while (results.next()) {
                int id = results.getInt("id");
                String name = results.getString("name");
                String author = results.getString("author");
                int stock = results.getInt("stock");
                

                System.out.println("ID = " + id);
                System.out.println("NAME = " + name);
                
                System.out.println();
            }
            
            results.close();
            stmt.close();
            
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}
