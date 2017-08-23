public class Solution {
    public int GetNumberOfK(int[] array, int k) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int count = 0, flag = 0;
        for (int i = 0; i < array.length; i++) {
            if (flag > 0) {
                break;
            }
            if (array[i] == k) {
                count++;
            }
        }
        return count;
    }
}