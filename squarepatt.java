import java.util.*;
public class Squarepatt{
    public static void main(String arg[]){ // sample pattern : n * n square pattern
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter a number to which pattern is printed : ");
         int n=sc.nextInt();
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
             System.out.println(" ");
         }
    }

}