import java.util.*;
public class p2 {
    public static void main(String[] args) 
    {
  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your current balance: $");
        double currentBalance = scanner.nextDouble();
        System.out.println("Your current balance is: $" + currentBalance);
        scanner.close();
    }
}