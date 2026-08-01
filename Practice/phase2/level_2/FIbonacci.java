// Print sum of first n terms of Fibonacci series.
// do variable first =0 and second =1 agar 
//check num<=0 invalid 
// check num ==1 , num==0 then print sum elses 
// use for loop - add sum -first = second  ,  second = sum , finSum+=sum;
import java.util.Scanner;

public class FIbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        sumFibonacci(num);
    }
    public static void sumFibonacci(int num){
        int sum = 0;
        int first = 0;
        int second = 1;
        int finSum=1;
        if(num<=0){
            System.out.println("Invalid input");
        }else if(num == 1){
            System.out.println("Sum : "+first);
        }else if (num == 2){
            System.out.println("Sum : "+second);
        }else{
        for(int i=3;i<=num;i++){
            sum=first+second;
            first=second;
            second=sum;
            finSum+=sum;
        }
        System.out.println(finSum);
    }
    }
}