import java.util.*;
public class Trianglepatt{
    public static void main(String agr[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows to print : ");
         int n= sc.nextInt();
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* "); // stars pattern
            }
            System.out.println(" ");
         }
    }
}