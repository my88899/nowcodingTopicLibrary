public class Solution {
    public int NumberOf1(int n) {
        int num = 0;
        if(n < 0) {
            n = n & 0x7FFFFFFF;
            num++;
        }
        while(n==1 || n/2 != 0) {
            if(n % 2 == 1){
                num++;
            }
            n = n >> 1;
        }
        return num;
    }
}