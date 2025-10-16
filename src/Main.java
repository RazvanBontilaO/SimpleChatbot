import java.util.Scanner;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        boolean quizz = true;

        System.out.println("Hello! My name is Aid" +
                "\nI was created in 2025. " +
                "\nPlease, remind me your name");

        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
        System.out.println();

        System.out.println("Let me guess your age." +
                "\nEnter remainders of dividing your age by 3, 5 and 7");
        int r1, r2, r3;
        r1 = scanner.nextInt();
        r2 = scanner.nextInt();
        r3 = scanner.nextInt();
        int age = (r1 * 70 + r2 * 21 + r3 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");

        System.out.println();
        System.out.println("Now I will prove to you that I can count to any number you want. " +
                "\nPlease, enter a number:");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
            sleep(1000,1);
        }
        System.out.println();
        System.out.println("Let's test your programming knowledge.");
        while (quizz) {
            System.out.println("Why do we use methods?");
            System.out.println("""
                    1. To repeat a statement multiple times.\
                    
                    2. To decompose a program into several small subroutines.\
                    
                    3. To determine the execution time of a program.\
                    
                    4. To interrupt the execution of a program.""");
            int answer = scanner.nextInt();
            if (answer == 2) {
                System.out.println("Completed, have a nice day!");
                quizz = false;
            } else {
                System.out.println("Incorrect answer. Please, try again.");
            }
        }
        System.out.println();
        System.out.println("Congratulations, " + name + "! Have a nice day!");

        scanner.close();
    }
}
