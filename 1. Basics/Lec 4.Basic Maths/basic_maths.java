class basic_maths {
    public static void main(String[] args) {
        int n = 12112344;
        int a = 5;
        int b = 15;
        

        
        basic_maths bt = new basic_maths();
        // bt.count_digits(n);
        // bt.reverse_number(n);
        // bt.check_palindrome(n);
        // bt.gcd(a, b);
        bt.gcd_better(a, b);
    }

    public void count_digits(int n) {
        // Optimal Approach TC-> 0(1)
        int cnt2 = (int)(Math.log10(n) + 1);
        System.out.println(cnt2);

        // Brute force approach TC-> 0(n)
        int cnt = 0;
        while (n > 0) {
            cnt++;
            n = n / 10;
        }
        System.out.println(cnt);
    }

    public void reverse_number(int n) {
        int a = 0;
        while (n > 0) {
            int lastDigt = n % 10;
            a = (a * 10) + lastDigt;
            n /= 10;
        }
        System.out.println(a);
    }

    public void check_palindrome(int n) {
        int rev_num = 0;
        int dup = n;
        while (n > 0) {
            int lastDigt = n % 10;
            rev_num = (rev_num * 10) + lastDigt;
            n /= 10;
        }
        if(dup == rev_num) System.out.println("Its a palindrome " + dup);
        else System.out.println("It's not a palindrome " + dup);
    }

    public void gcd(int a, int b) {
        int ans = 1;
        for(int i=1; i<=Math.min(a, b); i++) {
            if(a % i == 0 && b % i == 0) {
                ans = i;
            }
        }
        System.out.println("The GCD for " + a + " and " + b + " is " + ans);
    }

    public void gcd_better(int a, int b) {
        int ans = 1;
        for(int i= Math.min(a, b); i>0; i--) {
            if (a % i == 0 && b % i == 0) {
                ans = i;
                break;
            }
        }
        System.out.println("For " + a + " and " + b + " gcd is " + ans);
    }
}