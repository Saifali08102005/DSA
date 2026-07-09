/*
              * * * * *
            * * * * *
          * * * * *
        * * * * *
      * * * * *
*/
import java.util.Scanner;

public class Rhombus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        Rhombusp(n);
    }
    public static void Rhombusp(int n){
        for(int i=1;i<=n;i++){
            //space 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}