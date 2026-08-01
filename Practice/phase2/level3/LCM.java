
// Find LCM of two numbers using loops. 
// 4 5 - 20 , 7 3 - 21 , 3 12 - 12
// LCM = (a × b) / HCF
import java.util.Scanner;

public class LCM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :  ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // System.out.println("LCM of "+num1+" "+num2+" "+findLCM(num1, num2));
        int HCF = findHCF(num1, num2);
        int findLCM = (num1 * num2) / HCF;
        if(HCF == -1){
            System.out.println("Invalid Input");
        }else{
            System.out.println("LCM of " + num1 + " and " + num2 + " : " + findLCM);
        }
    }

    public static int findHCF(int a, int b) {
        int min = 0; // finding max for loop iteration
        int divisior = 1;
        if (a >= 1 && b >= 1) {
            if (a > b) {
                min = b;
            } else {
                min = a;
            }
            // after max - checking hcf
            for (int i = 1; i <= min; i++) {
                if (a % i == 0 && b % i == 0) {
                    divisior = i;
                }
            }
            return divisior;
        } else {
            return -1;
        }
    }
}
