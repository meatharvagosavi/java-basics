import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age here before proceed ..");
        int age = scanner.nextInt();

        if(age>=18){
            System.out.println("you are adult to proceed further");
        }
        else{
            System.out.println("you are underage");
        }
    } // we can use else if as well to check multiple conditions
}
