import java.util.Scanner;
public class Positive_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            if (num < 0) {
                System.out.println("Unsuitable number");
                continue;
                //It takes the loop to beginning without executing other conditional statements
            }
            if (num == 0) {
                break;
                //Ends the loop
            }
            System.out.println((int) Math.pow(num, 2));
            //Math returns in double to get integer
        }
    }
}
