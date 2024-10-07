public class Book {
    private static int totalBooks = 0;

    public Book() { // Constructor
        totalBooks++;
    }
    
    public static int getTotalBooks() {
        return totalBooks;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        System.out.println("Total books: " + Book.getTotalBooks());
    }
}