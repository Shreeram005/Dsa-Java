import java.util.*;
public class input1{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the name ");    
         String str=sc.next();
          System.out.println("Enter marks  M1: ");

          int a=sc.nextInt();
         System.out.println("Enter marks  M2: ");
          
          int b=sc.nextInt();
           
         System.out.println("Enter marks  M3: ");
          int c=sc.nextInt();
          int avg=(a+b+c)/3;
          System.out.println("Your avg score is : " +avg);

     // compact form of above code

    //  char name=sc.next().charAt(0);
    //  int m1,m2,m3;
    //  m1=sc.nextInt();
    //   m2=sc.nextInt();
    //    m3=sc.nextInt();
    //    int  avg = (m1+m2+m3)/3;
    //    System.out.println(name);
    //    System.out.println(avg);

     }
}











