//print the square of numbers from 1 to n 

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number :  ");
        int num = sc.nextInt();
        square1toN(num);
    }

    public static void square1toN(int num) {
        if(num<=0){
            System.out.println("Invalid Input");
        }else{
            for(int i=1;i<=num;i++){
                System.out.println("square "+i+" : "+i*i);
            }
            
        }
    }
}