// Find the largest element in an array
// Time Complexity: O(n)
// Space Complexity: O(1)
public class Largestval {
    public static void main(String[] args) {
        int arr[] = {98, 12, 67, 43, 5, 76, 21};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Max element of array : "+max);
    }    
}
