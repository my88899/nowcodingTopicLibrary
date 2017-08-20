public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length <= 0) {
            return 0;
        }
        int maxArraySum = array[0];
        int curArraySum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || curArraySum <= 0) {
                curArraySum = array[i];
            } else {
                curArraySum += array[i];
            }
            if (maxArraySum < curArraySum) {
                maxArraySum = curArraySum;
            }
        }
        return maxArraySum;
    }
}