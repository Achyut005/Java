import java.util.Scanner;

public class p15 {

    public static class Area
    {
        int area;
        int lenth,bread;
        Area(int l,int b)
        {
            lenth = l;
            bread = b;
        }
        int returnArea()
        {
            area = lenth * bread;
            return area;
        }
    }
    public static void main(String[] args) {
        int l,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter lenth : ");
        l = sc.nextInt();
        System.out.print("enter bread : ");
        b = sc.nextInt();
        Area o1 = new Area(l, b);
        System.out.println("area of rectangle : " + o1.returnArea());
        sc.close();
    }
}