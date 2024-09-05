/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listmain2;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int year;
    static String genre = "Fiction"; 
    static int count = 0; 

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        count++; 
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public static String getGenre() {
        return genre;
    }

    public static int getCount() {
        return count;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
    }

    public static void displayTotalBooks() {
        System.out.println("Total books: " + count);
    }
}

public class Listmain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Book[] bookArray = new Book[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Input title, author, and year for book " + (i + 1));
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            int year = scanner.nextInt();
            scanner.nextLine(); 
            bookArray[i] = new Book(title, author, year);
        }

        System.out.println("Array:");
        for (Book book : bookArray) {
            book.displayBookDetails();
            System.out.println();
        }

        
        List<Book> bookArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Input title, author, and year for book " + (i + 1));
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            int year = scanner.nextInt();
            scanner.nextLine(); 
            bookArrayList.add(new Book(title, author, year));
        }

        System.out.println("ArrayList:");
        for (Book book : bookArrayList) {
            book.displayBookDetails();
            System.out.println();
        }

        
        List<Book> bookLinkedList = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Input title, author, and year for book " + (i + 1));
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            int year = scanner.nextInt();
            scanner.nextLine(); 
            bookLinkedList.add(new Book(title, author, year));
        }

        System.out.println("LinkedList:");
        for (Book book : bookLinkedList) {
            book.displayBookDetails();
            System.out.println();
        }

        Book.displayTotalBooks();
    }
}
