public class Solution {
    public int JumpFloor(int target) {
        int f1 = 1, f2 = 1;
        if (target <= 1) {
            return target;
        }else {
            while (target > 1) {
                f2 += f1;
                f1 = f2 - f1;
                target --;
            }
            return f2;
        }
    }
}