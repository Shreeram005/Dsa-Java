import java.util.*;
public class Table{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the table to print : ");
        int n=sc.nextInt();
        int i=1;
        while(i<=10){
           int value=n*i;
            System.out.println(value);
            i++;

        }
    }
}