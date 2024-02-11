import java.util.Scanner;
public class Arithmetic_Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num1 = scanner.nextInt();
        System.out.print("Enter a number:");
        int num2 = scanner.nextInt();
        System.out.println(num1+"+"+num2+"="+(num1+num2));
        System.out.println(num1+"-"+num2+"="+(num1-num2));
        System.out.println(num1+"*"+num2+"="+(num1*num2));
        //If we take input as integer we need to add float to not round-off the value
        System.out.println(num1+"/"+num2+"="+((float)num1/(float)num2));
        System.out.println(num1+"%"+num2+"="+(num1%num2));
        System.out.println("The Average of 2 numbers is "+(float)(num1+num2)/2);

    }
}
