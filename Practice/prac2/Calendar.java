// Take a month number (1–12) and print the number of days in that month (ignore
// leap years).
import java.util.*;

public class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month in range (1-12) : ");
        int num = sc.nextInt();
        DayofMonth(num);
    }

    public static void DayofMonth(int num){
            if(num==1 || num==3 || num==5 || num==7 || num==8 || num==10 || num==12){
                System.out.println("Day : 31");
            }else if(num==2){
                System.out.println("Day : 28");
            }else if(num==4 || num==6 || num==9 || num==11){
                System.out.println("Day : 30");
            }else{
            System.out.println("Invalid Input");
        }
    }
}