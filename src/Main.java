import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid" +
                "\nI was created in 2025. " +
                "\nPlease, remind me your name");

        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");

    }
}
