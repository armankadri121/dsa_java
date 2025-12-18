public class left_rotate_by_one {
    // Brute Force
    // TC - O(n)
    // SC - O(n)
    public void leftRotateArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        for(int i=1; i<n; i++) {
            temp[i-1] = arr[i];
        }
        temp[n - 1] = arr[0];
        for(int t: temp) {
            System.out.print(t + " ");
        }
    }

    // Optimal Approach
    // TC - O(n)
    // SC - O(1)
    public void leftRotateOptimal(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for(int i=1; i<n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        
        for(int a: arr) {
            System.out.print(a + " ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        left_rotate_by_one lo = new left_rotate_by_one();
        // lo.leftRotateArray(arr);
        lo.leftRotateOptimal(arr);
    }
}
