//Let there is a class A which has a member function showAO) which displays "49 intake!!! Best of Luck for your exam !!!". Class C and class D inherits class A and class E inherits both class C and class D. Will there any problem if we call showA() function from the object of class E? If yes, then how can we solve it? Write down the solved program. 

class A {
    void showA() {
        System.out.println("49 intake!!! Best of Luck for your exam !!!");
    }
}

class C extends A {

}

class D extends A {
    
}


class E extends C {
    void showE() {
        showA();
    }
}

public class Qb {
    public static void main(String[] args) {
        E obj = new E();
        obj.showE();
    }
}
