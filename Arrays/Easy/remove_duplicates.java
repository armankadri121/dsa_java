import java.util.HashSet;

class remove_duplicates {

    //Brute Force Approach 
    // TC - O(nlogn) + N
    // SC - O(n)
    public HashSet<Integer> removeDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        int index = 0;
        for(int num: arr) {
            if(!seen.contains(num)) {
                seen.add(num);
                arr[index] = num;
                index++;
            }   
        }
        return seen;
    }

    // Optimal Approach
    // TC- O(n)
    // SC- O(1)
    public int[] removeOptimal(int[] arr) {
        int index = 0;
        for(int j=1; j<arr.length; j++) {
            if(arr[j] != arr[index]) {
                index++;
                arr[index] = arr[j];               
            }
            arr[j] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,5,5,6,7,7,9};
        remove_duplicates rd = new remove_duplicates();

        // HashSet<Integer> ans = rd.removeDuplicates(arr);
        // System.out.println(ans);

        int[] ans = rd.removeOptimal(arr);
        for(int a: ans) {
            System.out.print(a + " ");
        }

    }
}