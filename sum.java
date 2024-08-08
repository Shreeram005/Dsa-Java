import java.util.*;
public class Sum{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int sum=0;
       for(int i=0;i<=num;i++){
            sum=sum+i;

        }
        System.out.println("The sum upto " + num + " is =  " + sum );



    }
}