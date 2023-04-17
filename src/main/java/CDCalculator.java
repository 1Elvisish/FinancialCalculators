
import java.util.Scanner;
public class CDCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Get the deposit amount from the user
        System.out.print("Enter the deposit amount: ");
        double deposit = scanner.nextDouble();

        // Get the annual interest rate from the user
        System.out.print("Enter the annual interest rate (%): ");
        double interestRate = scanner.nextDouble() / 100;

        // Get the number of years the money will be invested for
        System.out.print("Enter the number of years the money will be invest: ");
        int years = scanner.nextInt();

        // Calculate the future value of the deposit
        double futureValue = deposit * Math.pow(1 + interestRate, years);

        // Display the future value to the user
        System.out.print("The futureValue of your deposit is: s%,2f", futureValue);
        System.out.println();
        System.out.printf("You have earned in interest: s%,2f", (futureValue * deposit));

    }
}
