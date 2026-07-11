// Reverse an Array
// Time Complexity: O(n)
// Space Complexity: O(1)
// Approach: Two Pointers + Swapping
public class ReverseArr {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 12, 18, 25, 31, 42, 56, 68, 79 };
        System.out.println("Original array : ");
        PrintArr(arr);
        System.out.println("Reverse array : ");
        Reverse(arr);
        PrintArr(arr);
    }

    public static void Reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
