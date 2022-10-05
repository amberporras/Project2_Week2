package ErnieD;

public class Ernie1 {

    public static void main(String[] args) {

        System.out.println("Divisible by 3 ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.println(i + "");
        }
        System.out.println("Divisible by 5 ");
        for (int i = 1; i < 100; i++){
            if (i % 5 == 0)
                System.out.println(i + "");

        }
        System.out.println("Divisible by 15 ");
        for (int i = 1; i < 100 ; i++) {
            if (i % 15 == 0 && i % 5 == 0)
                System.out.println(i + "");

        }
      }
    }

