public class Solution {
    public int JumpFloorII(int target) {
        if (target < 3) {
            return target;
        }else {
            return (int) (Math.pow(2, target - 1));
        }
    }
}