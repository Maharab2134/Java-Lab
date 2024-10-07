//(a) Create an abstract class named Store. Store will have one non-abstract function showItem() and two abstract functions get_price() and display_info(). Create two derived classes Bookstore and Ricestore. In the main() function, design Store class in such a way that implements the idea of abstraction.

abstract class Store {
    void showItem() {
        System.out.println("Item is shown");
    }

    abstract void get_price();
    abstract void display_info();
}

class Bookstore extends Store {
    void get_price() {
        System.out.println("Price of the book is 100");
    }
    void display_info() {
        System.out.println("Book is displayed");
    }
}

class Ricestore extends Store {
    void get_price() {
        System.out.println("Price of the rice is 50");
    }
    void display_info() {
        System.out.println("Rice is displayed");
    }
}

public class Q3b {
    public static void main(String[] args) {
        Bookstore b = new Bookstore(); // obj
        Ricestore r = new Ricestore();
        b.showItem();
        b.get_price();
        b.display_info();
        r.showItem();
        r.get_price();
        r.display_info();
    }
}
