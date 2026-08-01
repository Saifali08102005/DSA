
//check number is prime or not
// Print Prime Numbers (1–100)
/*
    take square root of num - use loop from 2 to square root number 
    and check is it divisible.
*/
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range for print prime : ");
        int num = sc.nextInt();
        PrimeRange(num);
    }

    public static boolean checkPrime(int num) {
        int value = Math.abs(num);
        boolean isPrime = true;
        if (value == 1 || value == 0) {
            System.out.println(num + " is not prime or nor a composite.");
        } else {
            for (int i = 2; i <= Math.sqrt(value); i++) {
                if ((value % i == 0)) {
                    isPrime = false;
                }
            }
        }
        return isPrime;
    }

    public static void PrimeRange(int num){
         for(int i=2;i<=num;i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
        }

}
