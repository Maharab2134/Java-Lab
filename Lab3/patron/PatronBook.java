// File: patron/PatronBook.java
package patron;

import library.Book;

public class PatronBook extends Book {
    
    public PatronBook(String title, String author) {
        super(title, author);
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);   
        System.out.println("Author: " + author); 
    }

    public static void main(String[] args) {
        PatronBook book = new PatronBook("The Great Gatsby", "F. Scott Fitzgerald");
        book.displayBookInfo();
    }
}
