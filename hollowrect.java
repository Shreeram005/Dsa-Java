import java.util.*;
public class Hollowrect{
    public static void main(String arg[]){
    Scanner sc =new Scanner(System.in);
       System.out.print(" Enter the no. of rows : ");
    int n=sc.nextInt();
       System.out.print(" Enter the no of coloumns : ");
    int m=sc.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(i==n||j==m||i==1||j==1){
                System.out.print("*");

            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}
