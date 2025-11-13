package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L05_defining_classes;

/*
Create a class named 'Book' with a title, author, and number of pages, and
provide methods to set and get these data. Next, in your main function, create
a new 'Book' instance and set the title and author as inputted from user input
and set the number of pages to 100. Finally, print the book details.
*/

import java.util.Scanner;

public class T04_BookDetailsPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        Book book = new Book();
        int pages = 100;

        // Set the details of the book
        // Implement here
        book.setTitle(title);
        book.setAuthor(author);
        book.setPages(pages);
        // Print the details of the book
        // Implement here
        System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Pages: " + book.getPages());

        sc.close();
    }
}

class Book {
    private String title;
    private String author;
    private int pages;

    // Getters and setters
    // Implement here
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}