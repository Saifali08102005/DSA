import java.util.Scanner;
import java.math.*;
public class BintoDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(BintoDec(111));
    
    }
    public static int BintoDec(int num){
        int sum=0;
        int value=0;
        int i=0;
        while (num>0) {
            if(num%10==1){
                value=(int)Math.pow(2, i);
                sum+=value;
            }
            i++;
            num/=10;
        }
        return sum;
    }
}
