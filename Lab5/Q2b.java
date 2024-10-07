//Write a program using three classes named Grandfather, Father and Son where the constructor of each class takes one integer Age and one string Name value as argument. All the constructors show the Name and Age. Complete the program considering the following cases:  i) Father inherits Grandfather and Son inherits Father.  Now show the output for the above case. Also implement super and this keyword in the above program. 


class Grandfather {
    int Age;
    String Name;
    Grandfather(int Age, String Name) {
        this.Age = Age;
        this.Name = Name;
        System.out.println("Grandfather's Name: " + Name + " Age: " + Age);
    }
}

class Father extends Grandfather {
    Father(int Age, String Name) {
        super(Age, Name);
        System.out.println("Father's Name: " + Name + " Age: " + Age);
    }
}

class Son extends
Father {
    Son(int Age, String Name) {
        super(Age, Name);
        System.out.println("Son's Name: " + Name + " Age: " + Age);
    }
}

public class Q2b {
    public static void main(String[] args) {
        Son s = new Son(26, "Akash");
    }
}
