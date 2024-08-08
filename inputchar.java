import java.util.*;
public class inputchar{
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string ");
        String str=sc.nextLine();
        char ch=str.charAt(3);
        System.out.println("Your string is : " + str);
         System.out.println("Your character at index 3rd is  : " + ch);
        
        
    }
}