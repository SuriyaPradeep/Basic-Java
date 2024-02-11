package fileHandling;
import java.io.FileReader;
import java.io.IOException;
public class fileReader {
    public static void main(String[] args) throws IOException {
        // variable declaration
        int ch;

        // check if File exists or not
        FileReader fr=null;
        try
        {
            fr = new FileReader("output.txt");
        }
        catch (Exception e)
        {
            System.out.println("File not found");
        }

        // read from FileReader till the end of file
        //fr.read gives ascii values
        while ((ch=fr.read())!=-1)
            System.out.print((char)ch);

        // close the file
        fr.close();
    }
}
