public class pra1 {
    public static void main(String[] args) {
        checkChar('|');
        checkChar('9');
        checkChar('a');
        checkChar('A');
    }
    public static void checkNum(int n){
        if(n==0){
            System.out.println("0 is not a negative or positive.");
        }else if(n>0){
            System.out.println(n+" is a Positive Number.");
        }else{
            System.out.println(n+" is negative number.");
        }
    }
    public static void isOddEven(int n) {
        if (n==0) {
            System.out.println("0 is not Even or Odd.");
        }
        else if(n%2==0){
            System.out.println(n+" is Even Number.");
        }else{
            System.out.println(n+" is Odd number");
        }
    }
    public static void isLeap(int year) {
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year+" is a Leap Year.");
        }else{
            System.out.println(year+" is not a Leap Year.");
        }
    }
    public static void largestinThree(int a, int b, int c) {
       if(a>b && a>c){
                System.out.println(a+" is largest number.");
       }else if(b>a && b>c){
            System.out.println(b+" is largest number.");
       }else{
            System.out.println(c+" is largest number.");
       }
    }
    public static void checkTem(int temp) {
        if(temp<20){
            System.out.println("COLD");
        }else if(temp>=20 && temp<30){
            System.out.println("WARM");
        }else{
            System.out.println("HOT");
        }
    }
    public static void checkChar(char ch) {
        int cha=ch;
        if(cha>=65 && cha<=90){
            System.out.println("Uppercase");
        }else if(cha>=97 && cha<=122){
            System.out.println("Lowercasae");
        }else if(cha>=48 && cha<=57){
            System.out.println("Digit");
        }else{
            System.out.println("Special charachter");
        }
    }
}