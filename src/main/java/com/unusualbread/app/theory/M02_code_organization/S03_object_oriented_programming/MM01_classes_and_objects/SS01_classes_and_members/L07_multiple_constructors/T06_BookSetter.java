package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L07_multiple_constructors;

/*
Consider a book store. Each book has three properties: 'title', 'author', and
'price'. Create a class named 'Book' with multiple constructors where 'title'
and 'author' are mandatory, but 'price' is optional. Your constructor with 2
parameters (title, author) should set the price to 0. Your constructor with 3
parameters (title, author, price) should set the properties as given. You
should also include an instance method 'getDetails' to return the details of
the book in the format: title - author - price. Now, write a Java program that
receives a line containing the title, author, and price of a book (separated by
comma). If the price is missing, it should be considered as 0. The program
should generate a new instance of 'Book' accordingly and print the details of
the book using the 'getDetails' method.
*/

import java.util.Scanner;

public class T06_BookSetter {

    public static class Book {
        String title;
        String author;
        double price;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.price = 0;
        }

        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public String getDetails () {
            return this.title + " - " + this.author + " - " + this.price;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        input.close();

        String[] parts = line.split(",");

        Book book;
        if (parts.length == 3) {
            String title = parts[0];
            String author = parts[1];
            double price = Double.parseDouble(parts[2]);
            book = new Book(title, author, price);
        } else {
            String title = parts[0];
            String author = parts[1];
            book = new Book(title, author);
        }

        System.out.println(book.getDetails());
    }
}
