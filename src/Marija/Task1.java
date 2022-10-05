package Marija;

public class Task1 {
    public static void main(String[] args) {

        int  x = 100, y = 300;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temporary = x;
        x = y;
        y = temporary;

        System.out.println(" ");

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
