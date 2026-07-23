/*
    Prefix Sum Concept

    prefix[i] = Sum of elements from index 0 to i

    Subarray Sum:
    -> If start == 0
       sum = prefix[end]

    -> Otherwise
       sum = prefix[end] - prefix[start - 1]

    Trick:
    Total till End - Total before Start
*/
public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        System.out.println("Origional Array : ");
        PrintArr(arr);
        System.out.println("Prefix Array : ");
        PrintArr(prefix);
        int cursum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                cursum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
            }
            System.out.println("Sum : " + cursum);
            if (cursum > max) {
                max = cursum;
            }
        }
        System.out.println(max);
    }

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
