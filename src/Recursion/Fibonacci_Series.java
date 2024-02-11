package Recursion;
import java.util.*;
public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to find Fibonacci Series:");
        int num=Integer.valueOf(scanner.nextLine());
        System.out.println("Fibonacci Series of number "+num+" is "+fibonacci(num));
    }
    public static int fibonacci(int num){
        if(num==1|| num==0){
            return num;
        }
        return fibonacci(num-1)+fibonacci(num-2);
    }
}
