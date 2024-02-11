package Recursion;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to find factorial:");
        int num=Integer.valueOf(scanner.nextLine());
        System.out.println("Factorial of number "+num+" is "+fact(5));
    }
    public static int fact(int num){
        if(num==1){
            return 1;
        }
        return num*fact(num-1);
    }
}
