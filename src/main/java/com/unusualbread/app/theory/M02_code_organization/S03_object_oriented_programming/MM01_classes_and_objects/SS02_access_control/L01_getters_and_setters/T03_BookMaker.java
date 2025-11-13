package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS02_access_control.L01_getters_and_setters;

import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int numberOfPages;

    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        if (author != null) {
            this.author = author;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages > 0) {
            this.numberOfPages = numberOfPages;
        }
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}

public class T03_BookMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book = new Book();

        book.setTitle(scanner.nextLine());
        book.setAuthor(scanner.nextLine());
        book.setNumberOfPages(scanner.nextInt());

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getNumberOfPages());

        scanner.close();
    }
}
