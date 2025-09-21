import java.util.Scanner;
import java.util.Random;

public class classwork004 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter the max row:");
        int maxrow = object.nextInt();
        System.out.println("Please enter the max column:");
        int maxcolumn = object.nextInt();

        int[][] ThisTable = new int[maxrow][maxcolumn];

        for (int i = 0; i < maxrow; i++) {
            for (int j = 0; j < maxcolumn; j++) {
                ThisTable[i][j] = random.nextInt(1, 101);
            }
        }

        for (int i = 0; i < maxrow; i++) {
            for (int j = 0; j < maxcolumn; j++) {
                System.out.print(ThisTable[i][j] + " ");
            }
            System.out.println();
        }

    }
}
