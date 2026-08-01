// is Number is Armstrong number 
// Armstrong number 153 - 1^(size of number) + 5^(size of number) + 3^(size of number) = 153 == 153 ? Armstrong : Not a Armstrong 


import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        System.out.println((checkArmstrong(num))?"Armstrong":"Not a Armstrong");
    }
    public static boolean checkArmstrong(int num){
        int value = Math.abs(num);
        int value2 = value;
        int digit = 0 ;
        int sum = 0;
        int power = countDigit(value);
        while (value>0) {
            digit = value % 10 ;
            value /= 10;
            sum = sum + (int)(Math.pow(digit, power));
        }
        System.out.println(sum);
        return sum==value2;
    }
    public static int countDigit(int num){
            int count =0;
            int value = Math.abs(num);
            do{
                count++;
                value/=10;
            }while(value>0);
            return count;
    }
}
