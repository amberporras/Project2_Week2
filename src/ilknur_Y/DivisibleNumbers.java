package ilknur_Y;

public class DivisibleNumbers {

    public static void main(String[] args) {

        System.out.print("DivisibleBy15 ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                System.out.print(i + " ,");
            }
        }

        System.out.print("\nDivisibleBy5 ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i + " ,");
            }
        }

        System.out.print("\nDivisibleBy15 ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                System.out.print(i + " ,");
            }
        }

    }


}
