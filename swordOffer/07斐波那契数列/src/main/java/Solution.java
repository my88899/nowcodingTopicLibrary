public class Solution {
    public int Fibonacci(int n) {
        int f1 = 1, f2 = 1, f3 = 2;
        if (n == 0) {
            return 0;
        }else if (n < 3) {
            return 1;
        }
        n = n - 2;
        while(n != 0) {
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
            n--;
        }
        return f3;
    }
}