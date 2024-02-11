import java.util.Scanner;
public class Sqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an positive integer to find SQRT:");
        int num = scanner.nextInt();
        System.out.println("SQRT="+Math.sqrt(num));
        //Sqrt calculates square root int default it returns in double
    }
}
