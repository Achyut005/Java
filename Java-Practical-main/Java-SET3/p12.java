import java.util.Scanner;

public class p12 {


    public static class convert {
        int ruppee,pound;
           void getdata()
           {
                Scanner sc = new Scanner(System.in);
                System.out.print("emter ammount in pounds :");
                pound = sc.nextInt();
                sc.close();
           }
           void putdata()
           {
                ruppee = pound*100;
                System.out.println("your ammount in ruppees :" + ruppee);
           }
    }


    public static void main(String[] args) {
        convert o1 = new convert();
        o1.getdata();
        o1.putdata();
    }
}