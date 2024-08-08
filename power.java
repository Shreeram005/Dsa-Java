import java.util.*;
public class Power{
    public static void main(String arg[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the base  : ");
     int b=sc.nextInt();
       System.out.print("Enter the power  : ");
     int p=sc.nextInt();
     int var=1;
     for(int i=1;i<=p;i++){
        var*=b;

     }
     
     System.out.println(var);
    }

}


