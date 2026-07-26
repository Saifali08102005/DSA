// Take day and month and check if it forms 
// a valid calendar date (ignoring leap years).
/*
    input - -use codntion as per month day 
*/
import java.util.Scanner;

public class Calendar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day : ");
        int day = sc.nextInt();
        System.out.println("Enter Month : ");
        int month = sc.nextInt();
        checkCalendar(day, month);
    }
    public static void checkCalendar(int day,int month) {
        if((day>0 && day<=31) && (month<=12 && month>0)){
            if(month==2 && day<29 ){
                System.out.println("Valid Date");
            }else if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) && day<=31){
                System.out.println("Valid Date");
            }else if((month==4 || month==6 || month==9 || month==11) && day<=30){
                System.out.println("Valid date");
            }else{
                System.out.println("Invalid date");
            }
        }else{
            System.out.println("Enter Valid Day and Month");
        }
        
    }
}
