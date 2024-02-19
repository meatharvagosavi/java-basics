import java.util.Scanner;

public class And {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature ");
        int temp = scanner.nextInt();

        if(temp>35)
        {
            System.out.println("Its hot outside ");
        }
        else if (temp>=20 && temp<=35) // using logical and operator
        {
            System.out.println("Its warm here ");
        }
        else
        {
            System.out.println("Its cold now ");
        }
        scanner.close();
    }
}
