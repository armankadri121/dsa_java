public class check_if_array_is_sorted {

    // Brute Force
    // TC - O(n^2)
    // SC - O(1)
    public boolean checkSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // If any element is smaller than the previous one, return false
                if (arr[j] < arr[i]) 
                    return false;
            }
        }
        return true;
    }

    // Optimal Approach
    // TC - O(n)
    // SC - O(1)
    public boolean checkSortOptimal(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        check_if_array_is_sorted cs = new check_if_array_is_sorted();
        // boolean ans = cs.checkSort(arr);
        // System.out.println(ans);

        boolean ansOpt = cs.checkSortOptimal(arr);
        System.out.println(ansOpt);
    }
}
