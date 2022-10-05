package Ecaterina;

import java.util.Scanner;

public class Task1_SwapNumbers{
    public static void main(String[] args) {
        // Swap two variable's values without using a third variable

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number x value: ");
        int x = input.nextInt();
        System.out.println("Enter number y value: ");
        int y = input.nextInt();

        x = x + y;
        y = x - y; // y becomes x
        x = x - y; // x becomes y

        System.out.println("value of x = " + x + "\nvalue of y = " + y);

    }
}