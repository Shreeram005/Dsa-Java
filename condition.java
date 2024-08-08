import java.util.*;
public class Condition{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("A is greater ");
        }
        
         if(b>a){
            System.out.println("B is greater  ");
         }
         else{
            
            System.out.println("Both a and b are equal");

         }

        

    }

}