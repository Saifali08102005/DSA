//  Print all factors of a given number. 
// factor - 12 - 1 2 3 4 6 12 

import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        findFactor(num);
    }
    public static void findFactor(int n ){
        int value = Math.abs(n);
        System.out.println("Factor of "+value+" : ");
        for(int i=1;i<=value;i++){
            if(value%i==0){
                System.out.print(" "+i);
            }
        }
    }
}
