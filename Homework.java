import java.io.*;
import java.util.Scanner;

public class Homework {
    public static void main(String args[]) {

        Scanner object = new Scanner(System.in);
        int[] array = new int[10];
        int index = 1;

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            array[i] = index;
            index++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            array[i] = 0;
        }

        while (true) {
            int number;
            System.out.println("Please enter the number:");
            number = object.nextInt();
            if (number == 0)
                break;
            for (int i = 0; i < 10; i++) {
                if (number == i)
                    array[i - 1] += 1;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < 10; i++) {
            array[i] = 0;
        }

        System.out.println();

        int row = 5;
        int column = 5;

        int[][] arr = new int[row][column];

        while (true) {
            System.out.println("Please enter the first number:");
            int FirstNumber = object.nextInt();
            if (FirstNumber == 0)
                break;
            System.out.println("Please enter the second number:");
            int Secondnumber = object.nextInt();
            if (Secondnumber == 0)
                break;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (FirstNumber == i && Secondnumber == j) {
                        arr[i - 1][j - 1] += 1;
                    }
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = 0;
            }
        }

        System.out.println();

        String FilePath_1 = "Homework_1.txt";
        File file_1 = new File(FilePath_1);
        try {
            if (file_1.createNewFile()) {
                System.out.println("The  Firstfile name is: " + file_1.getName());
            } else {
                System.out.println("The Firstfile is exist");
            }
        } catch (IOException e) {
            System.out.println("Error while creating file:" + e.getMessage());
        }

        String content;
        System.out.println("Please enter the content that you want to write in the file: ");
        content = object.next();
        try (FileWriter writer = new FileWriter(FilePath_1)) {
            writer.write(content);
            System.out.println("Have been written into");
        } catch (IOException e) {
            System.out.println("Error while writing file" + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FilePath_1))) {
            String line;
            System.out.println("The Firstfile content are:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading file" + e.getMessage());
        }

        try (FileOutputStream fos = new FileOutputStream(FilePath_1)) {
            fos.getChannel().truncate(0);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        String FilePath_2 = "Homework_2.txt";
        File file_2 = new File(FilePath_2);
        try {
            if (file_2.createNewFile()) {
                System.out.println("The  Secondfile name is: " + file_2.getName());
            } else {
                System.out.println("The Secondfile is exist");
            }
        } catch (IOException e) {
            System.out.println("Error while creating file:" + e.getMessage());
        }

        try (FileWriter writer = new FileWriter(FilePath_2)) {
            writer.write(content);
            System.out.println("Have been written into");
        } catch (IOException e) {
            System.out.println("Error while writing file" + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FilePath_2))) {
            String line;
            System.out.println("The Secondfile content are:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading file" + e.getMessage());
        }

        System.out.println();

        try (BufferedReader reader = new BufferedReader(new FileReader(FilePath_1))) {
            String line;
            System.out.println("The Firstfile content are:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading file" + e.getMessage());
        }
    }
}