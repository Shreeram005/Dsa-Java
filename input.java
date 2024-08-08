import java.util.Scanner;
public class input{
    public static void main(String arg[]){
        int a,b;
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
         a =sc.nextInt();
         System.out.println("Enter the second number");
         b=sc.nextInt();
         int c=a+b;
         System.out.print("The sum of two numbers are : ");
        System.out.print(c);

    }
}
