// Take three numbers and check if they are in arithmetic progression. 
// curNum - prevNum = diff (Need same for all)

import java.util.Scanner;

public class Airthmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        checkAirth(a, b, c);
    }
    public static void checkAirth(int a , int b , int c) {
        int diff1 = b - a;
        int diff2 = c - b;
        System.out.println(diff1 +" "+diff2);
        if(diff2 == diff1){
            System.out.println("Given number are in Airthmetic progression .");
        }else{
            System.out.println("Given number are not in Airthmetic progression .");        }
    }
}
