import java.util.*;
public class p5 {
    public static void main(String[] args)
    
    {
        Scanner input = new Scanner(System.in);
        System.out.println("This is the elctric appliance shop bill.\nPlease enter the number of items you want to buy :\n");
        int num = input.nextInt();
        int[] items = new int[num];
        double sum = 0;
        float[] price = new float[5];
        for(int i=0;i<num;i++){
        
        System.out.println("1. Motor\n2. fan\n3. tube\n4. wires\n5. Other items.");
        items[i] = input.nextInt();
        switch (items[i]) {
            case 1:
            System.out.println("Enter the price of Motor : ");
            price[items[i]]= input.nextInt();
            price[items[i]] += price[items[i]]*0.08;
            sum += price[items[i]];
            
            break;

            case 2:
            System.out.println("Enter the price of Fan : ");
            price[items[i]] = input.nextInt();
            price[items[i]] += price[items[i]]*0.12;
            sum += price[items[i]];
        
            break;

            case 3:
            System.out.println("Enter the price of Tube : ");
            price[items[i]] = input.nextInt();
            price[items[i]] += price[items[i]]*0.05;
            sum += price[items[i]];
            
            break;

            case 4:
            System.out.println("Enter the price of Wires : ");
            price[items[i]] = input.nextInt();
            price[items[i]] += price[items[i]]*0.075;
            sum += price[items[i]];
            
            break;

            case 5:
            System.out.println("Enter the price of Other items : ");
            price[items[i]] = input.nextInt();
            price[items[i]] += price[items[i]]*0.03;
            sum += price[items[i]];
            
            break;
            default : 
            System.out.println("Please enter valid number");
            num++;
            sum =0;
            break;    
        }
        
        }
        for(int i=1;i<=5;i++)
        {
             if (price[i] != '0') 
             {
                switch (i) {
                    case 1:
                    System.out.println("Motor      : "+ price[1]);  
                    break;

                    case 2:
                    System.out.println("fan        : "+ price[2]);  
                    break;

                    case 3:
                    System.out.println("Tube       : "+ price[3]);  
                    break;

                    case 4:
                    System.out.println("Wires      : "+ price[4]);  
                    break;

                    case 5:
                    System.out.println("Other items: "+ price[5]);  
                    break;
                
                    default:
                        break;
                }
             }
             else
             continue;
        }
                    System.out.println("TOTAL      : " + sum);
        input.close();
    }

}
