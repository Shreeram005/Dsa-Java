import java.util.*;
public class Totalsalary{
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the basic salary : ");
        int basic=sc.nextInt();
        System.out.println("Enter the grade ( Only uppercase allowed ) : "); 
        char grade=sc.next().charAt(0);
        int hra= (20*basic)/100;
        int da=(50*basic)/100;
        int pf=(11*basic)/100;
        int allow;
        if(grade=='A'){
            allow=1700;
        }
          if(grade=='B'){
            allow=1500;
        }
        else{
            allow=1300;
        }
        int total_salary=basic+hra+da+allow-pf;
        System.out.println("The total salary is :" + total_salary);


        


    }
}