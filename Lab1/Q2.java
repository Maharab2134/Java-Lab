//Write a program that calculates and prints the sum of integers from 1 to N, where N is taken as user input.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum of integers from 1 to " + num + " is: " + sum);
        sc.close();
    }
}
