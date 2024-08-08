import java.util.*;
public class Factor{
    public static void main(String arg[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a number : ");
     int n=sc.nextInt();
    
     for(int i=2;i<n;i++){
        int r=n%i;
        
        if(r==0){
            System.out.println(i);

        }
       
     }

     

    }
}