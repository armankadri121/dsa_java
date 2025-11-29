import java.util.*;

public class SetMatrix {

    public void setZeroesBrute(int[][] matrix) {
        int m = matrix.length;

        int n = matrix[0].length;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 0) {

                    for(int col=0; col<n; col++) {
                        if(matrix[i][col] != 0) matrix[i][col] = -1;
                    }

                    for(int row=0; row<m; row++) {
                        if(matrix[row][j] != 0) matrix[row][j] = -1;
                    }
                }
            }
        }

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == -1) matrix[i][j] = 0;
            }
        }

    }

    public void setZeroesBetter(int[][] matrix) {
        int m = matrix.length; // Length of rows

        int n = matrix[0].length;  // lenght of columns

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Next iteration for marking the row's and columns which are true to zero

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void setZeroesOptimal(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        // col = matrix[0][..]
        // row = matrix[..][0]

        int col0 = 1;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 0) {
                    // marting ith row
                    matrix[i][0] = 0;

                    // marking jth col
                    if(j != 0) {
                        matrix[0][j] = 0;
                    }
                    else {
                        col0 = 0;
                    }
                }
            }
        }

        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                if(matrix[i][j] != 0) {
                    if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if(matrix[0][0] == 0) {
            for(int j=0; j<n; j++) matrix[0][j] = 0;
        }

        if(col0 == 0) {
            for(int i=0; i<m; i++) matrix[i][0] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,0,6}, {7,8,9}};

        SetMatrix st = new SetMatrix();
        // st.setZeroesBrute(matrix);
        // st.setZeroesBetter(matrix);
        st.setZeroesOptimal(matrix);

        for(int[] row: matrix) {
            for(int val: row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
