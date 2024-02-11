import java.util.Scanner;
public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the speed:");
        int speed = scanner.nextInt();
        if(speed>120){
            System.out.println("Speeding Ticket!!");
        }
    }
}
