import java.util.*;

public class HolidayHomework_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Surface Area: " + (length * width));

        // 2
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        System.out.println("Temperature in Celsius: " + ((fahrenheit - 32) * 5 / 9));

        // 3
        System.out.print("Enter temperature in Celsius: ");
        double temp = scanner.nextDouble();
        if (temp < 1) {
            System.out.println("It is freezing.");
        } else {
            System.out.println("It is not freezing.");
        }

        // 4
        System.out.print("Enter temperature in Celsius: ");
        temp = scanner.nextDouble();
        if (temp < 0) {
            System.out.println("Water is frozen.");
        } else if (temp >= 100) {
            System.out.println("Water is boiling.");
        } else {
            System.out.println("Water is liquid.");
        }

        // 5
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();
        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month number.";
                break;

        }
        System.out.println("Month: " + monthName);

        // 6
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++)
            System.out.print(i + " ");
        System.out.println();

        // 7
        for (int i = num; i >= 1; i--)
            System.out.print(i + " ");
        System.out.println();

        // 8
        System.out.print("Enter step size: ");
        int step = scanner.nextInt();
        for (int i = num; i >= 1; i -= step)
            System.out.print(i + " ");
        System.out.println();

        // 9
        System.out.println("Enter 10 numbers:");
        int[] max = new int[10];
        int temporaryVariable = 0;
        for (int i = 1; i < 10; i++) {
            max[i] = scanner.nextInt();
            if (max[i] > temporaryVariable) {
                temporaryVariable = max[i];
            }
        }
        System.out.println("Largest number: " + temporaryVariable);

        // 10
        System.out.println("Enter 10 numbers:");
        int[] min = new int[10];
        int TemporaryVariable = 0;
        for (int i = 0; i <= 10; i++) {
            min[i] = scanner.nextInt();
            if (min[i] < TemporaryVariable) {
                TemporaryVariable = min[i];
            }
        }
        System.out.println("Smallest number: " + TemporaryVariable);

        // 11
        do {
            System.out.print("Enter a number between 1 and 5: ");
            num = scanner.nextInt();
        } while (num < 1 || num > 5);
        System.out.println("Valid input: " + num);

        // 12
        System.out.print("Enter start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter end number: ");
        int end = scanner.nextInt();
        for (int i = start; i <= end; i++)
            System.out.print(i + " ");
        System.out.println();

        // 13
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        System.out.println("ASCII code: " + (int) character);

        // 14
        System.out.print("Enter an ASCII code: ");
        int ascii = scanner.nextInt();
        System.out.println("Character: " + (char) ascii);

        // 15
        System.out.print("Enter a string: ");
        scanner.nextLine();
        String inputString = scanner.nextLine();
        System.out.println("String length: " + inputString.length());

        // 16
        System.out.print("Enter a string: ");
        String InputString = scanner.nextLine();

        if (inputString.length() >= 2) {
            System.out.println("First two characters: " + InputString.substring(0, 2));
        } else {
            System.out.println("First two characters: " + InputString);
        }

        // 17
        if (inputString.length() >= 2) {
            System.out.println("Last two characters: " + InputString.substring(0, -2));
        } else {
            System.out.println("Last two characters: " + InputString);
        }

        // 18
        int mid = inputString.length() / 2;
        if (inputString.length() % 2 == 0) {
            System.out.println("Middle characters: " + inputString.substring(mid - 1, mid + 1));
        } else {
            System.out.println("Middle character: " + inputString.charAt(mid));
        }

        // 19
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        System.out.print("Enter surname: ");
        String surname = scanner.next();
        System.out.println("Full name: " + firstName + " " + surname);

        // 20
        System.out.println("Short name: " + firstName.charAt(0) + " " + surname);

        // 21
        System.out.print("Enter a decimal number: ");
        double decimalNumber = scanner.nextDouble();
        System.out.println("Rounded number: " + Math.round(decimalNumber));

        // 22
        System.out.println("Five random numbers: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(random.nextInt(100) + " ");
        }
        System.out.println();

    }
}