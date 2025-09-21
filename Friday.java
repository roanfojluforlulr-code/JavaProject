import java.util.*;

public class Friday {
    public static void main(String[] args) {
        int[] Gary = { 5, 7, 41, 19, 42, 39, 12, 23, 34 };
        int counter = 0;
        int i = 0;
        while (counter < 8) {
            if (i == 8) {
                i = 0;
            } else if (Gary[i] < Gary[i + 1]) {
                counter = counter + 1;
            } else {
                counter = 0;
                int temp = Gary[i];
                Gary[i] = Gary[i + 1];
                Gary[i + 1] = temp;
            }
            i = i + 1;
        }
        for (i = 0; i < 9; i++) {
            System.out.println(Gary[i]);
        }
    }

    /*
     * public static void main(String args[]) {
     * Scanner object = new Scanner(System.in);
     * 
     * int number_row = 2;
     * int number_column = 8;
     * int number;
     * 
     * System.out.println("there are 2 row");
     * System.out.println("there are 8 column");
     * 
     * int[][] mylist = new int[number_row][number_column];
     * System.out.println("enter the number");
     * 
     * for (int i = 0; i < number_row; i++) {
     * for (int j = 0; j < number_column; j++) {
     * mylist[i][j] = object.nextInt();
     * }
     * }
     * 
     * System.out.println();
     * System.out.println("The array are ");
     * 
     * for (int i = 0; i < number_row; i++) {
     * for (int j = 0; j < number_column; j++) {
     * System.out.print(mylist[i][j]);
     * }
     * System.out.println();
     * }
     * 
     * }
     */
}
