import java.util.*;

public class LinerSerach {
    public static void main(String arg[]) {
        Scanner object = new Scanner(System.in);

        int item;
        boolean find = false;
        int index = 0;

        System.out.println("Enter the item that you want to find:");
        item = object.nextInt();

        int mylist[] = { 5, 7, 42, 19, 42, 39 };

        for (; index < 6; ++index) {
            if (item == mylist[index]) {
                find = true;
                System.out.println("Find it at index " + index);
            }
        }

        if (!find) {
            System.out.println("Not Found");
        }

    }

}