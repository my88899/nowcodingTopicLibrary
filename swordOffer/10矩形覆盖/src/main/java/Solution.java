public class Solution {
    public int RectCover(int target) {
        if(target <= 2) {
            return target;
        }else {
            int f1 = 2, f2 = 3;
            while (target > 3) {
                f2 += f1;
                f1 = f2 - f1;
                target--;
            }
            return f2;
        }
    }
}