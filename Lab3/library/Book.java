// File: library/Book.java
package library;

public class Book {
    // Protected attributes
    protected String title;
    protected String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}