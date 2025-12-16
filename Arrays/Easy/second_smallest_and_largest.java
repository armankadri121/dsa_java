import java.util.*;

public class second_smallest_and_largest {

    // Brute Force
    // TC - O(nlogn)
    // SC - O(1)
    public void sortArray(int[] arr) {
        Arrays.sort(arr);
        if(arr.length-1  == 0 || arr.length-1 == 1) {
            System.out.println("Second small is -1 and second large is -1");
            return;
        }
        int secondSmall = arr[1];
        int secondLarge = arr[arr.length-1];
        System.out.println("Second smallest element is: " + secondSmall + " and second largest is: " + secondLarge);
    
    }


    // Better Approach
    // TC - O(n)
    // SC - O(1)

    public void getElements(int[] arr, int n) {

        // Edge case
        if (n == 0 || n == 1) {
            System.out.println("-1 -1");
            return;
        }

        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        // Find smallest and largest
        for (int i = 0; i < n; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }

        // Find second smallest and second largest
        for (int i = 0; i < n; i++) {

            if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }

            if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }
        }

        System.out.println("Second smallest is " + secondSmall);
        System.out.println("Second largest is " + secondLarge);
    }


    // Optimal Approach
    // TC - O(n)
    // SC - O(1)
    public void getElementsOptimal(int[] arr, int n) {

        // Edge case
        if (n == 0 || n == 1) {
            System.out.println("-1 -1");
            return;
        }

        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        // Find smallest and largest
        for (int i = 0; i < n; i++) {
            if(arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            }
            else if(arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }

        // Find second smallest and second largest
        for (int i = 0; i < n; i++) {

            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            }
            else if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }
        }

        System.out.println("Second smallest is " + secondSmall);
        System.out.println("Second largest is " + secondLarge);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 5};

        second_smallest_and_largest sl = new second_smallest_and_largest();
        // sl.sortArray(arr);
        // sl.getElements(arr, arr.length);
        sl.getElementsOptimal(arr, arr.length);
    }
}