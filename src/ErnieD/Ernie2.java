package ErnieD;

public class Ernie2 {

    public static void main(String[] args) {
        consecutiveNums(55);
    }

        public static void consecutiveNums(int N){

        String result = "";

        for (int i = 1;i <= N; i++){
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0){
                result += "CodilityTestCoders\n";
            }else if (i % 2 == 0 && i % 3 == 0){
                result += "CodilityTest\n";
            }else if (i % 2 == 0 && i % 5 == 0){
                result += "CodilityCoders\n";
            }else if (i % 3 == 0 && i % 5 == 0){
                result += "TestCoders\n";
            }else if (i % 5 == 0){
                result += "Test\n";
            }else {
                result += i + "\n";
            }
        }
    }
}