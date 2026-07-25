//Take a number and print “Fizz” if divisible by 3, 
// “Buzz” if divisible by 5, and “FizzBuzz” if divisible by both
import java.util.*;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        checkFizzBuzz(num);
    }

    public static void checkFizzBuzz(int a) {
        if((a%3==0) && (a%5==0)){
            System.out.println("FizzBuzz");
        }else if(a%3==0){
            System.out.println("Fizz");
        }else if(a%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println("Given number is not divisible by both");
        }
    }

}
