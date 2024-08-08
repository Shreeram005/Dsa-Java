import java.util.*;
public class Evenodd{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number ");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println( a + " is even " );

        }
        else{
            System.out.println( a + " is odd  ");
        }



    }
}