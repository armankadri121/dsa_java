public class rotate_array_by_k_places {
    // Brute Force
    // SC - O(n)
    // TC - O(n)
    public void rotateArray(int[] arr, int k, int n) {
        k = k % n;
        int[] temp = new int[k];
        // put k number of elements in temp array
        for(int i = n - k; i<n; i++) {
            temp[i-n+k] = arr[i];
        }

        // shift n-k element to right in array
        for(int i=n-1; i>=k; i--) {
            arr[i] = arr[i-k]; 
        }

        for(int i=0; i<k; i++) {
            arr[i] = temp[i];
        }

        for(int a: arr) {
            System.out.print(a + " ");
        }
    }
    public void reverseArray(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotateArrayOptimal(int[] arr, int n, int k) {
        k = k % n;
        reverseArray(arr, 0, n-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);
        for(int a: arr) {
            System.out.print(a+ " ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        rotate_array_by_k_places rp = new rotate_array_by_k_places();
        // rp.rotateArray(arr, 2, arr.length);
        rp.rotateArrayOptimal(arr, arr.length, 2);

        
    }
}
