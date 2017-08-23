public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n == 0) {
            return 0;
        }
        int high, low, cur, tmp, i=1, total = 0;
        high = 1;
        while (high != 0) {
            high = n / (int)Math.pow(10, i);
            tmp = n % (int)Math.pow(10, i);
            cur = tmp / (int)Math.pow(10, i - 1);
            low = tmp % (int)Math.pow(10, i - 1);
            if (cur == 1){
                total += high * (int)Math.pow(10, i - 1) + low + 1;
            } else if (cur < 1) {
                total += high * (int)Math.pow(10, i - 1);
            } else {
                total += (high + 1) * (int)Math.pow(10, i - 1);
            }
            i++;
        }
        return total;
    }
}