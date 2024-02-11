package fileHandling;
import java.nio.file.Paths;
import java.util.Scanner;
public class fileReadingScanner {
    public static void main(String[] args) {
        try(Scanner file=new Scanner(Paths.get("output.txt"))){
            while(file.hasNextLine()){
                String str= file.nextLine();
                if(str.isEmpty()){
                    continue;//To skip empty lines
                }
                System.out.println(str);
            }
        } catch(Exception e){
            System.out.println("File not found!!");
        }
    }
}
