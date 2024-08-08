import java.util.*;
public class Sumofevenodd{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int sumofOdd=0;
        int sumofEven=0;
        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                sumofEven+=rem;

            }
            else{
                sumofOdd+=rem;

            }
            int quot=n/10;
            n=quot;

        }
        System.out.println("The sum of even digits are : "+ sumofEven);
          System.out.println("The sum of odd digits are : " +sumofOdd);
    }
}