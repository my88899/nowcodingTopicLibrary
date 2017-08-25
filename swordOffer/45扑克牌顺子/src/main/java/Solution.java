public class Solution {
    public boolean isContinuous(int[] numbers) {
        if (numbers.length != 5) {
            return false;
        }
        int numMin = 13, numMax = 1;
        int[] a = new int[14];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0 && a[numbers[i]] != 0) {
                return false;
            }
            a[numbers[i]] += 1;
            if (numbers[i] == 0) {
                continue;
            }
            numMin = numMin < numbers[i] ? numMin : numbers[i];
            numMax = numMax > numbers[i] ? numMax : numbers[i];
        }
        if (numMax - numMin >= 5 || a[0] >= 5) {
            return false;
        }
        return true;
    }
}