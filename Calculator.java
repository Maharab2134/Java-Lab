// This program demonstrates method overloading in Java
public class Calculator {

    int add (int a,int b){
        return a+b;
    }
    float add (float a,float b){
        return a+b;
    }
    int add (int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(2, 3));
        System.out.println(cal.add(2.5f, 3.5f));
        System.out.println(cal.add(2, 3, 4));
    }
}