// Linear Search
// Time Complexity: O(n)
// Space Complexity: O(1)
// Works on both sorted and unsorted arrays.
public class LinearSear {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 8, 10, 12, 14, 16 };
        int key = 14;
        int result = linearSearch(key, arr);
        if (result != -1) {
            System.out.println(key + " present at index : " + result);
        } else {
            System.out.println(key + " is not present in array.");
        }

    }

    public static int linearSearch(int key, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i + 1;
            }
        }
        return -1;
    }
}
