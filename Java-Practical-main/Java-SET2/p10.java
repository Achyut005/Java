import java.util.*;
public class p10 {
public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a string : ");
   String s = sc.next();
   System.out.println("Length of the string is : "+ s.length());
   System.out.println("Lower case String : " + s.toLowerCase() );
   System.out.println("Upper case String : "+ s.toUpperCase());
   String originalString = s;
   StringBuilder reversedBuilder = new StringBuilder(originalString);
   String reversedString = reversedBuilder.reverse().toString();
   System.out.println("Reversed string: " + reversedString);

   char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println("Sorted string: " + sortedString);
   sc.close();
   }
}