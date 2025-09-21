import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class classwork005 {
    public static void main(String[] args) throws IOException {
        // write
        FileWriter filehandle = new FileWriter("SampleFile.TXT", false);
        PrintWriter printLine = new PrintWriter(filehandle);
        String lineOFText = "qqq";
        printLine.printf("%s" + "%n", lineOFText);
        printLine.close();

        // read
        FileReader fileHandle = new FileReader("SampleFile.TXT");
        BufferedReader textReader = new BufferedReader(fileHandle);
        String LineOFText = textReader.readLine();
        System.out.println(LineOFText);
        textReader.close();

    }
}
