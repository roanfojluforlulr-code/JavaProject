import java.io.*;

public class FILE {

    // create file
    public static void CreateNewFile(String FilePath) {
        File file = new File(FilePath);
        try {
            if (file.createNewFile()) {
                System.out.println("The file name is: " + file.getName());
            } else {
                System.out.println("The file is exist");
            }
        } catch (IOException e) {
            System.out.println("Error while creating file:" + e.getMessage());
        }
    }

    // write file
    public static void WriteFile(String FilePath, String content) {
        try (FileWriter writer = new FileWriter(FilePath)) {
            writer.write(content);
            System.out.println("Have been written into");
        } catch (IOException e) {
            System.out.println("Error while writing file" + e.getMessage());
        }
    }

    // read file
    public static void ReadFile(String FilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FilePath))) {
            String line;
            System.out.println("The file content are:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading file" + e.getMessage());
        }
    }

    public static void main(String arg[]) {
        String FilePath = "work.txt";
        CreateNewFile(FilePath);
        System.out.println();
        String content = "Hello, this is the first line of the file.\nHere is the second line.\n";
        WriteFile(FilePath, content);
        System.out.println();
        ReadFile(FilePath);
    }
}
