package phase1.level2_3;
// Check whether a number is a perfect square 
// (without using the square root function).
/*
Generate i*i
Compare with number
*/

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Square : ");
        int n=sc.nextInt();
        checkPerfectSquare(n);
    }

    public static void checkPerfectSquare(int num) {
        int squareValue = 1;
        int i = 1;
        while (squareValue <=num) {
            if(squareValue==num){
                System.out.println("Perfect Square");
                return;
            }
            i++;
            squareValue = i * i;
        }
        System.out.println("Not a Perfect Square");
        
    }
}
