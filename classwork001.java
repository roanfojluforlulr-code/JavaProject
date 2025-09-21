import java.util.Scanner;

public class classwork001 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        int MonthNumber;
        int Year;
        int days = 0;

        System.out.println("Please enter Monthnumber:");
        MonthNumber = object.nextInt();
        System.out.println("Please enter Year:");
        Year = object.nextInt();

        switch (MonthNumber) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2:
                days = 28;
                if (Year % 400 == 0) {
                    days = 29;
                }
                if (Year % 4 == 0 && Year % 100 > 0) {
                    days = 29;
                }
                break;
            default:
                System.out.println("Invallid month number");
                break;
        }

        System.out.println("days:" + days);
    }
}
