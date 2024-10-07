class Shape{
    void draw(){
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}



public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape = new Rectangle();
        shape.draw();
    }
}
