import java.util.Scanner;

public class OrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing the game .. now press q or Q to quite the game ");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) //logical or usage with equals utility
        {
            System.out.println("You quite the game ");
        }
        else
        {
            System.out.println("You are still playing hmmmmmm");
        }

        /*if (!response.equals("q") && !response.equals("Q"))
        {
            System.out.println("You are still in the game pewPew****");
        }
        else
        {
            System.out.println("You are out ");
        }*/
        // upper commented code is about using not case with logical ands
        scanner.close();

    }
}
