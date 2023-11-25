package com.ahmudz.bookmanagementsystem;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Mahmud
 */
public class StateManager {

    static JFrame previousWindow;

    static String role;

    static String[][] issuedBooks = new String[20][3];

    static void addIssueBook(String id, String bookName, String amount) {
        
        for(int i = 0; i < issuedBooks.length; i++) {
            if(issuedBooks[i][0] == null) {
                issuedBooks[i][0] = id;
                issuedBooks[i][1] = bookName;
                issuedBooks[i][2] = amount;
                
                break;
            }
        }
    }
}
