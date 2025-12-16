import java.sql.Time;
import java.util.*;

class largest_element_in_array{

    // Brute Force
    //Time Complexity: O(N log N), where N is the size of the array, as we are sorting the array.
    //Space Complexity: O(1), as we are using a constant
    public int sortArr(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);
        
        // Return the last element (largest element) after sorting
        return arr[arr.length - 1];
    }

    public static int findLargestElement(int[] arr, int n) {
        int max = arr[0];  // Initialize max with the first element in the array

        // Iterate through the array to find the maximum element
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {  // If the current element is greater than max, update max
                max = arr[i];
            }
        }

        return max;  // Return the largest element found
    }


    public static void main(String[] args) {
        // Initialize arrays
        int[] arr1 = {2, 5, 1, 3, 0};
        int[] arr2 = {8, 10, 5, 7, 9};
        largest_element_in_array lr = new largest_element_in_array();
        
        // Find and output the largest element in both arrays
        System.out.println("The Largest element in the array is: " + lr.sortArr(arr1));
        System.out.println("The Largest element in the array is: " + lr.sortArr(arr2));

        int max = lr.findLargestElement(arr2, arr2.length);
        System.out.println("The Largest element in the array is: " + max);
    }

}