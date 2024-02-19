
import java.util.Scanner;
public class Scanners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //syntax of scanners oop

        System.out.println("What is your name? ");
        String name = scanner.nextLine(); //calling scanner next line

        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        scanner.nextLine(); //to remove error of buffer .. prev buffer value is \n

        System.out.println("Fav food? ");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("Your age is "+age+" Am I correct?"); //concanate two strings
        System.out.println("and you like "+food);
    }
}
