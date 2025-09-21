import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {
    public static void CreateFile(String filePath) {
        File file = new File(filePath);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }
    }

    public static void main(String arg[]) {
        String filePath = "Note.txt";
        CreateFile(filePath);

    }
}
