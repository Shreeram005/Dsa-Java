import java.util.*;
public class Charpatt{ // visit again

    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the character which you want to print: ");
        char a=sc.next().charAt(0);
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(a);
                a++;
            }
            System.out.println(" ");
        }
        

        }
    }
