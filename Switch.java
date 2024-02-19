import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any day NOTE: should have first letter in Capitals eg.Sunday ");
        String day = scanner.nextLine();

        switch (day){
            case "Sunday" :
                System.out.println("Its first day from week ");
                break; //used to terminate after matching case
            case "Monday" :
                System.out.println("Its second day from week ");
                break;
            case "Tuesday" :
                System.out.println("Its third day from week ");
                break;
            case "Wednesday" :
                System.out.println("Its fourth day from week ");
                break;
            case "Thursday" :
                System.out.println("Its fifth day from week ");
                break;
            case "Friday" :
                System.out.println("Its sixth day from week ");
                break;
            case "Saturday" :
                System.out.println("Its seventh day from week ");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
