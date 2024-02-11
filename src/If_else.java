import java.util.Scanner;
public class If_else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("To check whether the given number is ODD or EVEN:");
        System.out.println("Enter a integer");
        int num = scan.nextInt();
        if(num%2!=0){
            System.out.println("The given number is ODD");
        }else{
            System.out.println("The given number is EVEN");
        }
    }
}
