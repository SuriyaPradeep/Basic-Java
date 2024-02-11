package Todo;

import java.util.Scanner;

public class UserInterface {

    private final TodoList list;
    private final Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        label:
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "stop":
                    break label;
                case "add":
                    System.out.print("To add: ");
                    String task = scanner.nextLine();
                    list.add(task);
                    break;
                case "list":
                    list.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    int number = Integer.parseInt(scanner.nextLine());
                    list.remove(number);
                    break;
            }
        }
    }
}

