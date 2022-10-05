package RollaT;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int x = input.nextInt();
        System.out.println("Enter second number");
        int y = input.nextInt();
        System.out.println("After swapping" );
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("value of x: " + x);
        System.out.println("value of y: " + y);
    }
}
