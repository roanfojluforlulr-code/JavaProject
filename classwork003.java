import java.util.Scanner;

public class classwork003 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int MaxIndex = 6;
        int[] Mylist = new int[MaxIndex];
        for (int i = 0; i < 6; i++) {
            System.out.println("Please enter the " + i + " number");
            int number = object.nextInt();
            Mylist[i] = number;
        }

        System.out.println("Please enter the value you want to search: ");
        int SearchValue = object.nextInt();

        boolean Found = false;
        int index = -1;

        do {
            index += 1;
            if (Mylist[index] == SearchValue) {
                Found = true;
            }
        } while (Found == false || index <= MaxIndex);

        if (Found == true) {
            System.out.println("Value found at location: " + index);
        } else {
            System.out.println("Value not found");
        }
    }
}
