class print {
    static int cnt = 5;

    static void printCnt() {
        if (cnt == 0) return; // base condition
        System.out.println(cnt);
        cnt--;
        
        printCnt();
        System.out.println(cnt);
        cnt++;
        
    }

    static void printName(String name, int n) {
        if(n == 0) return;
        System.out.println("Hi " + name + " how are you doing...?");
        printName(name, n-1);
    }

    static void printOneToN (int n) {
        if(n == 0) return;
        printOneToN(n-1);
        System.out.println(n);
    }

    static void printNToOne (int n) {
        if(n == 0) return;
        System.out.println(n);
        printNToOne(n-1);
        
    }

    static void sumOfN(int n, int sum) {
        if(n < 0) {
            System.out.println(sum);
            return;
        }
        // int sum 
        sumOfN(n-1, sum+n);
    }

    static void factorialOfN(int n, int fact) {
        if(n == 0) {
            System.out.println(fact);
            return;
        }
        factorialOfN(n-1, fact*n);
    }

    static void reverseArray(int arr[], int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start+1, end-1);
        }
    }

    static void printArray(int arr[], int end) {
        for(int i=0; i<=end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        String name = "Arman";
        int [] arr = {1,2,3,4,5};
        // printCnt();
        // printName(name, 5);
        // printOneToN(5);
        // printNToOne(5);
        // sumOfN(5, 0);
        // factorialOfN(5, 1);
        // reverseArray(arr, 0, 4);
        // printArray(arr, 4);
    }
}