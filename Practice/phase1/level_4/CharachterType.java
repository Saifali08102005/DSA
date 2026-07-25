//Take a character and check if it is a letter, a digit, or neither. 
/*
Input - store in char___ sc.next().charAt(0);__ - convert into int - compare 
*/
import java.util.Scanner;

public class CharachterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int AsciVlaue=ch;
        checkType(AsciVlaue);
    }

    public static void checkType(int value) {
        if((value>=65 && value<=90) || (value>=97 && value<=122)){
            System.out.println("Letter");
        }else if((value>=48 && value<=57)){
            System.out.println("Digit");
        }else{
            System.out.println("Not a letter or Digit.");
        }
    }
}
