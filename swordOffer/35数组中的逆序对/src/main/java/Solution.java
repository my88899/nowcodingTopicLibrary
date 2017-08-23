public class Solution {
    public int InversePairs(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        int count = InversePairsSon(array, copy, 0, array.length - 1);
        return count;
    }

    private int InversePairsSon(int[] array, int[] copy, int low, int high) {
        if (low >= high) {
            return 0;
        }
        int mid = (low + high) >> 1;
        int countLeft = InversePairsSon(array, copy, low, mid);
        int countRight = InversePairsSon(array, copy, mid + 1, high);
        int i = mid, j = high, currp = high;
        int count = 0;
        while (i >= low && j > mid) {
            if (array[i] > array[j]) {
                count += j - mid;
                copy[currp--] = array[i--];
                if (count >= 1000000007) {
                    count %= 1000000007;
                }
            } else {
                copy[currp--] = array[j--];
            }
        }
        for (; i >= low; i--) {
            copy[currp--] = array[i];
        }
        for (; j > mid; j--) {
            copy[currp--] = array[j];
        }
        for (int k = low; k <= high; k++) {
            array[k] = copy[k];
        }
        return (count + countLeft + countRight) % 1000000007;

    }
}