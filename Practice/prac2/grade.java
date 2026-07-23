// Take marks (0–100) and print the corresponding grade (A/B/C/D/F). 
public class grade{
    public static void main(String args[]){
        char ch=checkgrade(60);
        if(ch!='E'){
            System.out.println("Grade : "+ch);
        }else{
            System.out.println("Invalid input");
        }
    }
    public static char checkgrade(int marks){
        if(marks>90 && marks<=100){
            return 'A';
        }else if(marks>80 && marks<=90){
            return 'B';
        }else if(marks>70 && marks<=80){
            return 'C';
        }else if(marks>60 && marks<=70){
            return 'D';
        }else if(marks<=60 && marks>=0){
            return 'F';
        }else{
            return 'E';
        }
    }
}