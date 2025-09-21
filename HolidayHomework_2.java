import java.util.*;
import java.io.*;

public class HolidayHomework_2 {
    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
    }

    // 1
    public static void q1() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        System.out.println("Q1:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 2
    public static void q2() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Q2:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 3
    public static void q3() {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Q3:");
        do {
            System.out.print("Enter a number between 1 and 10 (0 to exit): ");
            input = scanner.nextInt();
            if (input >= 1 && input <= 10) {
                array[input - 1]++;
            }
        } while (input != 0);
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 4
    public static void q4() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;
            }
        }
        System.out.println("Q4:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // 5
    public static void q5() {
        int[][] array = new int[5][5];
        Scanner scanner = new Scanner(System.in);
        int row, col;
        System.out.println("Q5:");
        do {
            System.out.print("Enter row and column numbers between 1 and 5 (0 to exit): ");
            row = scanner.nextInt();
            if (row == 0)
                break;
            col = scanner.nextInt();
            if (row >= 1 && row <= 5 && col >= 1 && col <= 5) {
                array[row - 1][col - 1]++;
            }
        } while (true);
        for (int[] r : array) {
            for (int value : r) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // 6
    public static void q6() {
        System.out.println("Q6:");
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 7
    public static void q7() {
        System.out.println("Q7:");
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}