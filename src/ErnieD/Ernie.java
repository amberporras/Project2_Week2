package ErnieD;

public class Ernie {

    public static void main(String[] args) {
        String s1 = "Red";
        String s2 = "October";

        System.out.println("before swap");

        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() -s2.length());

        s1 = s1.substring(s2.length());

        System.out.println("after swap");
        System.out.println(" s1 = " + s1);
        System.out.println(" s2 = " + s2);
    }

}
