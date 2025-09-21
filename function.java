import java.util.Scanner;

public class function {

    Scanner object = new Scanner(System.in);

    public void judge() {
        while (true) {
            System.out.println("please enter a number:");
            int number = object.nextInt();
            if (number % 2 == 1)
                break;
            System.out.println("Invalid number entered");
        }
        System.out.println("Valid number entered");
    }

    public void sum(int a, int b) {
        int SumNumber = 0;
        for (int i = a; i <= b; i++) {
            SumNumber += i;
        }
        System.out.println(SumNumber);
    }

    public void main(String[] args) {
        judge();
        System.out.println("please enter the times of  firstnumber:");
        int first = object.nextInt();
        System.out.println("please enter the times of lastnumber:");
        int second = object.nextInt();
        sum(first, second);
        System.out.println("please enter the firstnumber:");
        int a = object.nextInt();
        System.out.println("please enter the secondnumber:");
        int b = object.nextInt();
        add(a, b);
    }

    public void add(int x, int y) {
        int sum = x + y;
        System.out.println(sum);
        int temp = y;
        y = x;
        x = temp;
    }

}
