//Create a base class called shape which has two double type properties and a function setdata which is used to set the values of those two properties. There should be another member function display_area() in shape to compute and display the area of figures. Derive two specific classes called triangle and rectangle from the base shape. Use these three classes that implements the idea of dynamic method dispatch. 

class shape {
    double a, b;
    void setdata(double a, double b) {
        this.a = a;
        this.b = b;
    }
    void display_area() {
        System.out.println("Area is: ");
    }
}

class triangle extends shape {
    void display_area() {
        System.out.println("Area of triangle is: " + 0.5 * a * b);
    }
}

class rectangle extends shape {
    void display_area() {
        System.out.println("Area of rectangle is: " + a * b);
    }
}

public class Q3a {
    public static void main(String[] args) {
        shape s;
        s = new triangle();
        s.setdata(15, 24);
        s.display_area();
        s = new rectangle();
        s.setdata(15, 24);
        s.display_area();
    }
}
