import java.util.*;

public class quiz {
    public static void main(String arg[]) {
        Scanner object = new Scanner(System.in);

        int row;
        System.out.println("Enter the row");
        row = object.nextInt();

        int column;
        System.out.println("Enter the column");
        column = object.nextInt();

        int[][] My_Array = new int[row][column];
        Boolean find = false;

        System.out.println("Enter the content of the array :(" + row + "*" + column + ")");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                My_Array[i][j] = object.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (My_Array[i][j] == 49) {
                    System.out.println("Find it");
                    find = true;
                    break;
                }
            }
        }

        System.out.println();

        if (!find) {
            System.out.println("Not Find");
        }

        System.out.println("The content are: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(My_Array[i][j] + " ");
            }
            System.out.println();
        }
    }
}