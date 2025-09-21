import java.util.*;

public class classwork002 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        String name = "Aman";

        System.out.println(name.charAt(2));

        char a = 'A';
        System.out.println((int) a);

        int b = 65;
        System.out.println((char) b);

        int length = name.length();
        System.out.println(length);

        System.out.println(name.substring(0, 2));

        System.out.println(name.substring(length - 1));

        double y = 1.02;
        System.out.println((int) y);

        String x = "12";
        System.out.println(Integer.valueOf(x));

        Random randomnumber = new Random();
        int z = randomnumber.nextInt(6) + 1;

        System.out.println(z);

        /*
         * method 1
         * int length = name.length();
         * // System.out.println("please enter the number of term you want:");
         * int number = 2;
         * char[] chararray = name.toCharArray();
         *
         * for (int i = 0; i < length; i++) {
         * if (i == number - 1) {
         * System.out.println(chararray[i + 1]);
         * break;
         * }
         * }
         */

    }
}
