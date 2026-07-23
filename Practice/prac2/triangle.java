public class triangle{
    public static void main(String[] args) {
        checkTriangle(5, 6, 8);
        checkTriangle(5, 5, 9);
        checkTriangle(5, 5, 5);
        checkTriangle(2, 4, 9);

    }
    public static void checkTriangle(int side1, int side2, int side3) {
        // Triangle tabhi banega jab koi bhi ek side, baaki do sides ke sum se chhoti ho.
        //Equilitral - Teeno sides equal.
        //Isocales - Sirf 2 sides equal.
        // Scalene - Koi bhi side equal nahi.
        if((side1+side2)>side3 && (side1+side3)>side2 && (side2+side3)>side1){
            System.out.println("Valid Triangle");
            if(side1==side2 && side1==side3){
                System.out.println("Given Triangle is Equilateral Triangle.");
            }else if(side1==side2 || side2==side3 || side1==side3){
               System.out.println("Given Triangle is Isosceles Triangle.");
            }else{
                System.out.println("Given Triangle is Scalene Triangle.");
            }
        }else{
              System.out.println("InValid Triangle.");
        }
        
    }
}
