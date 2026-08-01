// Print the reverse of a given number. 
/* take number use while loop 
    sotre rev = (rev*10)+currModulDigit
*/
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        System.out.println("Reverse of a number : "+reverseNum(num));
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
