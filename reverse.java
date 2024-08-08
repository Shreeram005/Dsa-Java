import java.util.*;
public class Reverse{
    public static void main(String arg[]){
        // WAP to find the reverse of a number and also find the sum of its digits 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find its reverse : ");
        int n=sc.nextInt();
      int rem;
        int rev=0;
        int sum=0;
        while(n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n/=10;
            sum+=rem;
        }
        System.out.println("The reverse of the number is : "+rev);
        System.out.println("The sum of the digits is : "+sum);



    }
}