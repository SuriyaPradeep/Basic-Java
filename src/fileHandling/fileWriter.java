package fileHandling;
// Creating a text File using FileWriter
import java.io.FileWriter;
import java.io.IOException;
public class fileWriter {
    public static void main(String[] args) throws IOException {
        String str="Hello World!!\nHey!!!\n\nHiii";
        // attach a file to FileWriter
        FileWriter fw=new FileWriter("output.txt");
        // read character wise from string and write
        // into FileWriter
        for(int i=0;i<str.length();i++){
            fw.write(str.charAt(i));
        }
        System.out.println("Writing successful");
        //close the file
        fw.close();
    }
}
