// check number is palindrome or not
/* Reverse number then check are reverse and currNum are same*/
import java.util.Scanner;

public class Palindome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        if(reverseNum(num)==num){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
     private static int reverseNum(int num){
        int rev = 0;
        int i = 0;
        int cpy = num ;
        int digit = 0;
        while(cpy>0) {
            digit = cpy%10;
            rev = rev*10+digit;
            cpy/=10;
            i++;
        }
        return rev;
    }
}
