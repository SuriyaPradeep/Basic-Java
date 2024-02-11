import java.util.Scanner;
public class String_comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Password:");
        String pass = scanner.nextLine();
        /*In java to compare string we can't use '=='
        str1==str2
        We use an inbuilt function .equals to compare 2 string
        str1.equals(str2)
         */
        if(pass.equals("N@rutoUchih@")){
            System.out.println("Welcome");
        } else{
            System.out.println("Wrong Password");
        }
    }
}
