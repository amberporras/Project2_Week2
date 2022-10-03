package Marija;

public class Class {
    public static void main(String args[]) {
        System.out.println("\nDivisible by 3: ");
        for (int i=1; i<100; i++) {
            if (i%3==0)
                System.out.print(i +", ");
        }

        System.out.println("\n\nDivisible by 5: ");
        for (int i=1; i<100; i++) {
            if (i%5==0) System.out.print(i +", ");
        }

        System.out.println("\n\nDivisible by 15: ");
        for (int i=1; i<100; i++) {
            if (i%15==0 && i%5==0) System.out.print(i +", ");
        }
        System.out.println("\n");
    }
}

