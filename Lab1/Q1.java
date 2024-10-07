//Create a basic calculator that can perform addition, subtraction, multiplication, and division.

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        
        System.out.println("Enter the operation: ");
        char operation = sc.next().charAt(0);
        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation");
        }
        System.out.println("The result is: " + result);
        sc.close();
    }
}