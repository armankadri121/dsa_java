import java.util.*;
import java.util.concurrent.Flow.Subscriber;
public class PascalTriangle {

    public void findElement(int row, int col) {
        int n = row - 1;
        int r = col - 1;
        int result = 1;
        for(int i=0; i<r; i++) {
            result = result * (n-i);
            result = result / (i+1);
        }
        System.out.println(result);
    }

    public void printNthRow(int n) {
        int ans = 1;
        System.out.print(ans + " ");
        for(int i=1; i<n; i++) {
            ans = ans * (n-i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
    }

    public static List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for(int i=1; i<row; i++) {
            ans = ans * (row - i);
            ans = ans / i;
            ansRow.add((int) ans);
        }

        return ansRow;
    }

    public static List<List<Integer>> printPascalTriangle(int n) {
        List<List<Integer>> triangle = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            triangle.add(generateRow(i));
        }

        return triangle;
    }

    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        List<List<Integer>> result = printPascalTriangle(5);

        for(List<Integer> row: result) {
            System.out.println(row);
        }

        // pt.findElement(5, 3);
        // pt.printNthRow(5);
        
    }   
}
