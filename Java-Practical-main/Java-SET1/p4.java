import java.util.Scanner;
public class p4 {
        public static void main(String[] args)
        {
          Scanner input = new Scanner(System.in);
          System.out.println("Enter the numbers of days  :");
          int days = input.nextInt();
          double[] exp = new double[days];
          for(int i=0;i<days;i++)
          {
            System.out.println("Enter the Expense for day "+ (i+1));
            exp[i] = input.nextInt();
          }
          double ans = calculateTotalExpenses(exp,days);
          System.out.println("Your Total expense is : " + ans);
          input.close();

        }
        static double calculateTotalExpenses(double expense[],int days)
        {
            double sum = 0;
          for(int i=0;i<days ; i++){
          sum = sum + expense[i];
          }
          return sum;
        }
}
