// import java.util.*;
// public class Prime{
//     public static void main(String arg[]){
//         // To check the number is prime or not
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number  :");
//         int num=sc.nextInt();
//         int i=2;
//         while(i<=num){
//             if(num%i!=0){
//                 System.out.println("The number is prime ");
//                 i++;

//             }
//             else if(num%i==0){
//                 System.out.println("The number is composite ");

//             }
//         }


//     }
// }
import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}
