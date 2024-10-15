import java.util.InputMismatchException;
import java.util.Scanner;

public class p24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first integer (x): ");
            int x = scanner.nextInt();
            System.out.print("Enter the second integer (y): ");
            int y = scanner.nextInt();
            int result = x / y;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        } finally {
            scanner.close();
        }
    }
}
