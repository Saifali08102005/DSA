// Count the number of digits in a given number.
/* if 0 input - 1 output
    use do-while
*/ 
import java.util.Scanner;

public class coutDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        System.out.println("Digits in "+num+"  :  "+countDigit(num));
        System.out.println("Digits in "+num+"  :  "+Sirway(num));
    }   
    public static int countDigit(int num) {
        int count = 0 ;
        int value = Math.abs(num);
        while (value>0) {
            value/=10;
            count++;
        }
        return count;
    } 
    public static int Sirway(int num){
            int count =0;
            int value = Math.abs(num);
            do{
                count++;
                value/=10;
            }while(value>0);
            return count;
    }
}
