public class Solution {
    final int[] d = {2, 3, 5};

    public int GetUglyNumber_Solution(int index) {
        if (index < 7) {
            return index;
        }
        int[] a = new int[index];
        int[] p = {0, 0, 0};
        int[] num = {2, 3, 5};
        int i = 1;
        a[0] = 1;
        while (i < index) {
            int tempI = minOfThree(num[0], num[1], num[2]);
            if (a[i - 1] < num[tempI]) {
                a[i++] = num[tempI];
            }
            p[tempI]++;
            num[tempI] = a[p[tempI]] * d[tempI];
        }
        return a[i - 1];
    }

    private int minOfThree(int num2, int num3, int num5) {
        int num = Math.min(num2, Math.min(num3, num5));
        return num == num2 ? 0 : num == num3 ? 1 : 2;
    }
}