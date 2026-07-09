//Q : check if a number is prime or not
import java.util.Scanner;
import java.math.*;

public class isPrime {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int num = sc.nextInt();
       isPrime(num);

   }

   public static void isPrime(int n) {
      if (n <= 1) {
         System.out.println(n + " is not a prime , nor a composite number");
         return;
      } else {
         int sqrt = (int) Math.sqrt(n);
         for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
               System.out.println(n + " is not a prime number");
               return;
            }
         }
      }
      System.out.println(n + " is a prime number");
   }

}
