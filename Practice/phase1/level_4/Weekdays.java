// Take a weekday number (1–7) and determine if it is a weekday or weekend. 
//  if num 6 or 7 weekend else weekday
import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weekday number (1-7) : ");
        int num=sc.nextInt();
        if(num>0 && num<8){
            whichDay(num);
        }else{
            System.out.println("Invalid input! Enter a number between 1 and 7.");
        }
    }
    public static void whichDay(int n){
        if(n==7 || n==6){
            System.out.println("Weekend");
        }else{
            System.out.println("Weekday");
        }
    }
}
