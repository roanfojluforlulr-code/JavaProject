import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class classwork006 {
    public static void main(String[] args) throws IOException {

        Scanner object = new Scanner(System.in);
        int[] Tally = new int[5];
        int choice = 0;
        String[] hobbytitles = { "Reading", "Computer games", "Sport", "Progeamming", "TV" };

        do {
            System.out.println("Please enter the choice:");
            choice = object.nextInt();
            Tally[choice] += 1;
        } while (choice != 0);

        for (int i = 0; i < 5; i++) {
            System.out.print(hobbytitles[i] + " ");
            System.out.println(Tally[i]);
        }

        FileWriter filehandle = new FileWriter("Classwork006.TXT", false);
        PrintWriter printLine = new PrintWriter(filehandle);

        for (int i = 0; i < 5; i++) {
            String lineOFText = hobbytitles[i];
            printLine.printf("%s" + "%n", lineOFText);
        }

        FileReader fileHandle = new FileReader("Classwork006.TXT");
        BufferedReader textReader = new BufferedReader(fileHandle);
        String LineOFText = textReader.readLine();
        System.out.println(LineOFText);

        printLine.close();

    }
}
