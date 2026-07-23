// Maximum Subarray Sum (Brute Force)
// Time Complexity: O(n^3)
// Space Complexity: O(1)
public class SubArMax {
    public static void main(String[] args) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int arr[]={1, -2, 6, -1, 3};
         for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum=0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum+=arr[k];
                }
                System.out.print("  , sum : "+sum);
                if(max<sum){
                    max=sum;
                }
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println(max);
    }
}
