import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class FILE1 {
    public static void main(String[] args) {
        Scanner mysScanner = new Scanner(System.in);
        String textline;

        try {
            FileWriter filewWriter = new FileWriter("mytext.txt", false);
            PrintWriter printWriter = new PrintWriter(filewWriter);
            System.out.println("Please enter  the text: ");
            textline = mysScanner.next();
            do {
                printWriter.println(textline);
                textline = mysScanner.nextLine();
            } while (!textline.equals("end"));
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader("mytext.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            textline = bufferedReader.readLine();
            do {
                System.out.println(textline);
                textline = bufferedReader.readLine();
            } while (textline != null);
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
        try {
            FileWriter filewWriter = new FileWriter("mytext.txt", true);
            PrintWriter printWriter = new PrintWriter(filewWriter);
            System.out.println("Please enter  the text: ");
            textline = mysScanner.next();
            do {
                printWriter.println(textline);
                textline = mysScanner.nextLine();
            } while (!textline.equals("end"));
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
