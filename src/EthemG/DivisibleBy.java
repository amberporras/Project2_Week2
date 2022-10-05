package EthemG;

public class DivisibleBy {
    public static void main(String[] args) {
        String sum15= "";
        String sum5= "";
        String sum3= "";
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0 ){
                sum15+=i+" ";
            }
            if (i % 5 == 0){
                sum5+=i+" ";
            }
            if (i % 3 == 0){
                sum3+=i+ " ";
            }
        }
        System.out.print("Divisible By 15 " + sum15);
        System.out.print("\nDivisible By 5 " + sum5);
        System.out.print("\nDivisible By 3 " + sum3);
    }
}


