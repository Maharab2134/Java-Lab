public class StaticExample {

    static int staticVar = 10;
    int nonStaticVar = 20;

    static void staticMethod() {
        System.out.println("Static Method");
    }

    void nonStaticMethod() {
        System.out.println("Non Static Method");
    }

    public static void main(String[] args) {
        // Accessing static variable
        System.out.println(staticVar);

        // Accessing static method
        staticMethod();

        // Accessing non-static variable
        // System.out.println(nonStaticVar); // This will give an error
        // nonStaticMethod(); // This will give an error

        // To access non-static variable and method, we need to create an object of the class
        StaticExample obj = new StaticExample();
        System.out.println(obj.nonStaticVar);
        obj.nonStaticMethod();
    }
}