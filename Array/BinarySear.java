// Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Works only on sorted arrays.
public class BinarySear {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 12, 18, 25, 31, 42, 56, 68, 79 };
        int key = 79;
        int result = BinarySearch(arr, key);
        if (result != -1) {
            System.out.println(key + " present at index : " + result);
        } else {
            System.out.println(key + " is not present in array.");
        }
    }

    public static int BinarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println(mid);
            if (key == arr[mid]) {
                return mid;
            } else if (arr[mid] > key) { // first half
                end = mid - 1;
            } else if (arr[mid] < key) { // second half
                start = mid + 1;
            }

        }
        return -1;
    }
}
