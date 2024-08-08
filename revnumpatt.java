import java.util.*;
public class Revtripatt{
    public static void main(String agr[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows to print : ");
         int n= sc.nextInt();
         for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j); // reverse numbers pattern
            }
            System.out.println(" ");
         }
    }
}