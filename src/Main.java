import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid" +
                "\nI was created in 2025. " +
                "\nPlease, remind me your name\n");

        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");

        System.out.println("Let me guess your age." +
                "\nEnter remainders of dividing your age by 3, 5 and 7");
        int r1, r2, r3;
        r1 = scanner.nextInt();
        r2 = scanner.nextInt();
        r3 = scanner.nextInt();
        int age = (r1 * 70 + r2 * 21 + r3 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");


    }
}
