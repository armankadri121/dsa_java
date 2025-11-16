public class patterns {
    public static void main(String[] args) {
        patterns pt = new patterns();
        // pt.pattern1(5);        
        // pt.pattern2(5);
        // pt.pattern3(5);
        // pt.pattern4(5);
        // pt.pattern5(5);        
        // pt.pattern6(5);
        // pt.pattern7(5);
        // pt.pattern8(5);
        // pt.pattern9(5);
        // pt.pattern10(5);
        // pt.pattern11(5);
        // pt.pattern12(5);
        // pt.pattern13(5);
        // pt.pattern14(5);
        // pt.pattern15(5);    
        // pt.pattern16(5);  
        // pt.pattern17(5);   
        // pt.pattern18(5); 
        // pt.pattern19(5); 
        pt.pattern20(4); 
    }

    public void pattern1(int n) {
        for (int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
   
    public void pattern2(int n) {
        for (int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void pattern3(int n) {
        for (int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void pattern4(int n) {
        for (int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void pattern5(int n) {
        for (int i=0; i<n; i++) {
            for(int j=n; j>i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void pattern6(int n) {
        for (int i=0; i<n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void pattern7(int n) {
        for (int i=0; i<n; i++) {
            // space
            for(int j=0; j<n-i-1; j++) {
                System.out.print("  ");
            }

            //stars
            for(int k=0; k < 2*i+1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void pattern8(int n) {
        
        for (int i=0; i<n; i++) {
            //space
            for(int k=0; k < i; k++) {
                System.out.print("  ");
            }

            // stars
            for(int j=0; j<2*n -(2*i + 1); j++) {
                System.out.print("* ");
            }

            
            System.out.println("");
        }
        System.out.println("");
    }

    public void pattern9(int n) {
        for (int i=0; i<n; i++) {
            // space
            for(int j=0; j<n-i-1; j++) {
                System.out.print("  ");
            }

            //stars
            for(int k=0; k < 2*i+1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        for (int i=0; i<n; i++) {
            //space
            for(int k=0; k < i; k++) {
                System.out.print("  ");
            }

            // stars
            for(int j=0; j<2*n -(2*i + 1); j++) {
                System.out.print("* ");
            }

            
            System.out.println("");
        }
        System.out.println("");
    }

    public void pattern10(int n) {
        for(int i=1; i<=2*n-1; i++) {
            //for stars
            if(i <= n ) {
                for(int j=0; j<i; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }

            if(i > n) {
                for(int k=0; k<2*n-i; k++) {
                System.out.print("* ");
                }
                System.out.println("");
            }
        }
    }

    public void pattern11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if(i%2 == 0) start = 1;
            else start = 0;
            for(int j=0; j<=i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println("");
        }
    }

    public void pattern12(int n) {
        
        for(int i=1; i<=n; i++) {
            // numbers
            for(int j=1; j<=i; j++) {
                System.out.print(j + "  ");
            }
            
            // space 
            for(int k=1; k<= (n*2)- (2*i); k++) {
                System.out.print("   ");
            }

            // numbers
            for(int l=n; l>=n-i+1; l--) {
                System.out.print( l + "  ");
            }

            System.out.println("");
        } 
    }

    public void pattern13(int n) {
        int count = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println("");
        }
    }

    public void pattern14(int n) {
        for(int i=0; i<n; i++) {
            for(char ch = 'A'; ch<= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println("");
        }
    }

    public void pattern15(int n) {
        for(int i=0; i<n; i++) {
            for(char ch = 'A'; ch<= 'A' + (n-i-1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println("");
        }
    }

    public void pattern16(int n) {
        for(int i = 0; i<n; i++) {
            for(int j = 0; j <=i; j++) {
                System.out.print((char)(int) ('A'+ i) + " ");
            }
            System.out.println("");
        }
    }

    public void pattern17(int n) {
        for(int i = 0; i<n; i++) {
            // spaces
            for(int j=0; j<n-i-1; j++) {
                System.out.print("  ");
            }
            
            // characters
            char ch = 'A';
            int breakpoint = (2*i+1) / 2;
            for(int k = 1; k <= 2*i+1; k++) {
                // System.out.print((char)(int) ('A'+ i) + " ");
                System.out.print(ch + " ");
                if(k <= breakpoint) ch++;
                else ch--;
            }
            System.out.println("");
        }
    }

    public void pattern18(int n) {
        for(int i = 1; i<=n; i++) {
            // characters
            char ch = (char)(int) ('A' + n - i);
            for(int j = 0; j < i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println("");
        }
    }

    public void pattern19(int n) {
        //upper part
        for(int i = 0; i<n; i++) {
            // stars
            for(int j = 0; j<n-i; j++) {
                System.out.print("* ");
            }

            //space
            for(int k=0; k<2*i; k++) {
                System.out.print("  ");
            }

            //stars
            for(int l=n; l>=i+1; l--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        //lower part
        for(int i = 0; i<n; i++) {
            // stars
            for(int j = 0; j<=i; j++) {
                System.out.print("* ");
            }

            //space
            for(int k=0; k<2*n-(2*i+2); k++) {
                System.out.print("  ");
            }

            //stars
            for(int l=0; l<=i; l++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void pattern20(int n) {
        //upper part
        for(int i = 0; i<n; i++) {
            // stars
            for(int j = 0; j<=i; j++) {
                System.out.print("* ");
            }

            // space
            for(int k=0; k<(2*n)-(2*i+2); k++) {
                System.out.print("  ");
            }

            //stars
            for(int l=0; l<=i; l++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        //lower part
        for(int i = 1; i<=n-1; i++) {
            // stars
            for(int j = 1; j<=n-i; j++) {
                System.out.print("* ");
            }

            //space
            for(int k=1; k<=2*i; k++) {
                System.out.print("  ");
            }

            //stars
            for(int l=1; l<=n-i; l++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
