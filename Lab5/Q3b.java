//Create a base class called shape which has two double type properties and a function Set_data which is used to set the values of those two properties. There should be another member function display_area() in shape to compute and display the area of figures. Derive two specific classes called triangle and rectangle from the base shape. Use these three classes that implements the idea of dynamic method dispatch. 

class Shape {
    double a, b;
    void Set_data(double a, double b) {
        this.a = a;
        this.b = b;
    }
    void display_area() {
        System.out.println("Area is: ");
    }
}

class Triangle extends Shape {
    void display_area() {
        System.out.println("Area of triangle is: " + 0.5 * a * b);
    }
}

class Rectangle extends Shape {
    void display_area() {
        System.out.println("Area of rectangle is: " + a * b);
    }
}

public class Q3b {
    public static void main(String[] args) {
        Shape s;
        s = new Triangle();
        s.Set_data(15, 24);
        s.display_area();
        s = new Rectangle();
        s.Set_data(15, 24);
        s.display_area();
    }
}
