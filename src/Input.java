import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        //String Input
        String name = scanner.nextLine();
        //Character Input
        //Take Only First Character from the given input
        System.out.println("What's your gender?");
        char gender = scanner.next().charAt(0);
        //Integer & Float Input
        System.out.println("Enter Your Age:");
        int age= scanner.nextInt();
        System.out.println("Enter Your marks:");
        float marks = scanner.nextFloat();
        //String Concatenation
        System.out.println("Hi "+ name + " of age " + age + ". You have scored " + marks + " marks");
        System.out.println("Gender: "+gender);
    }
}
