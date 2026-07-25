// Take coordinates (x, y) and check if the point lies on
//  the X-axis, Y-axis, or at the origin
//  check origin then x and y if not then else conditon
public class coordinates{
    public static void main(String[] args) {
        checkCord(5, 0);
        checkCord(0, 7);
        checkCord(5, 5);
        checkCord(0, 0);
    }
    public static void checkCord(int x , int y) {
        if(x==0 && y==0){
            System.out.println("Origin");
        }else if(y==0){
            System.out.println("X axis");
        }else if(x==0){
            System.out.println("Y axis");
        }else{
            System.out.println("Point is not on X-axis or Y-axis.");
        }
    }
}