import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row;
        int column;
        String symbol = "";

        System.out.println("Enter the # of rows ");
        row = scanner.nextInt();
        System.out.println("Enter the # of columns ");
        column = scanner.nextInt();
        System.out.println("Enter the symbol you want to print now ");
        symbol = scanner.next();

        for(int i=1; i<=row; i++)
        {
            System.out.println();
            for (int j=1; j<=column; j++)
            {
                System.out.print(symbol);
            }
        }
    }
}
